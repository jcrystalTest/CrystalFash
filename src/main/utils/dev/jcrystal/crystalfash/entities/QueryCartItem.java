package dev.jcrystal.crystalfash.entities;
import dev.jcrystal.crystalfash.entities.CartItem;
import static dev.jcrystal.crystalfash.entities.CartItem.ENTITY_NAME;
public class QueryCartItem{
	protected QueryCartItem(){}
	public static HelperProduct Product = new HelperProduct();
	public static class HelperProduct extends jcrystal.db.datastore.query.AbsBaseHelper<HelperProduct,CartItem>{
		private HelperProduct(){
			super(jcrystal.context.CrystalContext.get().DefaultDB());
		}
		@Override public HelperProduct create(){return new HelperProduct();}
		@Override public CartItem create(com.google.appengine.api.datastore.Entity entidad){
			return new CartItem(entidad);
		}
		public java.util.List<CartItem> getLessThan(Long product){
			return getLessThan(product, (java.util.function.Predicate<CartItem>)null);
		}
		public CartItem getLessThanFirst(Long product){
			return getLessThanFirst(product, (java.util.function.Predicate<CartItem>)null);
		}
		public java.util.List<CartItem> getLessThan(Long product, java.util.function.Predicate<CartItem> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("product", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, product));
			return processQuery(q, filtro);
		}
		public CartItem getLessThanFirst(Long product, java.util.function.Predicate<CartItem> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("product", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, product));
			return processQueryUnique(q, filtro);
		}
		public java.util.List<CartItem> getLessThanOrEqual(Long product){
			return getLessThanOrEqual(product, (java.util.function.Predicate<CartItem>)null);
		}
		public CartItem getLessThanOrEqualFirst(Long product){
			return getLessThanOrEqualFirst(product, (java.util.function.Predicate<CartItem>)null);
		}
		public java.util.List<CartItem> getLessThanOrEqual(Long product, java.util.function.Predicate<CartItem> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("product", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN_OR_EQUAL, product));
			return processQuery(q, filtro);
		}
		public CartItem getLessThanOrEqualFirst(Long product, java.util.function.Predicate<CartItem> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("product", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN_OR_EQUAL, product));
			return processQueryUnique(q, filtro);
		}
		public java.util.List<CartItem> getGreaterThan(Long product){
			return getGreaterThan(product, (java.util.function.Predicate<CartItem>)null);
		}
		public CartItem getGreaterThanFirst(Long product){
			return getGreaterThanFirst(product, (java.util.function.Predicate<CartItem>)null);
		}
		public java.util.List<CartItem> getGreaterThan(Long product, java.util.function.Predicate<CartItem> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("product", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN, product));
			return processQuery(q, filtro);
		}
		public CartItem getGreaterThanFirst(Long product, java.util.function.Predicate<CartItem> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("product", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN, product));
			return processQueryUnique(q, filtro);
		}
		public java.util.List<CartItem> getGreaterThanOrEqual(Long product){
			return getGreaterThanOrEqual(product, (java.util.function.Predicate<CartItem>)null);
		}
		public CartItem getGreaterThanOrEqualFirst(Long product){
			return getGreaterThanOrEqualFirst(product, (java.util.function.Predicate<CartItem>)null);
		}
		public java.util.List<CartItem> getGreaterThanOrEqual(Long product, java.util.function.Predicate<CartItem> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("product", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, product));
			return processQuery(q, filtro);
		}
		public CartItem getGreaterThanOrEqualFirst(Long product, java.util.function.Predicate<CartItem> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("product", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, product));
			return processQueryUnique(q, filtro);
		}
		public CartItem get(Long product){
			return get(product, (java.util.function.Predicate<CartItem>)null);
		}
		public CartItem get(Long product, java.util.function.Predicate<CartItem> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("product", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, product));
			return processQueryUnique(q, filtro);
		}
		public java.util.List<CartItem> getIn(Long product, Long upperProduct){
			return getIn(product, upperProduct, (java.util.function.Predicate<CartItem>)null);
		}
		public CartItem getInFirst(Long product, Long upperProduct){
			return getInFirst(product, upperProduct, (java.util.function.Predicate<CartItem>)null);
		}
		public java.util.List<CartItem> getIn(Long product, Long upperProduct, java.util.function.Predicate<CartItem> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.CompositeFilter(com.google.appengine.api.datastore.Query.CompositeFilterOperator.AND, java.util.Arrays.asList((com.google.appengine.api.datastore.Query.Filter)new com.google.appengine.api.datastore.Query.FilterPredicate("product", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, product),new com.google.appengine.api.datastore.Query.FilterPredicate("product", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, upperProduct))));
			return processQuery(q, filtro);
		}
		public CartItem getInFirst(Long product, Long upperProduct, java.util.function.Predicate<CartItem> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.CompositeFilter(com.google.appengine.api.datastore.Query.CompositeFilterOperator.AND, java.util.Arrays.asList((com.google.appengine.api.datastore.Query.Filter)new com.google.appengine.api.datastore.Query.FilterPredicate("product", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, product),new com.google.appengine.api.datastore.Query.FilterPredicate("product", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, upperProduct))));
			return processQueryUnique(q, filtro);
		}
	}
	public static java.util.ArrayList<CartItem> getAll(){
		return getAll((java.util.function.Predicate<CartItem>)null);
	}
	public static java.util.ArrayList<CartItem> getAll(java.util.function.Predicate<CartItem> filtro){
		com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query("CartItem");
		java.util.ArrayList<CartItem> ret = new java.util.ArrayList<>();
		for(com.google.appengine.api.datastore.Entity ent : jcrystal.context.CrystalContext.get().DefaultDB().service.prepare(null, q).asIterable()){
			CartItem toAdd = new CartItem(ent);
			if(filtro == null || filtro.test(toAdd)){
				ret.add(toAdd);
			}
		}
		return ret;
	}
	public static java.util.ArrayList<CartItem> getAllKeys(){
		com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query("CartItem").setKeysOnly();
		java.util.ArrayList<CartItem> ret = new java.util.ArrayList<>();
		for(com.google.appengine.api.datastore.Entity ent : jcrystal.context.CrystalContext.get().DefaultDB().service.prepare(null, q).asIterable()){
			CartItem toAdd = new CartItem(ent);
			ret.add(toAdd);
		}
		return ret;
	}
}
