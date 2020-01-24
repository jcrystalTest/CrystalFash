import Foundation
import jCrystaliOSLib
public protocol CartNormal{
	func id() -> Int64?
	func items() -> List
	func subtotal() -> Double
	func total() -> Double
	func favorites() -> List
}
public let CREATORCartNormal = {(json: [String : AnyObject])->(CartNormal) in 
	return SerializerCart.fromJson(json)
}
