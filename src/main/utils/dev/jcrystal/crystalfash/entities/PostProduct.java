package dev.jcrystal.crystalfash.entities;
import jcrystal.reflection.annotations.Post;
import jcrystal.datetime.*;
@SuppressWarnings("unused")
public class PostProduct{
	@Post(level = jcrystal.json.JsonLevel.NORMAL)
	public static class Normal implements java.io.Serializable{
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
			this.name = json.has("name")&&!json.isNull("name")?json.getString("name"):null;
			this.description = json.has("description")&&!json.isNull("description")?json.getString("description"):null;
			this.category = json.has("category")&&!json.isNull("category")?dev.jcrystal.crystalfash.entities.UtilsCategories.fromId(json.getInt("category")):null;
			this.price = json.optDouble("price");
			this.discount = json.optDouble("discount");
			this.oldPrice = json.optDouble("oldPrice");
			this.color = json.has("color")&&!json.isNull("color")?dev.jcrystal.crystalfash.entities.UtilsColor.fromId(json.getInt("color")):null;
			this.size = json.has("size")&&!json.isNull("size")?dev.jcrystal.crystalfash.entities.UtilsSize.fromId(json.getInt("size")):null;
			this.image = json.has("image")&&!json.isNull("image")?json.getString("image"):null;
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
		public static java.util.List<Normal> getFromNormal(java.util.List<Product> data){
			if(data == null){return null;}
			java.util.ArrayList<Normal> ret = new java.util.ArrayList<>(data.size());
			for(int pos = 0; pos < data.size(); pos++){
				ret.add(new Normal(data.get(pos)));
			}
			return ret;
		}
		public Normal(dev.jcrystal.crystalfash.entities.Product entidad){
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
			return this;
		}
	}
}
