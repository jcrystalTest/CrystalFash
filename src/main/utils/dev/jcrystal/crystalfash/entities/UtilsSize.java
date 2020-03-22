package dev.jcrystal.crystalfash.entities;
public class UtilsSize{
	public static java.util.List<String> toIds(java.util.List<Size> values){
		java.util.List<String> ret = new java.util.ArrayList<>();
		for(Size v : values)if(v!=null)ret.add(v.name());
		return ret;
	}
	public static dev.jcrystal.crystalfash.entities.Size fromId(long id){
		if(id == 1000)return dev.jcrystal.crystalfash.entities.Size.XS;
		if(id == 2000)return dev.jcrystal.crystalfash.entities.Size.S;
		if(id == 3000)return dev.jcrystal.crystalfash.entities.Size.M;
		if(id == 4000)return dev.jcrystal.crystalfash.entities.Size.L;
		if(id == 5000)return dev.jcrystal.crystalfash.entities.Size.XL;
		return null;
	}
}
