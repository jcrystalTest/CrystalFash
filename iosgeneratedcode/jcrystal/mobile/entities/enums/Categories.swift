public enum Categories : Int{
	case MEN = 1000
	case WOMEN = 2000
	case KIDS = 3000
	var name: String?{
		switch self{
			case .MEN : return "Men"
			case .WOMEN : return "Women"
			case .KIDS : return "Kids"
		}
	}
	var rawName: String?{
		switch self{
			case .MEN : return "MEN"
			case .WOMEN : return "WOMEN"
			case .KIDS : return "KIDS"
		}
	}
	var id: Int{
		return self.rawValue
	}
	public static func fromId(_ id : Int) -> Categories{
		return Categories(rawValue: id)!
	}
	static let values = [MEN, WOMEN, KIDS]
}
