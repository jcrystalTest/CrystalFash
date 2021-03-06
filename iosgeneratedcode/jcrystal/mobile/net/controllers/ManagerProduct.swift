import Foundation
import jCrystaliOSLib
public class ManagerProduct{
	/**
	* /api/product/filterProductsByCategory
	**/
	static func filterProductsByCategory(category : Categories!, onSuccess : @escaping ([ProductNormal])->(), onError : @escaping ((RequestError)->())){
		var params : String! = nil
		if let _category = category {
			if let _params = params {
				params = _params + "&category=\(_category.id)"
			}
			else{
				params = "?category=\(_category.id)"
			}
		}
		AbsDefaultManager.JSONObjectResp(url: "/api/product/filterProductsByCategory" + (params ?? ""), onResponse: {(result) in 
			let _array = result["r"] as! [[String : AnyObject]]
			var _lista = [ProductNormal]()
			for pos in 0 ..< _array.count{
				_lista.append(SerializerProduct.fromJsonNormal(_array[pos]))
			}
			onSuccess(_lista)
		}, onError: onError).doGet()
	}
	/**
	* /api/product/getCategories
	**/
	static func getCategories(onSuccess : @escaping ([String])->(), onError : @escaping ((RequestError)->())){
		AbsDefaultManager.JSONObjectResp(url: "/api/product/getCategories", onResponse: {(result) in 
			onSuccess(result["r"] as! [String])
		}, onError: onError).doGet()
	}
	/**
	* /api/product/getProductById
	**/
	static func getProductById(id : Int64, onSuccess : @escaping (ProductNormal)->(), onError : @escaping ((RequestError)->())){
		var params : String! = nil
		if let _params = params {
			params = _params + "&id=\(id)"
		}
		else{
			params = "?id=\(id)"
		}
		AbsDefaultManager.JSONObjectResp(url: "/api/product/getProductById" + (params ?? ""), onResponse: {(result) in 
			onSuccess(SerializerProduct.fromJsonNormal(result["r"] as! [String : AnyObject]))
		}, onError: onError).doGet()
	}
	/**
	* /api/product/getProducts
	**/
	static func getProducts(onSuccess : @escaping ([ProductNormal])->(), onError : @escaping ((RequestError)->())){
		AbsDefaultManager.JSONObjectResp(url: "/api/product/getProducts", onResponse: {(result) in 
			let _array = result["r"] as! [[String : AnyObject]]
			var _lista = [ProductNormal]()
			for pos in 0 ..< _array.count{
				_lista.append(SerializerProduct.fromJsonNormal(_array[pos]))
			}
			onSuccess(_lista)
		}, onError: onError).doGet()
	}
}
