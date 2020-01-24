enum RequestType : String{
	case GET = "GET"
	case POST = "POST"
	case PUT = "PUT"
	case DELETE = "DELETE"
	case PATCH = "PATCH"
	var isPost : Bool{
		switch self{
			case .GET: return false
			case .POST: return true
			case .PUT: return true
			case .DELETE: return false
			case .PATCH: return true
		}
	}
}
