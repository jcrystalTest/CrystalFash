package dev.jcrystal.crystalfash.entities;
import jcrystal.reflection.annotations.Post;
import jcrystal.datetime.*;
@SuppressWarnings("unused")
public class PostCartItem{
	@Post(level = jcrystal.json.JsonLevel.MIN)
	public static class Min implements java.io.Serializable{
		public Min(){}
		public Long id;
		public Min(org.json.JSONObject json){
			this.id = json.has("id")&&!json.isNull("id")?json.getLong("id"):null;
		}
		public Min(dev.jcrystal.crystalfash.entities.CartItem entidad){
		}
		public dev.jcrystal.crystalfash.entities.CartItem merge(dev.jcrystal.crystalfash.entities.CartItem entidad){
			return entidad;
		}
		public dev.jcrystal.crystalfash.entities.CartItem create(){
			return merge(new dev.jcrystal.crystalfash.entities.CartItem());
		}
		public void setId(Long id){
			this.id = id;
		}
		public Long getId(){
			return this.id;
		}
		public Min validate(){
			return this;
		}
	}
	@Post(level = jcrystal.json.JsonLevel.NORMAL)
	public static class Normal extends Min implements java.io.Serializable{
		public Normal(){}
		public int quantity;
		public Normal(org.json.JSONObject json){
			super(json);
			this.quantity = json.optInt("quantity");
		}
		public Normal(dev.jcrystal.crystalfash.entities.CartItem entidad){
			super(entidad);
			this.quantity = entidad.quantity();
		}
		public dev.jcrystal.crystalfash.entities.CartItem merge(dev.jcrystal.crystalfash.entities.CartItem entidad){
			super.merge(entidad);
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
			super.validate();
			return this;
		}
	}
}
