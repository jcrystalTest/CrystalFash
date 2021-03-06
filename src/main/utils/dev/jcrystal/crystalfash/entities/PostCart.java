package dev.jcrystal.crystalfash.entities;
import jcrystal.reflection.annotations.Post;
import jcrystal.datetime.*;
@SuppressWarnings("unused")
public class PostCart{
	@Post(level = jcrystal.json.JsonLevel.NORMAL)
	public static class Normal implements java.io.Serializable{
		public Normal(){}
		public double subtotal;
		public double total;
		public Normal(org.json.JSONObject json){
			this.subtotal = json.optDouble("subtotal");
			this.total = json.optDouble("total");
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
		public static java.util.List<Normal> getFromNormal(java.util.List<Cart> data){
			if(data == null){return null;}
			java.util.ArrayList<Normal> ret = new java.util.ArrayList<>(data.size());
			for(int pos = 0; pos < data.size(); pos++){
				ret.add(new Normal(data.get(pos)));
			}
			return ret;
		}
		public Normal(dev.jcrystal.crystalfash.entities.Cart entidad){
			this.subtotal = entidad.subtotal();
			this.total = entidad.total();
		}
		public dev.jcrystal.crystalfash.entities.Cart merge(dev.jcrystal.crystalfash.entities.Cart entidad){
			entidad.subtotal(this.subtotal);
			entidad.total(this.total);
			return entidad;
		}
		public dev.jcrystal.crystalfash.entities.Cart create(){
			return merge(new dev.jcrystal.crystalfash.entities.Cart());
		}
		public void setSubtotal(double subtotal){
			this.subtotal = subtotal;
		}
		public double getSubtotal(){
			return this.subtotal;
		}
		public void setTotal(double total){
			this.total = total;
		}
		public double getTotal(){
			return this.total;
		}
		public Normal validate(){
			return this;
		}
	}
}
