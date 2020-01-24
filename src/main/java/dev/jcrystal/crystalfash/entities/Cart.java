package dev.jcrystal.crystalfash.entities;

import java.util.List;

import jcrystal.entity.types.Autogenerated;
import jcrystal.json.JsonLevel;
import jcrystal.reflection.annotations.EntityProperty;
import jcrystal.reflection.annotations.jEntity;
import jcrystal.reflection.annotations.entities.RelMtoM;
import jcrystal.server.Entity;

@jEntity
public class Cart implements Entity.DefaultDB{
	@jcrystal.reflection.annotations.EntityKey
	private static Autogenerated id;
	@RelMtoM(value="items", small=true, keyLevel=JsonLevel.NORMAL)
	private static List<CartItem> items;
	@EntityProperty
	private static double subtotal;
	@EntityProperty
	private static double total;
	
	@RelMtoM(value="favorites", small=true, keyLevel=JsonLevel.NORMAL)
	private static List<Product> favorites;
	
	
/* GEN */
	public static final String ENTITY_NAME = "Cart";
	protected final com.google.appengine.api.datastore.Entity rawEntity;
	public final com.google.appengine.api.datastore.Entity getRawEntity(){return rawEntity;}
	public Cart(com.google.appengine.api.datastore.Entity rawEntity){
		this.rawEntity = rawEntity;
	}
	public Cart(){
		rawEntity = new com.google.appengine.api.datastore.Entity(ENTITY_NAME);
	}
	protected Cart(String entityName){
		rawEntity = new com.google.appengine.api.datastore.Entity(entityName);
	}
	public Cart cloneFrom(Cart from){
		this.rawEntity.setPropertiesFrom(from.rawEntity);
		return this;
	}
	public Long id(){
		return rawEntity.getKey().getId();
	}
	public Cart put(){
		jcrystal.context.CrystalContext.get().DefaultDB().service.put(null, rawEntity);
		return this;
	}
	public Cart putTxn(){
		jcrystal.context.CrystalContext $ctx = jcrystal.context.CrystalContext.get();
		$ctx.DefaultDB().service.put($ctx.DefaultDB().getTxn(), rawEntity);
		return this;
	}
	public static com.google.appengine.api.datastore.Entity rawGetTxn(Long id){
		if(null == id){return null;}
		try{
			jcrystal.context.CrystalContext $ctx = jcrystal.context.CrystalContext.get();
			return $ctx.DefaultDB().service.get($ctx.DefaultDB().getTxn(), Cart.Key.createRawKey(id));
		}
		catch(com.google.appengine.api.datastore.EntityNotFoundException | java.lang.IllegalArgumentException e){
			return null;
		}
	}
	public static com.google.appengine.api.datastore.Entity rawGet(Long id){
		if(null == id){return null;}
		try{
			return jcrystal.context.CrystalContext.get().DefaultDB().service.get(null, Cart.Key.createRawKey(id));
		}
		catch(com.google.appengine.api.datastore.EntityNotFoundException | java.lang.IllegalArgumentException e){
			return null;
		}
	}
	public static Cart get(Long id){
		com.google.appengine.api.datastore.Entity ent = rawGet(id);
		if(ent == null)return null;
		return new Cart(ent);
	}
	public static Cart getTxn(Long id){
		com.google.appengine.api.datastore.Entity ent = rawGetTxn(id);
		if(ent == null)return null;
		return new Cart(ent);
	}
	public static Cart get(com.google.appengine.api.datastore.Key $key){
		if($key == null){return null;}
		try{
			return new Cart(jcrystal.context.CrystalContext.get().DefaultDB().service.get(null, $key));
		}
		catch(com.google.appengine.api.datastore.EntityNotFoundException | java.lang.IllegalArgumentException e){
			return null;
		}
	}
	public static Cart getTxn(com.google.appengine.api.datastore.Key $key){
		if($key == null){return null;}
		try{
			jcrystal.context.CrystalContext $ctx = jcrystal.context.CrystalContext.get();
			return new Cart($ctx.DefaultDB().service.get($ctx.DefaultDB().getTxn(), $key));
		}
		catch(com.google.appengine.api.datastore.EntityNotFoundException | java.lang.IllegalArgumentException e){
			return null;
		}
	}
	public static boolean exist(Long id){
		com.google.appengine.api.datastore.Entity ent = rawGet(id);
		return ent != null;
	}
	public static Cart tryGet(Long id){
		com.google.appengine.api.datastore.Entity ent = rawGet(id);
		if(ent == null)throw new jcrystal.utils.InternalException(17, "Identificador invalido");
		return new Cart(ent);
	}
	public static Cart tryGet(Long id, Cart $defValue){
		com.google.appengine.api.datastore.Entity ent = rawGet(id);
		if(ent == null)return $defValue;
		return new Cart(ent);
	}
	public static Cart tryGetTxn(Long id){
		com.google.appengine.api.datastore.Entity ent = rawGetTxn(id);
		if(ent == null)throw new jcrystal.utils.InternalException(17, "Identificador invalido");
		return new Cart(ent);
	}
	public Cart subtotal(double subtotal){
		rawEntity.setUnindexedProperty("subtotal", subtotal);
		return this;
	}
	public Cart total(double total){
		rawEntity.setUnindexedProperty("total", total);
		return this;
	}
	@SuppressWarnings("unchecked")
	public java.util.List<Long> items$Key(){
		return (java.util.List<Long>)rawEntity.getProperty("items");
	}
	public  Cart items$Key(java.util.List<Long> $vals){
		rawEntity.setIndexedProperty("items", $vals);
		return this;
	}
	public Cart items(java.util.function.Consumer<java.util.List<Long>> editor){
		java.util.List<Long> $temp = items$Key();
		if($temp==null)$temp = new java.util.ArrayList<>();
		editor.accept($temp);
		rawEntity.setIndexedProperty("items", $temp);
		return this;
	}
	public Cart items(dev.jcrystal.crystalfash.entities.CartItem val){
		return this.items(list->list.add(val.id()));
	}
	public Cart items(java.util.List<dev.jcrystal.crystalfash.entities.CartItem> $val){
		rawEntity.setIndexedProperty("items", $val==null ? null : $val.stream().map($v -> $v.id()).collect(java.util.stream.Collectors.toList()));
		return this;
	}
	public Cart items(Long id){
		return this.items(list->list.add(id));
	}
	public java.util.List<dev.jcrystal.crystalfash.entities.CartItem> items(){
		return dev.jcrystal.crystalfash.entities.CartItem.Batch.get(items$Key());
	}
	public java.util.List<dev.jcrystal.crystalfash.entities.CartItem> itemsTxn(){
		return dev.jcrystal.crystalfash.entities.CartItem.Batch.getTxn(items$Key());
	}
	@SuppressWarnings("unchecked")
	public java.util.List<Long> favorites$Key(){
		return (java.util.List<Long>)rawEntity.getProperty("favorites");
	}
	public  Cart favorites$Key(java.util.List<Long> $vals){
		rawEntity.setIndexedProperty("favorites", $vals);
		return this;
	}
	public Cart favorites(java.util.function.Consumer<java.util.List<Long>> editor){
		java.util.List<Long> $temp = favorites$Key();
		if($temp==null)$temp = new java.util.ArrayList<>();
		editor.accept($temp);
		rawEntity.setIndexedProperty("favorites", $temp);
		return this;
	}
	public Cart favorites(dev.jcrystal.crystalfash.entities.Product val){
		return this.favorites(list->list.add(val.id()));
	}
	public Cart favorites(java.util.List<dev.jcrystal.crystalfash.entities.Product> $val){
		rawEntity.setIndexedProperty("favorites", $val==null ? null : $val.stream().map($v -> $v.id()).collect(java.util.stream.Collectors.toList()));
		return this;
	}
	public Cart favorites(Long id){
		return this.favorites(list->list.add(id));
	}
	public java.util.List<dev.jcrystal.crystalfash.entities.Product> favorites(){
		return dev.jcrystal.crystalfash.entities.Product.Batch.get(favorites$Key());
	}
	public java.util.List<dev.jcrystal.crystalfash.entities.Product> favoritesTxn(){
		return dev.jcrystal.crystalfash.entities.Product.Batch.getTxn(favorites$Key());
	}
	public double subtotal(){
		if(!rawEntity.hasProperty("subtotal")){
			rawEntity.setUnindexedProperty("subtotal", new com.google.appengine.api.datastore.EmbeddedEntity());
		}
		return jcrystal.db.datastore.EntityUtils.getDouble(rawEntity, "subtotal", 0);
	}
	public double total(){
		if(!rawEntity.hasProperty("total")){
			rawEntity.setUnindexedProperty("total", new com.google.appengine.api.datastore.EmbeddedEntity());
		}
		return jcrystal.db.datastore.EntityUtils.getDouble(rawEntity, "total", 0);
	}
	public static class CachedGetter{
		private java.util.TreeMap<Long, Cart> cache = new java.util.TreeMap<>();
		public Cart get(Long id){
			Cart ret = cache.get(id);
			if(ret == null){
				cache.put(id, ret = Cart.get(id));
			}
			return ret;
		}
	}
	public static class Post extends PostCart{}
	public static class Serializer extends SerializerCart{}
	public static class Query extends QueryCart{}
	public static class Batch extends BatchCart{}
	public static class Key{
		private Key(){}
		public static com.google.appengine.api.datastore.Key createRawKey(Long id){
			return com.google.appengine.api.datastore.KeyFactory.createKey(ENTITY_NAME, id);
		}
	}
	public static class Meta extends MetaCart{}
/* END */
}