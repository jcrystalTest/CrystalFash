import Foundation
import jCrystaliOSLib
public class ManagerCart{
	/**
	* /api/cart/addToCart
	**/
	static func addToCart(idCart : Int64!, idProduct : Int64!, quantity : Int, onSuccess : @escaping (CartNormal)->(), onError : @escaping ((RequestError)->())){
		var params : String! = nil
		if let _idCart = idCart {
			if let _params = params {
				params = _params + "&idCart=\(_idCart)"
			}
			else{
				params = "?idCart=\(_idCart)"
			}
		}
		if let _idProduct = idProduct {
			if let _params = params {
				params = _params + "&idProduct=\(_idProduct)"
			}
			else{
				params = "?idProduct=\(_idProduct)"
			}
		}
		if let _params = params {
			params = _params + "&quantity=\(quantity)"
		}
		else{
			params = "?quantity=\(quantity)"
		}
		AbsDefaultManager.JSONObjectResp(url: "/api/cart/addToCart" + (params ?? ""), onResponse: {(result) in 
			onSuccess(SerializerCart.fromJsonNormal(result["r"] as! [String : AnyObject]))
		}, onError: onError).doGet()
	}
	/**
	* /api/cart/addToFavorites
	**/
	static func addToFavorites(cartId : Int64, idP : Int64!, onSuccess : @escaping ()->(), onError : @escaping ((RequestError)->())){
		var params : String! = nil
		if let _params = params {
			params = _params + "&cartId=\(cartId)"
		}
		else{
			params = "?cartId=\(cartId)"
		}
		if let _idP = idP {
			if let _params = params {
				params = _params + "&idP=\(_idP)"
			}
			else{
				params = "?idP=\(_idP)"
			}
		}
		AbsDefaultManager.JSONObjectResp(url: "/api/cart/addToFavorites" + (params ?? ""), onResponse: {(result) in 
			onSuccess()
		}, onError: onError).doGet()
	}
	/**
	* /api/cart/createCart
	**/
	static func createCart(onSuccess : @escaping (CartNormal)->(), onError : @escaping ((RequestError)->())){
		AbsDefaultManager.JSONObjectResp(url: "/api/cart/createCart", onResponse: {(result) in 
			onSuccess(SerializerCart.fromJsonNormal(result["r"] as! [String : AnyObject]))
		}, onError: onError).doGet()
	}
	/**
	* /api/cart/getCart
	**/
	static func getCart(id : Int64, onSuccess : @escaping (CartNormal)->(), onError : @escaping ((RequestError)->())){
		var params : String! = nil
		if let _params = params {
			params = _params + "&id=\(id)"
		}
		else{
			params = "?id=\(id)"
		}
		AbsDefaultManager.JSONObjectResp(url: "/api/cart/getCart" + (params ?? ""), onResponse: {(result) in 
			onSuccess(SerializerCart.fromJsonNormal(result["r"] as! [String : AnyObject]))
		}, onError: onError).doGet()
	}
	/**
	* /api/cart/listFavorites
	**/
	static func listFavorites(cartId : Int64, onSuccess : @escaping ([ProductNormal])->(), onError : @escaping ((RequestError)->())){
		var params : String! = nil
		if let _params = params {
			params = _params + "&cartId=\(cartId)"
		}
		else{
			params = "?cartId=\(cartId)"
		}
		AbsDefaultManager.JSONObjectResp(url: "/api/cart/listFavorites" + (params ?? ""), onResponse: {(result) in 
			let _array = result["r"] as! [[String : AnyObject]]
			var _lista = [ProductNormal]()
			for pos in 0 ..< _array.count{
				_lista.append(SerializerProduct.fromJsonNormal(_array[pos]))
			}
			onSuccess(_lista)
		}, onError: onError).doGet()
	}
}
