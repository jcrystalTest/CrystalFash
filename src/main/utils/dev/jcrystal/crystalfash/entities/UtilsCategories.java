package dev.jcrystal.crystalfash.entities;
public class UtilsCategories{
	public static java.util.List<String> toIds(java.util.List<Categories> values){
		java.util.List<String> ret = new java.util.ArrayList<>();
		for(Categories v : values)if(v!=null)ret.add(v.name());
		return ret;
	}
	public static dev.jcrystal.crystalfash.entities.Categories fromId(long id){
		if(id == 1000)return dev.jcrystal.crystalfash.entities.Categories.MEN;
		if(id == 2000)return dev.jcrystal.crystalfash.entities.Categories.WOMEN;
		if(id == 3000)return dev.jcrystal.crystalfash.entities.Categories.KIDS;
		return null;
	}
}
