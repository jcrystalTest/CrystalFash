package dev.jcrystal.crystalfash.security;

import static jcrystal.utils.ManagerUtils.assertEq;

import dev.jcrystal.crystalfash.entities.User;
import jcrystal.json.JsonLevel;
import jcrystal.reflection.annotations.EntityKey;
import jcrystal.reflection.annotations.EntityProperty;
import jcrystal.reflection.annotations.LoginResultClass;
import jcrystal.reflection.annotations.jEntity;
import jcrystal.reflection.annotations.entities.RelMto1;
import jcrystal.security.SecurityToken;
import jcrystal.server.Entity;
import jcrystal.utils.ManagerUtils;

@jEntity @LoginResultClass
public class Token implements Entity.DefaultDB, SecurityToken{
	
	@EntityKey
	private static final String token = null;
	@EntityProperty
	private static long rol;
	
	@RelMto1(keyLevel=JsonLevel.NORMAL)
	private static User user;

/* GEN */
	private boolean needsUpdate = true;
	public void cancelAutomaticUpdate(){needsUpdate = false;}
	public boolean needsUpdate(){return needsUpdate;}
	@Override public void delete(){cancelAutomaticUpdate();Entity.DefaultDB.super.delete();}
	protected final com.google.appengine.api.datastore.Entity rawEntity;
	public final com.google.appengine.api.datastore.Entity getRawEntity(){return rawEntity;}
	public Token(com.google.appengine.api.datastore.Entity rawEntity){
		this.rawEntity = rawEntity;
	}
	public Token(String token){
		rawEntity = new com.google.appengine.api.datastore.Entity(Key.createRawKey(token));
	}
	protected Token(String entityName, String token){
		rawEntity = new com.google.appengine.api.datastore.Entity(Key.createRawKey(entityName, token));
	}
	public Token cloneFrom(Token from){
		this.rawEntity.setPropertiesFrom(from.rawEntity);
		return this;
	}
	public String token(){
		return rawEntity.getKey().getName();
	}
	public Token put(){
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
	public static Token get(com.google.appengine.api.datastore.Key $key){
		com.google.appengine.api.datastore.Entity ent = rawGet($key);
		if(ent == null)return null;
		return new Token(ent);
	}
	public static Token get(String token){
		com.google.appengine.api.datastore.Entity ent = rawGet(Key.createRawKey(token));
		if(ent == null)return null;
		return new Token(ent);
	}
	public static boolean exist(String token){
		return rawGet(Key.createRawKey(token)) != null;
	}
	public static Token tryGet(com.google.appengine.api.datastore.Key $key){
		com.google.appengine.api.datastore.Entity ent = rawGet($key);
		if(ent == null)throw new jcrystal.utils.InternalException(17, "Invalid identifier");
		return new Token(ent);
	}
	public static Token tryGet(String token){
		return tryGet(Key.createRawKey(token));
	}
	public static Token tryGet(String token, Token $defValue){
		Token ent = get(token);
		if(ent == null)return $defValue;
		return ent;
	}
	public Token rol(long rol){
		rawEntity.setUnindexedProperty("rol", rol);
		return this;
	}
	public Token user(dev.jcrystal.crystalfash.entities.User val){
		if(val != null){
			rawEntity.setIndexedProperty("user", val.id());
		}
		else{
			rawEntity.setIndexedProperty("user", null);
		}
		return this;
	}
	public Token user(Long id){
		rawEntity.setIndexedProperty("user", id);
		return this;
	}
	public long rol(){
		return jcrystal.db.datastore.EntityUtils.getLong(rawEntity, "rol", 0);
	}
	public Long user$Key(){
		return (Long)rawEntity.getProperty("user");
	}
	public dev.jcrystal.crystalfash.entities.User user(){
		return dev.jcrystal.crystalfash.entities.User.get(user$Key());
	}
	public static class CachedGetter{
		private java.util.TreeMap<String, Token> cache = new java.util.TreeMap<>();
		public Token get(String token){
			Token ret = cache.get(token);
			if(ret == null){
				cache.put(token, ret = Token.get(token));
			}
			return ret;
		}
	}
	public static Token generateTokenBase64(String value){
		try{
			java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-256");
			byte[] hash = md.digest((value + "KFsWV4g1bnh1ooinhpag-7mfbujo826ife6g82d2aavp3an" + System.currentTimeMillis()).getBytes("UTF-8"));
			return new Token(java.util.Base64.getEncoder().encodeToString(hash));
		}
		catch(java.io.UnsupportedEncodingException | java.security.NoSuchAlgorithmException ex){
			throw new jcrystal.http.responses.HttpInternalServerError500("Internal server error generating authentication token");
		}
	}
	public static class Serializer extends SerializerToken{}
	public static QueryToken Query = new QueryToken();
	public static QueryToken Query(com.google.appengine.api.datastore.Key ancestor){ return new QueryToken(ancestor); }
	public static class Batch extends BatchToken{}
	public static class Meta extends MetaToken{}
	public static java.util.List<Token> convertRawList(java.util.List<com.google.appengine.api.datastore.Entity> rawData){
		if(rawData == null){return null;}
		else{
			java.util.ArrayList<Token> ret = new java.util.ArrayList<>();
			for(com.google.appengine.api.datastore.Entity data : rawData){
				ret.add(new Token(data));
			}
			return ret;
		}
	}
	public static final String ENTITY_NAME = "Token";
	public static class Key{
		private Key(){}
		public static com.google.appengine.api.datastore.Key cloneKey(com.google.appengine.api.datastore.Key rawKey){
			return Token.Key.createRawKey(rawKey.getName());
		}
		public static com.google.appengine.api.datastore.Key createRawKey(String entityName, String token){
			if(token == null){
				return null;
			}
			return com.google.appengine.api.datastore.KeyFactory.createKey(entityName, token);
		}
		public static com.google.appengine.api.datastore.Key createRawKey(String token){
			if(token == null){
				return null;
			}
			return com.google.appengine.api.datastore.KeyFactory.createKey(ENTITY_NAME, token);
		}
		public static final String getToken(com.google.appengine.api.datastore.Key rawKey){
			return rawKey.getName();
		}
	}
/* END */
}
