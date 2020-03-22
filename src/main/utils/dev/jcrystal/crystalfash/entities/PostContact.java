package dev.jcrystal.crystalfash.entities;
import jcrystal.reflection.annotations.Post;
import jcrystal.datetime.*;
@SuppressWarnings("unused")
public class PostContact{
	@Post(level = jcrystal.json.JsonLevel.NORMAL)
	public static class Normal implements java.io.Serializable{
		public Normal(){}
		public String name;
		public String email;
		public String message;
		public Normal(org.json.JSONObject json){
			this.name = json.has("name")&&!json.isNull("name")?json.getString("name"):null;
			this.email = json.has("email")&&!json.isNull("email")?json.getString("email"):null;
			this.message = json.has("message")&&!json.isNull("message")?json.getString("message"):null;
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
		public static java.util.List<Normal> getFromNormal(java.util.List<Contact> data){
			if(data == null){return null;}
			java.util.ArrayList<Normal> ret = new java.util.ArrayList<>(data.size());
			for(int pos = 0; pos < data.size(); pos++){
				ret.add(new Normal(data.get(pos)));
			}
			return ret;
		}
		public Normal(dev.jcrystal.crystalfash.entities.Contact entidad){
			this.name = entidad.name();
			this.email = entidad.email();
			this.message = entidad.message();
		}
		public dev.jcrystal.crystalfash.entities.Contact merge(dev.jcrystal.crystalfash.entities.Contact entidad){
			entidad.name(this.name);
			entidad.email(this.email);
			entidad.message(this.message);
			return entidad;
		}
		public dev.jcrystal.crystalfash.entities.Contact create(){
			return merge(new dev.jcrystal.crystalfash.entities.Contact());
		}
		public void setName(String name){
			this.name = name;
		}
		public String getName(){
			return this.name;
		}
		public void setEmail(String email){
			this.email = email;
		}
		public String getEmail(){
			return this.email;
		}
		public void setMessage(String message){
			this.message = message;
		}
		public String getMessage(){
			return this.message;
		}
		public Normal validate(){
			return this;
		}
	}
}
