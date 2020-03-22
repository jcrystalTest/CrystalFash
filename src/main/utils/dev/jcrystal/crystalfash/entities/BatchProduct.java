package dev.jcrystal.crystalfash.entities;
public class BatchProduct{
	public static <T> java.util.List<Product> get(java.util.stream.Stream<T> it, java.util.function.Function<T, Long> mapper){
		return get(it.map(mapper).filter(f->f != null).collect(java.util.stream.Collectors.toList()));
	}
	public static <T> java.util.List<Product> get(java.util.List<T> it, java.util.function.Function<T, Long> mapper){
		return get(it.stream(), mapper);
	}
	public static java.util.List<Product> get(java.util.stream.Stream<Long> it){
		if(it == null){return new java.util.ArrayList<>();}
		return get(it.filter(f->f != null).collect(java.util.stream.Collectors.toList()));
	}
	public static java.util.List<Product> get(java.util.Collection<Long> it){
		if(it == null || it.isEmpty()){return new java.util.ArrayList<>();}
		jcrystal.context.CrystalContext $ctx = jcrystal.context.CrystalContext.get();
		return $ctx.DefaultDB().service.get($ctx.DefaultDB().getTxn(), new jcrystal.utils.IterableTransform<Long, com.google.appengine.api.datastore.Key>(it){ @Override public com.google.appengine.api.datastore.Key transform(Long v) { return Product.Key.createRawKey(v); }}).values().stream().map(ent->new Product(ent)).collect(java.util.stream.Collectors.toList());
	}
	public static java.util.List<Product> getFromKeys(Iterable<com.google.appengine.api.datastore.Key> keys){
		java.util.List<Product> ret = new java.util.ArrayList<>();
		for(com.google.appengine.api.datastore.Entity ent : jcrystal.context.CrystalContext.get().DefaultDB().service.get(null, keys).values())ret.add(new Product(ent));
		return ret;
	}
	public static void put(java.lang.Iterable<Product> it){
		jcrystal.context.CrystalContext $ctx = jcrystal.context.CrystalContext.get();
		$ctx.DefaultDB().service.put(null, new jcrystal.utils.IterableTransform<Product, com.google.appengine.api.datastore.Entity>(it){ @Override public com.google.appengine.api.datastore.Entity transform(Product v) { return v.rawEntity; }});
	}
	public static void delete(java.lang.Iterable<Product> it){
		jcrystal.context.CrystalContext $ctx = jcrystal.context.CrystalContext.get();
		$ctx.DefaultDB().service.delete(null, new jcrystal.utils.IterableTransform<Product, com.google.appengine.api.datastore.Key>(it){ @Override public com.google.appengine.api.datastore.Key transform(Product v) { return v.rawEntity.getKey(); }});
	}
}
