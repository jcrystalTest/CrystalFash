package dev.jcrystal.crystalfash.entities;
import dev.jcrystal.crystalfash.entities.Product;
import static dev.jcrystal.crystalfash.entities.Product.ENTITY_NAME;
public class QueryProduct{
	protected QueryProduct(){}
	public static HelperSize Size = new HelperSize();
	public static class HelperSize extends jcrystal.db.datastore.query.AbsBaseHelper<HelperSize,Product>{
		private HelperSize(){
			super(jcrystal.context.CrystalContext.get().DefaultDB());
		}
		@Override public HelperSize create(){return new HelperSize();}
		@Override public Product create(com.google.appengine.api.datastore.Entity entidad){
			return new Product(entidad);
		}
		public java.util.List<Product> get(dev.jcrystal.crystalfash.entities.Size size){
			return get(size, (java.util.function.Predicate<Product>)null);
		}
		public Product getFirst(dev.jcrystal.crystalfash.entities.Size size){
			return getFirst(size, (java.util.function.Predicate<Product>)null);
		}
		public java.util.List<Product> get(dev.jcrystal.crystalfash.entities.Size size, java.util.function.Predicate<Product> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("size", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, size.id));
			return processQuery(q, filtro);
		}
		public Product getFirst(dev.jcrystal.crystalfash.entities.Size size, java.util.function.Predicate<Product> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("size", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, size.id));
			return processQueryUnique(q, filtro);
		}
	}
	public static HelperBySize BySize = new HelperBySize();
	public static class HelperBySize extends jcrystal.db.datastore.query.AbsBaseHelper<HelperBySize, Product>{
		private HelperBySize(){
			super(jcrystal.context.CrystalContext.get().datastore);
		}
		@Override public HelperBySize create(){return new HelperBySize();}
		@Override public Product create(com.google.appengine.api.datastore.Entity entidad){
			return new Product(entidad);
		}
		public java.util.List<Product> get(dev.jcrystal.crystalfash.entities.Size size){
			java.util.List<com.google.appengine.api.datastore.Query.Filter> subFilters = new java.util.ArrayList<>(1);
			if(size != null){
				subFilters.add(new com.google.appengine.api.datastore.Query.FilterPredicate("size", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, size.id));
			}
			com.google.appengine.api.datastore.Query.Filter f = com.google.appengine.api.datastore.Query.CompositeFilterOperator.AND.of(subFilters);
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(f);
			return processQuery(q);
		}
		public java.util.List<Product> get(dev.jcrystal.crystalfash.entities.Size size, dev.jcrystal.crystalfash.entities.Size upperSize){
			java.util.List<com.google.appengine.api.datastore.Query.Filter> subFilters = new java.util.ArrayList<>(1);
			if(size != null){
				subFilters.add(new com.google.appengine.api.datastore.Query.FilterPredicate("size", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, size.id));
			}
			if(upperSize != null){
				subFilters.add(new com.google.appengine.api.datastore.Query.FilterPredicate("size", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, upperSize.id));
			}
			com.google.appengine.api.datastore.Query.Filter f = com.google.appengine.api.datastore.Query.CompositeFilterOperator.AND.of(subFilters);
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(f);
			return processQuery(q);
		}
	}
	public static java.util.ArrayList<Product> getAll(){
		return getAll((java.util.function.Predicate<Product>)null);
	}
	public static java.util.ArrayList<Product> getAll(java.util.function.Predicate<Product> filtro){
		com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query("Product");
		java.util.ArrayList<Product> ret = new java.util.ArrayList<>();
		for(com.google.appengine.api.datastore.Entity ent : jcrystal.context.CrystalContext.get().DefaultDB().service.prepare(null, q).asIterable()){
			Product toAdd = new Product(ent);
			if(filtro == null || filtro.test(toAdd)){
				ret.add(toAdd);
			}
		}
		return ret;
	}
	public static java.util.ArrayList<Product> getAllKeys(){
		com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query("Product").setKeysOnly();
		java.util.ArrayList<Product> ret = new java.util.ArrayList<>();
		for(com.google.appengine.api.datastore.Entity ent : jcrystal.context.CrystalContext.get().DefaultDB().service.prepare(null, q).asIterable()){
			Product toAdd = new Product(ent);
			ret.add(toAdd);
		}
		return ret;
	}
}
