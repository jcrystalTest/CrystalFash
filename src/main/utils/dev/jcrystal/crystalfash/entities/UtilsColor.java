package dev.jcrystal.crystalfash.entities;
public class UtilsColor{
	public static java.util.List<String> toIds(java.util.List<Color> values){
		java.util.List<String> ret = new java.util.ArrayList<>();
		for(Color v : values)if(v!=null)ret.add(v.name());
		return ret;
	}
	public static dev.jcrystal.crystalfash.entities.Color fromId(long id){
		if(id == 1000)return dev.jcrystal.crystalfash.entities.Color.RED;
		if(id == 2000)return dev.jcrystal.crystalfash.entities.Color.BLUE;
		if(id == 3000)return dev.jcrystal.crystalfash.entities.Color.YELLOW;
		return null;
	}
}
