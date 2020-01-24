import Foundation
import jCrystaliOSLib
class DBCart{
	static func retrieve(_ key: String)-> Cart!{
		return retrieve(nil, key)
	}
	@discardableResult static func store(_ key: String, _ value: Cart)-> Bool{
		return store(nil, key, value)
	}
	@discardableResult static func store(_ key: String, _ values: [Cart])-> Bool{
		return store(nil, key, values)
	}
	@discardableResult static func retrieveList(_ key: String)-> [Cart]! {return DBUtils.retrieveList(nil, key, SerializerCart.CREATOR)}
	@discardableResult static func retrieveList(_ partKey: String!, _ key: String)-> [Cart]! {return DBUtils.retrieveList(partKey, key, SerializerCart.CREATOR)}
	@discardableResult static func deleteFromList(_ partKey: String!, _ key: String, _ filter : (Cart) -> Bool) -> [Cart]{
		if let _list = DBCart.retrieveList(partKey, key){
			let newList = _list.filter({!filter($0)})
			DBUtils.store(partKey: partKey, key: key, values: newList, storer: {SerializerCart.toJson($0, objeto: $1 as! Cart)})
			return newList
		}
		return [Cart]()
	}
	@discardableResult static func deleteFromList(_ key: String, _ filter : (Cart) -> Bool)-> [Cart]! {return DBCart.deleteFromList(nil, key, filter)}
	@discardableResult static func store(_ partKey: String!, _ key: String, _ value: Cart)->Bool{
		return DBUtils.store(partKey: partKey, key : key) { (outputstream) in
			SerializerCart.toJson(outputstream, objeto : value)
		}
	}
	@discardableResult static func store(_ partKey : String!, _ key: String, _ values: [Cart]) -> Bool{
		return DBUtils.store(partKey : partKey, key : key, values : values, storer : {SerializerCart.toJson($0, objeto: $1 as! Cart)})
	}
	@discardableResult static func storeNormal(_ key: String, _ value: CartNormal)-> Bool{
		return store(nil, key, value as! Cart)
	}
	@discardableResult static func storeNormal(_ key: String, _ values: [CartNormal])-> Bool{
		return storeNormal(nil, key, values)
	}
	@discardableResult static func retrieveListNormal(_ key: String)-> [CartNormal]! {return DBUtils.retrieveList(nil, key, SerializerCart.CREATOR)}
	@discardableResult static func retrieveListNormal(_ partKey: String!, _ key: String)-> [CartNormal]! {return DBUtils.retrieveList(partKey, key, SerializerCart.CREATOR)}
	@discardableResult static func deleteFromListNormal(_ partKey: String!, _ key: String, _ filter : (CartNormal) -> Bool) -> [CartNormal]{
		if let _list = DBCart.retrieveList(partKey, key){
			let newList = _list.filter({!filter($0)})
			DBUtils.store(partKey: partKey, key: key, values: newList, storer: {SerializerCart.toJson($0, objeto: $1 as! Cart)})
			return newList
		}
		return [CartNormal]()
	}
	@discardableResult static func deleteFromListNormal(_ key: String, _ filter : (CartNormal) -> Bool)-> [CartNormal]! {return DBCart.deleteFromListNormal(nil, key, filter)}
	@discardableResult static func store(_ partKey: String!, _ key: String , _ value: CartNormal) -> Bool{
		return store(partKey, key, value as! Cart)
	}
	@discardableResult static func storeNormal(_ partKey : String!, _ key: String, _ values: [CartNormal]) -> Bool{
		return DBUtils.store(partKey : partKey, key : key, values : values, storer : {SerializerCart.toJson($0, objeto: $1 as! Cart)})
	}
	@discardableResult static func appendToList(_ partKey: String!, _ key: String, _ value: Cart)-> Bool{
		if let outputstream = DBUtils.getOutputStream(partKey, "L" + key, append: true) {
			outputstream.open()
			let coma = [UInt8](",".utf8)
			outputstream.write(coma, maxLength: coma.count)
			SerializerCart.toJson(outputstream, objeto : value)
			outputstream.close()
			return true
		}
		return false
	}
	static func retrieve(_ partKey: String!, _ key: String)-> Cart!{
		return DBUtils.retrieve(partKey: partKey, key: key, converter: SerializerCart.fromJson)
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
