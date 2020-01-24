import Foundation
import jCrystaliOSLib
public class AbsDefaultManager{
	static let BASE_URL = "http://localhost:8080"
	var formData = false
	var boundary = ""
	var type = RequestType.GET
	var headers : [String:String] = [:]
	var onError : (RequestError)->()
	var url : String
	var contentURL : URL!
	var makeBody : ((OutputStream, AbsDefaultManager) -> ())?
	init(url : String, onError : @escaping (RequestError)->()){
		self.onError = onError
		self.url = url
	}
	func doFormData() -> AbsDefaultManager{
		formData = true
		self.boundary = "Boundary-\(UUID().uuidString)"
		return self
	}
	func doRequest(){
		let ruta = AbsDefaultManager.BASE_URL + url
		if DEBUG {print( type.rawValue + ruta) }
		let requestURL: URL = URL(string: ruta)!
		let urlRequest: NSMutableURLRequest = NSMutableURLRequest(url: requestURL)
		urlRequest.setValue("application/json", forHTTPHeaderField: "Accept")
		urlRequest.httpMethod = type.rawValue
		for (key, value) in headers{
			urlRequest.setValue(value, forHTTPHeaderField: key)
		}
		let session = URLSession.shared
		if type.isPost {
			if formData {
				urlRequest.setValue("multipart/form-data; boundary=---------------------------"+boundary, forHTTPHeaderField: "Content-Type")
			}
			else{
				urlRequest.setValue("application/json", forHTTPHeaderField: "Content-Type")
			}
			contentURL = URL(fileURLWithPath: NSTemporaryDirectory()).appendingPathComponent(UUID().uuidString)
			let _pw = OutputStream(url: contentURL!, append: false)!
			_pw.open()
			if let bodyMaker = makeBody {
				bodyMaker(_pw, self)
			}
			_pw.close()
			if DEBUG{try? print("CONTENT: \(String(contentsOf: contentURL))")}
			let task = session.uploadTask(with: urlRequest as URLRequest, fromFile: contentURL, completionHandler:{(data, response, error) in 
				self.completationHandler(data : data, response : response, error : error)
			})
			task.resume()
		}
		else{
			let task = session.dataTask(with: urlRequest as URLRequest, completionHandler:{(data, response, error) in 
				self.completationHandler(data : data, response : response, error : error)
			})
			task.resume()
		}
	}
	func completationHandler(data : Data?, response : URLResponse?, error : Error?){
		if let httpResponse = response as? HTTPURLResponse {
			let statusCode = httpResponse.statusCode
			DispatchQueue.main.async(execute: {
				if statusCode >= 200 && statusCode <= 299 {
					if let data = data {
						if DEBUG{print(NSString(data: data, encoding: String.Encoding.utf8.rawValue) ?? "Unparsable Error")}
						self.getResponse(data)
					}
				}
				else{
					if let data = data {
						if DEBUG{print(NSString(data: data, encoding: String.Encoding.utf8.rawValue) ?? "Unparsable Error")}
						self.onError(RequestError(tipoError: TipoError.SERVER_ERROR, mensaje: String(data: data, encoding: String.Encoding.utf8) ?? "Unparsable Error"))
					}
					else{
						self.onError(RequestError(tipoError: TipoError.SERVER_ERROR, mensaje: "Error en conexiÃ³n al servidor"))
					}
				}
			})
		}
		else{
			DispatchQueue.main.async(execute: {
				self.onError(RequestError(tipoError: TipoError.NO_INTERNET, mensaje: nil))
			})
		}
	}
	deinit{
		if let contUrl = contentURL {
			DispatchQueue.global(qos: .utility).async { [contentURL = self.contentURL] in
				try? FileManager.default.removeItem(at: contUrl)
			}
		}
	}
	public class StringResp : AbsDefaultManager{
		var onResponse : (String)->()
		init(url : String, onResponse : @escaping (String)->(), onError : @escaping (RequestError)->()){
			self.onResponse = onResponse
			super.init(url : url, onError : onError)
		}
		override func getResponse(_ data : Data){
			self.onResponse(String(data: data, encoding: String.Encoding.utf8)  ?? "")
		}
	}
	public class JSONObjectResp : AbsDefaultManager{
		var onResponse : ([String: AnyObject])->()
		init(url : String, onResponse : @escaping ([String: AnyObject])->(), onError : @escaping (RequestError)->()){
			self.onResponse = onResponse
			super.init(url : url, onError : onError)
		}
		override func getResponse(_ data : Data){
			do{
				let result = try JSONSerialization.jsonObject(with: data, options: []) as! [String: AnyObject]
				let success = result["success"] as? Int ?? 1
				if success == 1 {
					self.onResponse(result)
					return;
				}
				if success == 2 {
					self.onError(RequestError(codigo: (result["code"] as? Int) ?? 0, mensaje: result["mensaje"] as? String))
					return;
				}
				if success == 3 {
					self.onError(RequestError(tipoError: TipoError.UNAUTHORIZED, mensaje: result["mensaje"] as? String))
					return;
				}
				self.onError(RequestError(tipoError: TipoError.SERVER_ERROR, mensaje: result["mensaje"] as? String))
				return;
			}
			catch{
				self.onError(RequestError(tipoError: TipoError.FAIL, mensaje: "\(error)"))
			}
		}
	}
	public class JSONArrayResp : AbsDefaultManager{
		var onResponse : ([[String: AnyObject]])->()
		init(url : String, onResponse : @escaping ([[String: AnyObject]])->(), onError : @escaping (RequestError)->()){
			self.onResponse = onResponse
			super.init(url : url, onError : onError)
		}
		override func getResponse(_ data : Data){
			do{
				let result = try JSONSerialization.jsonObject(with: data, options: []) as! [[String: AnyObject]]
				let success = 1
				if success == 1 {
					self.onResponse(result)
					return;
				}
			}
			catch{
				self.onError(RequestError(tipoError: TipoError.FAIL, mensaje: "\(error)"))
			}
		}
	}
	func getResponse(_ resp : Data){
	}
	func authorization(_ authorization : String) -> AbsDefaultManager{
		self.headers["Authorization"] = authorization
		return self
	}
	func header(_ key : String, _ value : String) -> AbsDefaultManager{
		self.headers[key] = value
		return self
	}
	func doGet(){
		self.type = .GET
		self.doRequest()
	}
	func doPost(makeBody : @escaping (OutputStream, AbsDefaultManager) -> ()){
		self.makeBody = makeBody
		self.type = .POST
		DispatchQueue.main.async{
			self.doRequest()
		}
	}
	func doPut(makeBody : @escaping (OutputStream, AbsDefaultManager) -> ()){
		self.makeBody = makeBody
		self.type = .PUT
		DispatchQueue.main.async{
			self.doRequest()
		}
	}
	func doDelete(){
		self.type = .DELETE
		self.doRequest()
	}
	func doPatch(makeBody : @escaping (OutputStream, AbsDefaultManager) -> ()){
		self.makeBody = makeBody
		self.type = .PATCH
		DispatchQueue.main.async{
			self.doRequest()
		}
	}
}
