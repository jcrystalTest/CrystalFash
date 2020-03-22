package dev.jcrystal.crystalfash.security;
import jcrystal.reflection.annotations.Post;
import jcrystal.datetime.*;
@SuppressWarnings("unused")
public class PostToken{
	@Post(level = jcrystal.json.JsonLevel.NORMAL)
	public static class Normal implements java.io.Serializable{
		public Normal(){}
		public long rol;
		public Normal(org.json.JSONObject json){
			this.rol = json.optLong("rol", 0);
		}
		public static Normal getFromNormal(org.json.JSONObject json){
			if(json == null){
				return null;
			}
			return new Normal(json);
		}
		public static java.util.List<Normal> getFromNormal(org.json.JSONArray json){
			if(json == null){return null;}
			java.util.ArrayList<Normal> ret = new java.util.ArrayList<>(json.length());
			for(int pos = 0; pos < json.length(); pos++){
				ret.add(new Normal(json.getJSONObject(pos)));
			}
			return ret;
		}
		public static java.util.List<Normal> getFromNormal(java.util.List<Token> data){
			if(data == null){return null;}
			java.util.ArrayList<Normal> ret = new java.util.ArrayList<>(data.size());
			for(int pos = 0; pos < data.size(); pos++){
				ret.add(new Normal(data.get(pos)));
			}
			return ret;
		}
		public Normal(dev.jcrystal.crystalfash.security.Token entidad){
			this.rol = entidad.rol();
		}
		public dev.jcrystal.crystalfash.security.Token merge(dev.jcrystal.crystalfash.security.Token entidad){
			entidad.rol(this.rol);
			return entidad;
		}
		public dev.jcrystal.crystalfash.security.Token create(String token){
			return merge(new dev.jcrystal.crystalfash.security.Token(token));
		}
		public void setRol(long rol){
			this.rol = rol;
		}
		public long getRol(){
			return this.rol;
		}
		public Normal validate(){
			return this;
		}
	}
}
