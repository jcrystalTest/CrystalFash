package dev.jcrystal.crystalfash.entities;

import jcrystal.reflection.annotations.EntityProperty;
import jcrystal.reflection.annotations.jEntity;
import jcrystal.server.Entity;

@jEntity
public class Contact implements Entity.DefaultDB{
	@EntityProperty
	public static String name;
	@EntityProperty
	public static String email;
	@EntityProperty
	public static String message;
/* GEN */
	protected final com.google.appengine.api.datastore.Entity rawEntity;
	public final com.google.appengine.api.datastore.Entity getRawEntity(){return rawEntity;}
	public Contact(com.google.appengine.api.datastore.Entity rawEntity){
		this.rawEntity = rawEntity;
	}
	public Contact(){
		rawEntity = new com.google.appengine.api.datastore.Entity(ENTITY_NAME);
	}
	protected Contact(String entityName){
		rawEntity = new com.google.appengine.api.datastore.Entity(entityName);
	}
	public Contact cloneFrom(Contact from){
		this.rawEntity.setPropertiesFrom(from.rawEntity);
		return this;
	}
	public Long id(){
		return rawEntity.getKey().getId();
	}
	public Contact put(){
		jcrystal.context.CrystalContext $ctx = jcrystal.context.CrystalContext.get();
		$ctx.DefaultDB().service.put($ctx.DefaultDB().getTxn(), rawEntity);
		return this;
	}
	public static com.google.appengine.api.datastore.Entity rawGet(com.google.appengine.api.datastore.Key $key){
		if($key == null){return null;}
		try{
			return jcrystal.context.CrystalContext.get().DefaultDB().get($key);
		}
		catch(com.google.appengine.api.datastore.EntityNotFoundException | java.lang.IllegalArgumentException e){
			return null;
		}
	}
	public static Contact get(com.google.appengine.api.datastore.Key $key){
		com.google.appengine.api.datastore.Entity ent = rawGet($key);
		if(ent == null)return null;
		return new Contact(ent);
	}
	public static Contact get(Long id){
		com.google.appengine.api.datastore.Entity ent = rawGet(Key.createRawKey(id));
		if(ent == null)return null;
		return new Contact(ent);
	}
	public static boolean exist(Long id){
		return rawGet(Key.createRawKey(id)) != null;
	}
	public static Contact tryGet(com.google.appengine.api.datastore.Key $key){
		com.google.appengine.api.datastore.Entity ent = rawGet($key);
		if(ent == null)throw new jcrystal.utils.InternalException(17, "Invalid identifier");
		return new Contact(ent);
	}
	public static Contact tryGet(Long id){
		return tryGet(Key.createRawKey(id));
	}
	public static Contact tryGet(Long id, Contact $defValue){
		Contact ent = get(id);
		if(ent == null)return $defValue;
		return ent;
	}
	public Contact name(String name){
		rawEntity.setUnindexedProperty("name", name);
		return this;
	}
	public Contact email(String email){
		rawEntity.setUnindexedProperty("email", email);
		return this;
	}
	public Contact message(String message){
		rawEntity.setUnindexedProperty("message", message);
		return this;
	}
	public String name(){
		return jcrystal.db.datastore.EntityUtils.getString(rawEntity, "name");
	}
	public String email(){
		return jcrystal.db.datastore.EntityUtils.getString(rawEntity, "email");
	}
	public String message(){
		return jcrystal.db.datastore.EntityUtils.getString(rawEntity, "message");
	}
	public static class CachedGetter{
		private java.util.TreeMap<Long, Contact> cache = new java.util.TreeMap<>();
		public Contact get(Long id){
			Contact ret = cache.get(id);
			if(ret == null){
				cache.put(id, ret = Contact.get(id));
			}
			return ret;
		}
	}
	public static class Post extends PostContact{}
	public static class Serializer extends SerializerContact{}
	public static QueryContact Query = new QueryContact();
	public static QueryContact Query(com.google.appengine.api.datastore.Key ancestor){ return new QueryContact(ancestor); }
	public static class Batch extends BatchContact{}
	public static class Meta extends MetaContact{}
	public static java.util.List<Contact> convertRawList(java.util.List<com.google.appengine.api.datastore.Entity> rawData){
		if(rawData == null){return null;}
		else{
			java.util.ArrayList<Contact> ret = new java.util.ArrayList<>();
			for(com.google.appengine.api.datastore.Entity data : rawData){
				ret.add(new Contact(data));
			}
			return ret;
		}
	}
	public static final String ENTITY_NAME = "Contact";
	public static class Key{
		private Key(){}
		public static com.google.appengine.api.datastore.Key cloneKey(com.google.appengine.api.datastore.Key rawKey){
			return Contact.Key.createRawKey(rawKey.getId());
		}
		public static com.google.appengine.api.datastore.Key createRawKey(String entityName, Long id){
			if(id == null){
				return null;
			}
			return com.google.appengine.api.datastore.KeyFactory.createKey(entityName, id);
		}
		public static com.google.appengine.api.datastore.Key createRawKey(Long id){
			if(id == null){
				return null;
			}
			return com.google.appengine.api.datastore.KeyFactory.createKey(ENTITY_NAME, id);
		}
		public static final Long getId(com.google.appengine.api.datastore.Key rawKey){
			return rawKey.getId();
		}
	}
/* END */
}
