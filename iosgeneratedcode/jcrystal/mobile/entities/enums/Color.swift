public enum Color : Int{
	case RED = 1000
	case BLUE = 2000
	case YELLOW = 3000
	var rawName: String?{
		switch self{
			case .RED : return "RED"
			case .BLUE : return "BLUE"
			case .YELLOW : return "YELLOW"
		}
	}
	var id: Int{
		return self.rawValue
	}
	public static func fromId(_ id : Int) -> Color{
		return Color(rawValue: id)!
	}
	static let values = [RED, BLUE, YELLOW]
}
