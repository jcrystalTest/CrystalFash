import Foundation
import jCrystaliOSLib
public class ManagerContact{
	/**
	* /api/contact/contact
	**/
	static func contact(name : String!, email : String!, message : String!, onSuccess : @escaping ()->(), onError : @escaping ((RequestError)->())){
		var params : String! = nil
		if let _name = name {
			if let _params = params {
				params = _params + "&name=" + _name.addingPercentEncoding(withAllowedCharacters: .urlHostAllowed)!
			}
			else{
				params = "?name=" + _name.addingPercentEncoding(withAllowedCharacters: .urlHostAllowed)!
			}
		}
		if let _email = email {
			if let _params = params {
				params = _params + "&email=" + _email.addingPercentEncoding(withAllowedCharacters: .urlHostAllowed)!
			}
			else{
				params = "?email=" + _email.addingPercentEncoding(withAllowedCharacters: .urlHostAllowed)!
			}
		}
		if let _message = message {
			if let _params = params {
				params = _params + "&message=" + _message.addingPercentEncoding(withAllowedCharacters: .urlHostAllowed)!
			}
			else{
				params = "?message=" + _message.addingPercentEncoding(withAllowedCharacters: .urlHostAllowed)!
			}
		}
		AbsDefaultManager.JSONObjectResp(url: "/api/contact/contact" + (params ?? ""), onResponse: {(result) in 
			onSuccess()
		}, onError: onError).doGet()
	}
}
