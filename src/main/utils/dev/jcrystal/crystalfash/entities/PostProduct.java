package dev.jcrystal.crystalfash.entities;
import jcrystal.reflection.annotations.Post;
import jcrystal.datetime.*;
import dev.jcrystal.crystalfash.entities.Categories;
import dev.jcrystal.crystalfash.entities.Color;
import dev.jcrystal.crystalfash.entities.Size;
@SuppressWarnings("unused")
public class PostProduct{
	@Post(level = jcrystal.json.JsonLevel.MIN)
	public static class Min implements java.io.Serializable{
		public Min(){}
		public Long id;
		public Min(org.json.JSONObject json){
			this.id = json.has("id")&&!json.isNull("id")?json.getLong("id"):null;
		}
		public Min(dev.jcrystal.crystalfash.entities.Product entidad){
		}
		public dev.jcrystal.crystalfash.entities.Product merge(dev.jcrystal.crystalfash.entities.Product entidad){
			return entidad;
		}
		public dev.jcrystal.crystalfash.entities.Product create(){
			return merge(new dev.jcrystal.crystalfash.entities.Product());
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
		public String name;
		public String description;
		public dev.jcrystal.crystalfash.entities.Categories category;
		public double price;
		public double discount;
		public double oldPrice;
		public dev.jcrystal.crystalfash.entities.Color color;
		public dev.jcrystal.crystalfash.entities.Size size;
		public String image;
		public Normal(org.json.JSONObject json){
			super(json);
			this.name = json.has("name")&&!json.isNull("name")?json.getString("name"):null;
			this.description = json.has("description")&&!json.isNull("description")?json.getString("description"):null;
			this.category = json.has("category")&&!json.isNull("category")?Categories.fromId(json.getInt("category")):null;
			this.price = json.optDouble("price");
			this.discount = json.optDouble("discount");
			this.oldPrice = json.optDouble("oldPrice");
			this.color = json.has("color")&&!json.isNull("color")?Color.fromId(json.getInt("color")):null;
			this.size = json.has("size")&&!json.isNull("size")?Size.fromId(json.getInt("size")):null;
			this.image = json.has("image")&&!json.isNull("image")?json.getString("image"):null;
		}
		public Normal(dev.jcrystal.crystalfash.entities.Product entidad){
			super(entidad);
			this.name = entidad.name();
			this.description = entidad.description();
			this.category = entidad.category();
			this.price = entidad.price();
			this.discount = entidad.discount();
			this.oldPrice = entidad.oldPrice();
			this.color = entidad.color();
			this.size = entidad.size();
			this.image = entidad.image();
		}
		public dev.jcrystal.crystalfash.entities.Product merge(dev.jcrystal.crystalfash.entities.Product entidad){
			super.merge(entidad);
			entidad.name(this.name);
			entidad.description(this.description);
			entidad.category(this.category);
			entidad.price(this.price);
			entidad.discount(this.discount);
			entidad.oldPrice(this.oldPrice);
			entidad.color(this.color);
			entidad.size(this.size);
			entidad.image(this.image);
			return entidad;
		}
		public dev.jcrystal.crystalfash.entities.Product create(){
			return merge(new dev.jcrystal.crystalfash.entities.Product());
		}
		public void setName(String name){
			this.name = name;
		}
		public String getName(){
			return this.name;
		}
		public void setDescription(String description){
			this.description = description;
		}
		public String getDescription(){
			return this.description;
		}
		public void setCategory(dev.jcrystal.crystalfash.entities.Categories category){
			this.category = category;
		}
		public dev.jcrystal.crystalfash.entities.Categories getCategory(){
			return this.category;
		}
		public void setPrice(double price){
			this.price = price;
		}
		public double getPrice(){
			return this.price;
		}
		public void setDiscount(double discount){
			this.discount = discount;
		}
		public double getDiscount(){
			return this.discount;
		}
		public void setOldPrice(double oldPrice){
			this.oldPrice = oldPrice;
		}
		public double getOldPrice(){
			return this.oldPrice;
		}
		public void setColor(dev.jcrystal.crystalfash.entities.Color color){
			this.color = color;
		}
		public dev.jcrystal.crystalfash.entities.Color getColor(){
			return this.color;
		}
		public void setSize(dev.jcrystal.crystalfash.entities.Size size){
			this.size = size;
		}
		public dev.jcrystal.crystalfash.entities.Size getSize(){
			return this.size;
		}
		public void setImage(String image){
			this.image = image;
		}
		public String getImage(){
			return this.image;
		}
		public Normal validate(){
			super.validate();
			return this;
		}
	}
}
