import Foundation
import jCrystaliOSLib
class DBProduct{
	static func retrieve(_ key: String)-> Product!{
		return retrieve(nil, key)
	}
	@discardableResult static func store(_ key: String, _ value: Product)-> Bool{
		return store(nil, key, value)
	}
	@discardableResult static func store(_ key: String, _ values: [Product])-> Bool{
		return store(nil, key, values)
	}
	@discardableResult static func retrieveList(_ key: String)-> [Product]! {return DBUtils.retrieveList(nil, key, SerializerProduct.CREATOR)}
	@discardableResult static func retrieveList(_ partKey: String!, _ key: String)-> [Product]! {return DBUtils.retrieveList(partKey, key, SerializerProduct.CREATOR)}
	@discardableResult static func deleteFromList(_ partKey: String!, _ key: String, _ filter : (Product) -> Bool) -> [Product]{
		if let _list = DBProduct.retrieveList(partKey, key){
			let newList = _list.filter({!filter($0)})
			DBUtils.store(partKey: partKey, key: key, values: newList, storer: {SerializerProduct.toJson($0, objeto: $1 as! Product)})
			return newList
		}
		return [Product]()
	}
	@discardableResult static func deleteFromList(_ key: String, _ filter : (Product) -> Bool)-> [Product]! {return DBProduct.deleteFromList(nil, key, filter)}
	@discardableResult static func store(_ partKey: String!, _ key: String, _ value: Product)->Bool{
		return DBUtils.store(partKey: partKey, key : key) { (outputstream) in
			SerializerProduct.toJson(outputstream, objeto : value)
		}
	}
	@discardableResult static func store(_ partKey : String!, _ key: String, _ values: [Product]) -> Bool{
		return DBUtils.store(partKey : partKey, key : key, values : values, storer : {SerializerProduct.toJson($0, objeto: $1 as! Product)})
	}
	@discardableResult static func storeNormal(_ key: String, _ value: ProductNormal)-> Bool{
		return store(nil, key, value as! Product)
	}
	@discardableResult static func storeNormal(_ key: String, _ values: [ProductNormal])-> Bool{
		return storeNormal(nil, key, values)
	}
	@discardableResult static func retrieveListNormal(_ key: String)-> [ProductNormal]! {return DBUtils.retrieveList(nil, key, SerializerProduct.CREATOR)}
	@discardableResult static func retrieveListNormal(_ partKey: String!, _ key: String)-> [ProductNormal]! {return DBUtils.retrieveList(partKey, key, SerializerProduct.CREATOR)}
	@discardableResult static func deleteFromListNormal(_ partKey: String!, _ key: String, _ filter : (ProductNormal) -> Bool) -> [ProductNormal]{
		if let _list = DBProduct.retrieveList(partKey, key){
			let newList = _list.filter({!filter($0)})
			DBUtils.store(partKey: partKey, key: key, values: newList, storer: {SerializerProduct.toJson($0, objeto: $1 as! Product)})
			return newList
		}
		return [ProductNormal]()
	}
	@discardableResult static func deleteFromListNormal(_ key: String, _ filter : (ProductNormal) -> Bool)-> [ProductNormal]! {return DBProduct.deleteFromListNormal(nil, key, filter)}
	@discardableResult static func store(_ partKey: String!, _ key: String , _ value: ProductNormal) -> Bool{
		return store(partKey, key, value as! Product)
	}
	@discardableResult static func storeNormal(_ partKey : String!, _ key: String, _ values: [ProductNormal]) -> Bool{
		return DBUtils.store(partKey : partKey, key : key, values : values, storer : {SerializerProduct.toJson($0, objeto: $1 as! Product)})
	}
	@discardableResult static func appendToList(_ partKey: String!, _ key: String, _ value: Product)-> Bool{
		if let outputstream = DBUtils.getOutputStream(partKey, "L" + key, append: true) {
			outputstream.open()
			let coma = [UInt8](",".utf8)
			outputstream.write(coma, maxLength: coma.count)
			SerializerProduct.toJson(outputstream, objeto : value)
			outputstream.close()
			return true
		}
		return false
	}
	static func retrieve(_ partKey: String!, _ key: String)-> Product!{
		return DBUtils.retrieve(partKey: partKey, key: key, converter: SerializerProduct.fromJson)
	}
	static func retrieveList<T>(_ key: String, _ creator: (_ json : [String: AnyObject]) -> T)-> [T]!{return DBUtils.retrieveList(nil, key, creator)}
	static func delete(_ partKey: String!, _ key: String){
		DBUtils.delete(partKey : partKey, key : key)
	}
	static func deleteList(_ partKey: String!, _ key: String){
		DBUtils.deleteList(partKey: partKey, key: key)
	}
	static func delete(_ key: String){
		DBUtils.delete(partKey : nil, key : key)
	}
}
