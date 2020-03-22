package dev.jcrystal.crystalfash.entities;
import jcrystal.reflection.annotations.Post;
import jcrystal.datetime.*;
@SuppressWarnings("unused")
public class PostUser{
	@Post(level = jcrystal.json.JsonLevel.NORMAL)
	public static class Normal implements java.io.Serializable{
		public Normal(){}
		public String name;
		public com.google.appengine.api.datastore.Email email;
		public Normal(org.json.JSONObject json){
			this.name = json.has("name")&&!json.isNull("name")?json.getString("name"):null;
			this.email = json.has("email")?new com.google.appengine.api.datastore.Email(json.getString("email")):null;
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
		public static java.util.List<Normal> getFromNormal(java.util.List<User> data){
			if(data == null){return null;}
			java.util.ArrayList<Normal> ret = new java.util.ArrayList<>(data.size());
			for(int pos = 0; pos < data.size(); pos++){
				ret.add(new Normal(data.get(pos)));
			}
			return ret;
		}
		public Normal(dev.jcrystal.crystalfash.entities.User entidad){
			this.name = entidad.name();
			this.email = entidad.email();
		}
		public dev.jcrystal.crystalfash.entities.User merge(dev.jcrystal.crystalfash.entities.User entidad){
			entidad.name(this.name);
			entidad.email(this.email);
			return entidad;
		}
		public dev.jcrystal.crystalfash.entities.User create(){
			return merge(new dev.jcrystal.crystalfash.entities.User());
		}
		public void setName(String name){
			this.name = name;
		}
		public String getName(){
			return this.name;
		}
		public void setEmail(com.google.appengine.api.datastore.Email email){
			this.email = email;
		}
		public com.google.appengine.api.datastore.Email getEmail(){
			return this.email;
		}
		public Normal validate(){
			return this;
		}
	}
}
