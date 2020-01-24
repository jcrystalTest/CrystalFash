import Foundation
import jCrystaliOSLib
public protocol ProductNormal{
	func id() -> Int64?
	func name() -> String?
	func category() -> Int64
	func price() -> Double
	func discount() -> Double
	func oldPrice() -> Double
	func color() -> Int64
	func size() -> Int64
}
public let CREATORProductNormal = {(json: [String : AnyObject])->(ProductNormal) in 
	return SerializerProduct.fromJson(json)
}
