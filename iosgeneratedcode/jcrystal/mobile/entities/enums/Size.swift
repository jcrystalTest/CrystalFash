public enum Size : Int{
	case XS = 1000
	case S = 2000
	case M = 3000
	case L = 4000
	case XL = 5000
	var rawName: String?{
		switch self{
			case .XS : return "XS"
			case .S : return "S"
			case .M : return "M"
			case .L : return "L"
			case .XL : return "XL"
		}
	}
	var id: Int{
		return self.rawValue
	}
	public static func fromId(_ id : Int) -> Size{
		return Size(rawValue: id)!
	}
	static let values = [XS, S, M, L, XL]
}
