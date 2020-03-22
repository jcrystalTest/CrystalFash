package dev.jcrystal.crystalfash.security;
public class BatchToken{
	public static <T> java.util.List<Token> get(java.util.stream.Stream<T> it, java.util.function.Function<T, String> mapper){
		return get(it.map(mapper).filter(f->f != null).collect(java.util.stream.Collectors.toList()));
	}
	public static <T> java.util.List<Token> get(java.util.List<T> it, java.util.function.Function<T, String> mapper){
		return get(it.stream(), mapper);
	}
	public static java.util.List<Token> get(java.util.stream.Stream<String> it){
		if(it == null){return new java.util.ArrayList<>();}
		return get(it.filter(f->f != null).collect(java.util.stream.Collectors.toList()));
	}
	public static java.util.List<Token> get(java.util.Collection<String> it){
		if(it == null || it.isEmpty()){return new java.util.ArrayList<>();}
		jcrystal.context.CrystalContext $ctx = jcrystal.context.CrystalContext.get();
		return $ctx.DefaultDB().service.get($ctx.DefaultDB().getTxn(), new jcrystal.utils.IterableTransform<String, com.google.appengine.api.datastore.Key>(it){ @Override public com.google.appengine.api.datastore.Key transform(String v) { return Token.Key.createRawKey(v); }}).values().stream().map(ent->new Token(ent)).collect(java.util.stream.Collectors.toList());
	}
	public static java.util.List<Token> getFromKeys(Iterable<com.google.appengine.api.datastore.Key> keys){
		java.util.List<Token> ret = new java.util.ArrayList<>();
		for(com.google.appengine.api.datastore.Entity ent : jcrystal.context.CrystalContext.get().DefaultDB().service.get(null, keys).values())ret.add(new Token(ent));
		return ret;
	}
	public static void put(java.lang.Iterable<Token> it){
		jcrystal.context.CrystalContext $ctx = jcrystal.context.CrystalContext.get();
		$ctx.DefaultDB().service.put(null, new jcrystal.utils.IterableTransform<Token, com.google.appengine.api.datastore.Entity>(it){ @Override public com.google.appengine.api.datastore.Entity transform(Token v) { return v.rawEntity; }});
	}
	public static void delete(java.lang.Iterable<Token> it){
		jcrystal.context.CrystalContext $ctx = jcrystal.context.CrystalContext.get();
		$ctx.DefaultDB().service.delete(null, new jcrystal.utils.IterableTransform<Token, com.google.appengine.api.datastore.Key>(it){ @Override public com.google.appengine.api.datastore.Key transform(Token v) { return v.rawEntity.getKey(); }});
	}
}
