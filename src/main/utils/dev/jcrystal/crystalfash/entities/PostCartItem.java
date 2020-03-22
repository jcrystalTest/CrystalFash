package dev.jcrystal.crystalfash.entities;
import jcrystal.reflection.annotations.Post;
import jcrystal.datetime.*;
@SuppressWarnings("unused")
public class PostCartItem{
	@Post(level = jcrystal.json.JsonLevel.NORMAL)
	public static class Normal implements java.io.Serializable{
		public Normal(){}
		public int quantity;
		public Normal(org.json.JSONObject json){
			this.quantity = json.optInt("quantity");
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
		public static java.util.List<Normal> getFromNormal(java.util.List<CartItem> data){
			if(data == null){return null;}
			java.util.ArrayList<Normal> ret = new java.util.ArrayList<>(data.size());
			for(int pos = 0; pos < data.size(); pos++){
				ret.add(new Normal(data.get(pos)));
			}
			return ret;
		}
		public Normal(dev.jcrystal.crystalfash.entities.CartItem entidad){
			this.quantity = entidad.quantity();
		}
		public dev.jcrystal.crystalfash.entities.CartItem merge(dev.jcrystal.crystalfash.entities.CartItem entidad){
			entidad.quantity(this.quantity);
			return entidad;
		}
		public dev.jcrystal.crystalfash.entities.CartItem create(){
			return merge(new dev.jcrystal.crystalfash.entities.CartItem());
		}
		public void setQuantity(int quantity){
			this.quantity = quantity;
		}
		public int getQuantity(){
			return this.quantity;
		}
		public Normal validate(){
			return this;
		}
	}
}
