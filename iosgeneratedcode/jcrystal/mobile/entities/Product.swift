import Foundation
import jCrystaliOSLib
class Product: ProductNormal{
	fileprivate var _id : Int64?
	fileprivate var _name : String?
	fileprivate var _description : String?
	fileprivate var _category : Int64 = Int64()
	fileprivate var _price : Double = 0
	fileprivate var _discount : Double = 0
	fileprivate var _oldPrice : Double = 0
	fileprivate var _color : Int64 = Int64()
	fileprivate var _size : Int64 = Int64()
	fileprivate var _image : String?
	
	public func id()->Int64? {return self._id}
	public func id(val : Int64?){self._id = val}
	public func name()->String? {return self._name}
	public func name(val : String?){self._name = val}
	public func description()->String? {return self._description}
	public func description(val : String?){self._description = val}
	public func category()->Int64 {return self._category}
	public func category(val : Int64){self._category = val}
	public func price()->Double {return self._price}
	public func price(val : Double){self._price = val}
	public func discount()->Double {return self._discount}
	public func discount(val : Double){self._discount = val}
	public func oldPrice()->Double {return self._oldPrice}
	public func oldPrice(val : Double){self._oldPrice = val}
	public func color()->Int64 {return self._color}
	public func color(val : Int64){self._color = val}
	public func size()->Int64 {return self._size}
	public func size(val : Int64){self._size = val}
	public func image()->String? {return self._image}
	public func image(val : String?){self._image = val}
	init(){
	}
	class MapList{
		static func ByCategory(_ a : [ProductNormal]) -> Dictionary<Int, ProductNormal>{
			return Dictionary(a.map({($0.category()!.id, $0)}), uniquingKeysWith : { (first, _) in first })
		}
		static func ByColor(_ a : [ProductNormal]) -> Dictionary<Int, ProductNormal>{
			return Dictionary(a.map({($0.color()!.id, $0)}), uniquingKeysWith : { (first, _) in first })
		}
		static func BySize(_ a : [ProductNormal]) -> Dictionary<Int, ProductNormal>{
			return Dictionary(a.map({($0.size()!.id, $0)}), uniquingKeysWith : { (first, _) in first })
		}
	}
	class Group{
		static func ByCategory(_ a : [ProductNormal]) -> Dictionary<Int, [ProductNormal]>{
			return Dictionary(grouping: a, by: {$0.category()!.id})
		}
		static func ByColor(_ a : [ProductNormal]) -> Dictionary<Int, [ProductNormal]>{
			return Dictionary(grouping: a, by: {$0.color()!.id})
		}
		static func BySize(_ a : [ProductNormal]) -> Dictionary<Int, [ProductNormal]>{
			return Dictionary(grouping: a, by: {$0.size()!.id})
		}
	}
}
class SerializerProduct{
	public static func fromJson(_ json : [String: AnyObject]) -> Product{
		let ret = Product()
		if let numberVal = json["id"] as? NSNumber {
			ret._id = numberVal.int64Value
		}
		else{
			ret._id = Int64(json["id"] as? String ?? "0")
		}
		ret._name = json["name"] as? String
		ret._description = json["description"] as? String
		if let _category = json["category"] as? Int {
			ret._category = Categories.fromId(_category)
		}
		ret._price = json["price"] as? Double ?? 0.0
		ret._discount = json["discount"] as? Double ?? 0.0
		ret._oldPrice = json["oldPrice"] as? Double ?? 0.0
		if let _color = json["color"] as? Int {
			ret._color = Color.fromId(_color)
		}
		if let _size = json["size"] as? Int {
			ret._size = Size.fromId(_size)
		}
		ret._image = json["image"] as? String
		return ret
	}
	public static func listFromJson(_ json : [[String: AnyObject]]) -> [Product]{
		var ret = [Product]()
		for e in 0 ..< json.count{
			ret.append(fromJson(json[e]))
		}
		return ret
	}
	public static func toJson(_ _pw : OutputStream, objeto : Product){
		_pw.print("{");
		_pw.print("\"price\":", objeto._price);
		_pw.print(",\"discount\":", objeto._discount);
		_pw.print(",\"oldPrice\":", objeto._oldPrice);
		if let val3 = objeto._id {
			_pw.print(",\"id\":", val3);
		}
		if let val4 = objeto._name {
			_pw.print(",\"name\":", jsonQuote(val4));
		}
		if let val5 = objeto._description {
			_pw.print(",\"description\":", jsonQuote(val5));
		}
		if let val6 = objeto._category {
			_pw.print(",\"category\":", val6.id);
		}
		if let val7 = objeto._color {
			_pw.print(",\"color\":", val7.id);
		}
		if let val8 = objeto._size {
			_pw.print(",\"size\":", val8.id);
		}
		if let val9 = objeto._image {
			_pw.print(",\"image\":", jsonQuote(val9));
		}
		_pw.print("}");
	}
	public static func toJsonProduct(_ _pw : OutputStream, lista : [Product]){
		_pw.print("[");
		var p : Bool = false
		for valor in lista{
			if p {_pw.print(",");}
			SerializerProduct.toJson(_pw, objeto: valor);
			p = true;
		}
		_pw.print("]");
	}
	public static func toJsonObject(objeto : Product) -> [String:Any]{
		var __ret : [String:Any] = [String:Any]()
		if let val0 = objeto._id {
			__ret["id"] = val0;
		}
		if let val1 = objeto._name {
			__ret["name"] = val1;
		}
		if let val2 = objeto._description {
			__ret["description"] = val2;
		}
		if let val3 = objeto._category {
			__ret["category"] = val3.id;
		}
		__ret["price"] = objeto._price;
		__ret["discount"] = objeto._discount;
		__ret["oldPrice"] = objeto._oldPrice;
		if let val7 = objeto._color {
			__ret["color"] = val7.id;
		}
		if let val8 = objeto._size {
			__ret["size"] = val8.id;
		}
		if let val9 = objeto._image {
			__ret["image"] = val9;
		}
		return __ret;
	}
	public static func toJsonArray(_ lista:[Product])->[[String:Any]]{
		var __ret : [[String:Any]] = [[String:Any]]()
		for valor in lista{
			__ret.append(SerializerProduct.toJsonObject(objeto: valor))
		}
		return __ret;
	}
	public static func fromJsonNormal(_ json : [String: AnyObject]) -> Product{
		let ret = Product()
		if let numberVal = json["id"] as? NSNumber {
			ret._id = numberVal.int64Value
		}
		else{
			ret._id = Int64(json["id"] as? String ?? "0")
		}
		ret._name = json["name"] as? String
		ret._description = json["description"] as? String
		if let _category = json["category"] as? Int {
			ret._category = Categories.fromId(_category)
		}
		ret._price = json["price"] as? Double ?? 0.0
		ret._discount = json["discount"] as? Double ?? 0.0
		ret._oldPrice = json["oldPrice"] as? Double ?? 0.0
		if let _color = json["color"] as? Int {
			ret._color = Color.fromId(_color)
		}
		if let _size = json["size"] as? Int {
			ret._size = Size.fromId(_size)
		}
		ret._image = json["image"] as? String
		return ret
	}
	public static func listFromJsonNormal(_ json : [[String: AnyObject]]) -> [ProductNormal]{
		var ret = [ProductNormal]()
		for e in 0 ..< json.count{
			ret.append(fromJsonNormal(json[e]))
		}
		return ret
	}
	static let CREATOR = {(_ json: [String: AnyObject])->(Product) in 
		return SerializerProduct.fromJson(json)
	}
}
