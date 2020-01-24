package dev.jcrystal.crystalfash.entities;
import jcrystal.reflection.annotations.Post;
import jcrystal.datetime.*;
@SuppressWarnings("unused")
public class PostCart{
	@Post(level = jcrystal.json.JsonLevel.MIN)
	public static class Min implements java.io.Serializable{
		public Min(){}
		public Long id;
		public Min(org.json.JSONObject json){
			this.id = json.has("id")&&!json.isNull("id")?json.getLong("id"):null;
		}
		public Min(dev.jcrystal.crystalfash.entities.Cart entidad){
		}
		public dev.jcrystal.crystalfash.entities.Cart merge(dev.jcrystal.crystalfash.entities.Cart entidad){
			return entidad;
		}
		public dev.jcrystal.crystalfash.entities.Cart create(){
			return merge(new dev.jcrystal.crystalfash.entities.Cart());
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
		public double subtotal;
		public double total;
		public Normal(org.json.JSONObject json){
			super(json);
			this.subtotal = json.optDouble("subtotal");
			this.total = json.optDouble("total");
		}
		public Normal(dev.jcrystal.crystalfash.entities.Cart entidad){
			super(entidad);
			this.subtotal = entidad.subtotal();
			this.total = entidad.total();
		}
		public dev.jcrystal.crystalfash.entities.Cart merge(dev.jcrystal.crystalfash.entities.Cart entidad){
			super.merge(entidad);
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
			super.validate();
			return this;
		}
	}
}
