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
	public static final String ENTITY_NAME = "Contact";
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
		jcrystal.context.CrystalContext.get().DefaultDB().service.put(null, rawEntity);
		return this;
	}
	public Contact putTxn(){
		jcrystal.context.CrystalContext $ctx = jcrystal.context.CrystalContext.get();
		$ctx.DefaultDB().service.put($ctx.DefaultDB().getTxn(), rawEntity);
		return this;
	}
	public static com.google.appengine.api.datastore.Entity rawGetTxn(Long id){
		if(null == id){return null;}
		try{
			jcrystal.context.CrystalContext $ctx = jcrystal.context.CrystalContext.get();
			return $ctx.DefaultDB().service.get($ctx.DefaultDB().getTxn(), Contact.Key.createRawKey(id));
		}
		catch(com.google.appengine.api.datastore.EntityNotFoundException | java.lang.IllegalArgumentException e){
			return null;
		}
	}
	public static com.google.appengine.api.datastore.Entity rawGet(Long id){
		if(null == id){return null;}
		try{
			return jcrystal.context.CrystalContext.get().DefaultDB().service.get(null, Contact.Key.createRawKey(id));
		}
		catch(com.google.appengine.api.datastore.EntityNotFoundException | java.lang.IllegalArgumentException e){
			return null;
		}
	}
	public static Contact get(Long id){
		com.google.appengine.api.datastore.Entity ent = rawGet(id);
		if(ent == null)return null;
		return new Contact(ent);
	}
	public static Contact getTxn(Long id){
		com.google.appengine.api.datastore.Entity ent = rawGetTxn(id);
		if(ent == null)return null;
		return new Contact(ent);
	}
	public static Contact get(com.google.appengine.api.datastore.Key $key){
		if($key == null){return null;}
		try{
			return new Contact(jcrystal.context.CrystalContext.get().DefaultDB().service.get(null, $key));
		}
		catch(com.google.appengine.api.datastore.EntityNotFoundException | java.lang.IllegalArgumentException e){
			return null;
		}
	}
	public static Contact getTxn(com.google.appengine.api.datastore.Key $key){
		if($key == null){return null;}
		try{
			jcrystal.context.CrystalContext $ctx = jcrystal.context.CrystalContext.get();
			return new Contact($ctx.DefaultDB().service.get($ctx.DefaultDB().getTxn(), $key));
		}
		catch(com.google.appengine.api.datastore.EntityNotFoundException | java.lang.IllegalArgumentException e){
			return null;
		}
	}
	public static boolean exist(Long id){
		com.google.appengine.api.datastore.Entity ent = rawGet(id);
		return ent != null;
	}
	public static Contact tryGet(Long id){
		com.google.appengine.api.datastore.Entity ent = rawGet(id);
		if(ent == null)throw new jcrystal.utils.InternalException(17, "Identificador invalido");
		return new Contact(ent);
	}
	public static Contact tryGet(Long id, Contact $defValue){
		com.google.appengine.api.datastore.Entity ent = rawGet(id);
		if(ent == null)return $defValue;
		return new Contact(ent);
	}
	public static Contact tryGetTxn(Long id){
		com.google.appengine.api.datastore.Entity ent = rawGetTxn(id);
		if(ent == null)throw new jcrystal.utils.InternalException(17, "Identificador invalido");
		return new Contact(ent);
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
		if(!rawEntity.hasProperty("name")){
			rawEntity.setUnindexedProperty("name", new com.google.appengine.api.datastore.EmbeddedEntity());
		}
		return jcrystal.db.datastore.EntityUtils.getString(rawEntity, "name");
	}
	public String email(){
		if(!rawEntity.hasProperty("email")){
			rawEntity.setUnindexedProperty("email", new com.google.appengine.api.datastore.EmbeddedEntity());
		}
		return jcrystal.db.datastore.EntityUtils.getString(rawEntity, "email");
	}
	public String message(){
		if(!rawEntity.hasProperty("message")){
			rawEntity.setUnindexedProperty("message", new com.google.appengine.api.datastore.EmbeddedEntity());
		}
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
	public static class Query extends QueryContact{}
	public static class Batch extends BatchContact{}
	public static class Key{
		private Key(){}
		public static com.google.appengine.api.datastore.Key createRawKey(Long id){
			return com.google.appengine.api.datastore.KeyFactory.createKey(ENTITY_NAME, id);
		}
	}
	public static class Meta extends MetaContact{}
/* END */
}
