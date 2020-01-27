package dev.jcrystal.crystalfash.entities;
import dev.jcrystal.crystalfash.entities.Product;
import static dev.jcrystal.crystalfash.entities.Product.ENTITY_NAME;
public class QueryProduct{
	protected QueryProduct(){}
	public static HelperCategory Category = new HelperCategory();
	public static class HelperCategory extends jcrystal.db.datastore.query.AbsBaseHelper<HelperCategory,Product>{
		private HelperCategory(){
			super(jcrystal.context.CrystalContext.get().DefaultDB());
		}
		@Override public HelperCategory create(){return new HelperCategory();}
		@Override public Product create(com.google.appengine.api.datastore.Entity entidad){
			return new Product(entidad);
		}
		public java.util.List<Product> get(dev.jcrystal.crystalfash.entities.Categories category){
			return get(category, (java.util.function.Predicate<Product>)null);
		}
		public Product getFirst(dev.jcrystal.crystalfash.entities.Categories category){
			return getFirst(category, (java.util.function.Predicate<Product>)null);
		}
		public java.util.List<Product> get(dev.jcrystal.crystalfash.entities.Categories category, java.util.function.Predicate<Product> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("category", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, category.id));
			return processQuery(q, filtro);
		}
		public Product getFirst(dev.jcrystal.crystalfash.entities.Categories category, java.util.function.Predicate<Product> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("category", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, category.id));
			return processQueryUnique(q, filtro);
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
