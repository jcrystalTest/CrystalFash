package jcrystal.mobile.entities;
import jcrystal.mobile.*;
import jcrystal.mobile.entities.enums.*;
import jcrystal.datetime.*;
import static jcrystal.JSONUtils.*;
public class Product implements ProductNormal,jcrystal.mobile.net.ISerializable{
	private String image;
	public String image(){return this.image;}
	public void image(String val){image = val;}
	private Long id;
	public Long id(){return this.id;}
	public void id(Long val){id = val;}
	private String name;
	public String name(){return this.name;}
	public void name(String val){name = val;}
	private long category;
	public long category(){return this.category;}
	public void category(long val){category = val;}
	private double price;
	public double price(){return this.price;}
	public void price(double val){price = val;}
	private double discount;
	public double discount(){return this.discount;}
	public void discount(double val){discount = val;}
	private double oldPrice;
	public double oldPrice(){return this.oldPrice;}
	public void oldPrice(double val){oldPrice = val;}
	private long color;
	public long color(){return this.color;}
	public void color(long val){color = val;}
	private long size;
	public long size(){return this.size;}
	public void size(long val){size = val;}
	public Product(){
	}
	protected Product(org.json.JSONObject json)throws org.json.JSONException{
		this.image = json.has("image")&&!json.isNull("image")?json.getString("image"):null;
		this.id = json.has("id")&&!json.isNull("id")?json.getLong("id"):null;
		this.name = json.has("name")&&!json.isNull("name")?json.getString("name"):null;
		this.category = json.has("category")&&!json.isNull("category")?Categories.fromId(json.getInt("category")):null;
		this.price = json.optDouble("price");
		this.discount = json.optDouble("discount");
		this.oldPrice = json.optDouble("oldPrice");
		this.color = json.has("color")&&!json.isNull("color")?Color.fromId(json.getInt("color")):null;
		this.size = json.has("size")&&!json.isNull("size")?Size.fromId(json.getInt("size")):null;
	}
	public Product(org.json.JSONObject json, JsonLevel level)throws org.json.JSONException{
		if(level != null){
			switch(level){
				case NORMAL: {
					this.id = json.has("id")&&!json.isNull("id")?json.getLong("id"):null;
					this.name = json.has("name")&&!json.isNull("name")?json.getString("name"):null;
					this.category = json.has("category")&&!json.isNull("category")?Categories.fromId(json.getInt("category")):null;
					this.price = json.optDouble("price");
					this.discount = json.optDouble("discount");
					this.oldPrice = json.optDouble("oldPrice");
					this.color = json.has("color")&&!json.isNull("color")?Color.fromId(json.getInt("color")):null;
					this.size = json.has("size")&&!json.isNull("size")?Size.fromId(json.getInt("size")):null;
				}
				break;
			}
		}
		else{
			this.image = json.has("image")&&!json.isNull("image")?json.getString("image"):null;
			this.id = json.has("id")&&!json.isNull("id")?json.getLong("id"):null;
			this.name = json.has("name")&&!json.isNull("name")?json.getString("name"):null;
			this.category = json.has("category")&&!json.isNull("category")?Categories.fromId(json.getInt("category")):null;
			this.price = json.optDouble("price");
			this.discount = json.optDouble("discount");
			this.oldPrice = json.optDouble("oldPrice");
			this.color = json.has("color")&&!json.isNull("color")?Color.fromId(json.getInt("color")):null;
			this.size = json.has("size")&&!json.isNull("size")?Size.fromId(json.getInt("size")):null;
		}
	}
	@Override public void toJson(java.io.PrintStream _pw){
		SerializerProduct.toJson(_pw, this);
	}
	public static class ListUtils{
		public static java.util.ArrayList<Product> listFromJson(org.json.JSONArray json)throws org.json.JSONException{
			java.util.ArrayList<Product> ret = new java.util.ArrayList<Product>(json.length());
			for(int e = 0, i = json.length(); e < i; e++){
				ret.add(new Product(json.getJSONObject(e)));
			}
			return ret;
		}
		public static java.util.ArrayList<ProductNormal> listFromJsonNormal(org.json.JSONArray json)throws org.json.JSONException{
			java.util.ArrayList<ProductNormal> ret = new java.util.ArrayList<ProductNormal>(json.length());
			for(int e = 0, i = json.length(); e < i; e++){
				ret.add(new Product(json.getJSONObject(e), JsonLevel.NORMAL));
			}
			return ret;
		}
	}
	public static class MapList{
		public static<T extends ProductNormal> java.util.Map<Integer, T> ByCategory(java.util.List<T> lista){
			java.util.Map<Integer, T> ret = new java.util.TreeMap<>();
			for(T val : lista){
				if(val.category() != null){
					ret.put(val.category().id, val);
				}
			}
			return ret;
		}
		public static<T extends ProductNormal> java.util.Map<Integer, T> ByColor(java.util.List<T> lista){
			java.util.Map<Integer, T> ret = new java.util.TreeMap<>();
			for(T val : lista){
				if(val.color() != null){
					ret.put(val.color().id, val);
				}
			}
			return ret;
		}
		public static<T extends ProductNormal> java.util.Map<Integer, T> BySize(java.util.List<T> lista){
			java.util.Map<Integer, T> ret = new java.util.TreeMap<>();
			for(T val : lista){
				if(val.size() != null){
					ret.put(val.size().id, val);
				}
			}
			return ret;
		}
	}
	public static class Group{
		public static<T extends ProductNormal> java.util.Map<Integer, java.util.List<T>> ByCategory(java.util.List<T> lista){
			java.util.Map<Integer, java.util.List<T>> ret = new java.util.TreeMap<>();
			for(T val : lista){
				if(val.category() != null){
					java.util.List<T> list = ret.get(val.category().id);
					if(list == null){
						ret.put(val.category().id, list = new java.util.ArrayList<T>());
					}
					list.add(val);
				}
			}
			return ret;
		}
		public static<T extends ProductNormal> java.util.Map<Integer, java.util.List<T>> ByColor(java.util.List<T> lista){
			java.util.Map<Integer, java.util.List<T>> ret = new java.util.TreeMap<>();
			for(T val : lista){
				if(val.color() != null){
					java.util.List<T> list = ret.get(val.color().id);
					if(list == null){
						ret.put(val.color().id, list = new java.util.ArrayList<T>());
					}
					list.add(val);
				}
			}
			return ret;
		}
		public static<T extends ProductNormal> java.util.Map<Integer, java.util.List<T>> BySize(java.util.List<T> lista){
			java.util.Map<Integer, java.util.List<T>> ret = new java.util.TreeMap<>();
			for(T val : lista){
				if(val.size() != null){
					java.util.List<T> list = ret.get(val.size().id);
					if(list == null){
						ret.put(val.size().id, list = new java.util.ArrayList<T>());
					}
					list.add(val);
				}
			}
			return ret;
		}
	}
}