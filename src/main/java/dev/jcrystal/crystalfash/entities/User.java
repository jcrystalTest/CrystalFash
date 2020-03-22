package dev.jcrystal.crystalfash.entities;

import com.google.appengine.api.datastore.Email;

import jcrystal.datetime.CrystalDateMilis;
import jcrystal.entity.types.security.FirebaseAccount;
import jcrystal.reflection.annotations.EntityProperty;
import jcrystal.reflection.annotations.IndexType;
import jcrystal.reflection.annotations.jEntity;
import jcrystal.server.Entity;
@jEntity
public class User implements Entity.DefaultDB{
	@EntityProperty
	private static FirebaseAccount firebaseId;
	@EntityProperty
	private static String name;
	@EntityProperty(index = IndexType.UNIQUE)
	private static Email email;

	@EntityProperty(autoNow = true, index = IndexType.MULTIPLE)
	private static final CrystalDateMilis creation = null;
/* GEN */
	protected final com.google.appengine.api.datastore.Entity rawEntity;
	public final com.google.appengine.api.datastore.Entity getRawEntity(){return rawEntity;}
	public User(com.google.appengine.api.datastore.Entity rawEntity){
		this.rawEntity = rawEntity;
	}
	public User(){
		rawEntity = new com.google.appengine.api.datastore.Entity(ENTITY_NAME);
		creation(new java.util.Date());
	}
	protected User(String entityName){
		rawEntity = new com.google.appengine.api.datastore.Entity(entityName);
		creation(new java.util.Date());
	}
	public User cloneFrom(User from){
		this.rawEntity.setPropertiesFrom(from.rawEntity);
		return this;
	}
	public Long id(){
		return rawEntity.getKey().getId();
	}
	public User put(){
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
	public static User get(com.google.appengine.api.datastore.Key $key){
		com.google.appengine.api.datastore.Entity ent = rawGet($key);
		if(ent == null)return null;
		return new User(ent);
	}
	public static User get(Long id){
		com.google.appengine.api.datastore.Entity ent = rawGet(Key.createRawKey(id));
		if(ent == null)return null;
		return new User(ent);
	}
	public static boolean exist(Long id){
		return rawGet(Key.createRawKey(id)) != null;
	}
	public static User tryGet(com.google.appengine.api.datastore.Key $key){
		com.google.appengine.api.datastore.Entity ent = rawGet($key);
		if(ent == null)throw new jcrystal.utils.InternalException(17, "Invalid identifier");
		return new User(ent);
	}
	public static User tryGet(Long id){
		return tryGet(Key.createRawKey(id));
	}
	public static User tryGet(Long id, User $defValue){
		User ent = get(id);
		if(ent == null)return $defValue;
		return ent;
	}
	public User firebaseId(String firebaseId){
		rawEntity.setIndexedProperty("firebaseId", firebaseId);
		return this;
	}
	public User name(String name){
		rawEntity.setUnindexedProperty("name", name);
		return this;
	}
	public User email(com.google.appengine.api.datastore.Email email){
		rawEntity.setIndexedProperty("email", email);
		return this;
	}
	private User creation(java.util.Date creation){
		rawEntity.setIndexedProperty("creation", creation);
		return this;
	}
	public String firebaseId(){
		return jcrystal.db.datastore.EntityUtils.getString(rawEntity, "firebaseId");
	}
	public String name(){
		return jcrystal.db.datastore.EntityUtils.getString(rawEntity, "name");
	}
	public com.google.appengine.api.datastore.Email email(){
		return (Email)rawEntity.getProperty("email");
	}
	public java.util.Date creation(){
		return (java.util.Date)rawEntity.getProperty("creation");
	}
	public static class CachedGetter{
		private java.util.TreeMap<Long, User> cache = new java.util.TreeMap<>();
		public User get(Long id){
			User ret = cache.get(id);
			if(ret == null){
				cache.put(id, ret = User.get(id));
			}
			return ret;
		}
	}
	public static class Post extends PostUser{}
	public static class Serializer extends SerializerUser{}
	public static QueryUser Query = new QueryUser();
	public static QueryUser Query(com.google.appengine.api.datastore.Key ancestor){ return new QueryUser(ancestor); }
	public static class Batch extends BatchUser{}
	public static class Meta extends MetaUser{}
	public static java.util.List<User> convertRawList(java.util.List<com.google.appengine.api.datastore.Entity> rawData){
		if(rawData == null){return null;}
		else{
			java.util.ArrayList<User> ret = new java.util.ArrayList<>();
			for(com.google.appengine.api.datastore.Entity data : rawData){
				ret.add(new User(data));
			}
			return ret;
		}
	}
	public static final String ENTITY_NAME = "User";
	public static class Key{
		private Key(){}
		public static com.google.appengine.api.datastore.Key cloneKey(com.google.appengine.api.datastore.Key rawKey){
			return User.Key.createRawKey(rawKey.getId());
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
