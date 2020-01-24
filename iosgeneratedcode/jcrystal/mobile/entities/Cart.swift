import Foundation
import jCrystaliOSLib
class Cart: CartNormal{
	fileprivate var _id : Int64?
	fileprivate var _items : List = List()
	fileprivate var _subtotal : Double = 0
	fileprivate var _total : Double = 0
	fileprivate var _favorites : List = List()
	
	public func id()->Int64? {return self._id}
	public func id(val : Int64?){self._id = val}
	public func items()->List {return self._items}
	public func items(val : List){self._items = val}
	public func subtotal()->Double {return self._subtotal}
	public func subtotal(val : Double){self._subtotal = val}
	public func total()->Double {return self._total}
	public func total(val : Double){self._total = val}
	public func favorites()->List {return self._favorites}
	public func favorites(val : List){self._favorites = val}
	init(){
	}
	class MapList{
	}
	class Group{
	}
}
class SerializerCart{
	public static func fromJson(_ json : [String: AnyObject]) -> Cart{
		let ret = Cart()
		if let numberVal = json["id"] as? NSNumber {
			ret._id = numberVal.int64Value
		}
		else{
			ret._id = Int64(json["id"] as? String ?? "0")
		}
		if let _Arrayitems = json["items"] as? [Int64]{
			ret._items = _Arrayitems
		}
		else{
			ret._items = [Int64]()
		}
		ret._subtotal = json["subtotal"] as? Double ?? 0.0
		ret._total = json["total"] as? Double ?? 0.0
		if let _Arrayfavorites = json["favorites"] as? [Int64]{
			ret._favorites = _Arrayfavorites
		}
		else{
			ret._favorites = [Int64]()
		}
		return ret
	}
	public static func listFromJson(_ json : [[String: AnyObject]]) -> [Cart]{
		var ret = [Cart]()
		for e in 0 ..< json.count{
			ret.append(fromJson(json[e]))
		}
		return ret
	}
	public static func toJson(_ _pw : OutputStream, objeto : Cart){
		_pw.print("{");
		_pw.print("\"subtotal\":", objeto._subtotal);
		_pw.print(",\"total\":", objeto._total);
		if let val2 = objeto._id {
			_pw.print(",\"id\":", val2);
		}
		var val3 : List = objeto._items
		_pw.print(",\"items\":", jsonQuote(val3));
		var val4 : List = objeto._favorites
		_pw.print(",\"favorites\":", jsonQuote(val4));
		_pw.print("}");
	}
	public static func toJsonCart(_ _pw : OutputStream, lista : [Cart]){
		_pw.print("[");
		var p : Bool = false
		for valor in lista{
			if p {_pw.print(",");}
			SerializerCart.toJson(_pw, objeto: valor);
			p = true;
		}
		_pw.print("]");
	}
	public static func toJsonObject(objeto : Cart) -> [String:Any]{
		var __ret : [String:Any] = [String:Any]()
		if let val0 = objeto._id {
			__ret["id"] = val0;
		}
		var val1 : List = objeto._items
		__ret["items"] = val1
		__ret["subtotal"] = objeto._subtotal;
		__ret["total"] = objeto._total;
		var val4 : List = objeto._favorites
		__ret["favorites"] = val4
		return __ret;
	}
	public static func toJsonArray(_ lista:[Cart])->[[String:Any]]{
		var __ret : [[String:Any]] = [[String:Any]]()
		for valor in lista{
			__ret.append(SerializerCart.toJsonObject(objeto: valor))
		}
		return __ret;
	}
	public static func fromJsonNormal(_ json : [String: AnyObject]) -> Cart{
		let ret = Cart()
		if let numberVal = json["id"] as? NSNumber {
			ret._id = numberVal.int64Value
		}
		else{
			ret._id = Int64(json["id"] as? String ?? "0")
		}
		if let _Arrayitems = json["items"] as? [Int64]{
			ret._items = _Arrayitems
		}
		else{
			ret._items = [Int64]()
		}
		ret._subtotal = json["subtotal"] as? Double ?? 0.0
		ret._total = json["total"] as? Double ?? 0.0
		if let _Arrayfavorites = json["favorites"] as? [Int64]{
			ret._favorites = _Arrayfavorites
		}
		else{
			ret._favorites = [Int64]()
		}
		return ret
	}
	public static func listFromJsonNormal(_ json : [[String: AnyObject]]) -> [CartNormal]{
		var ret = [CartNormal]()
		for e in 0 ..< json.count{
			ret.append(fromJsonNormal(json[e]))
		}
		return ret
	}
	static let CREATOR = {(_ json: [String: AnyObject])->(Cart) in 
		return SerializerCart.fromJson(json)
	}
}
