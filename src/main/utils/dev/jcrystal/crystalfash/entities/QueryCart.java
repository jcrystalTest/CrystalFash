package dev.jcrystal.crystalfash.entities;
import dev.jcrystal.crystalfash.entities.Cart;
import static dev.jcrystal.crystalfash.entities.Cart.ENTITY_NAME;
public class QueryCart{
	protected QueryCart(){}
	public static HelperItems Items = new HelperItems();
	public static class HelperItems extends jcrystal.db.datastore.query.AbsBaseHelper<HelperItems,Cart>{
		private HelperItems(){
			super(jcrystal.context.CrystalContext.get().DefaultDB());
		}
		@Override public HelperItems create(){return new HelperItems();}
		@Override public Cart create(com.google.appengine.api.datastore.Entity entidad){
			return new Cart(entidad);
		}
		public java.util.List<Cart> getLessThan(Long items){
			return getLessThan(items, (java.util.function.Predicate<Cart>)null);
		}
		public Cart getLessThanFirst(Long items){
			return getLessThanFirst(items, (java.util.function.Predicate<Cart>)null);
		}
		public java.util.List<Cart> getLessThan(Long items, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, items));
			return processQuery(q, filtro);
		}
		public Cart getLessThanFirst(Long items, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, items));
			return processQueryUnique(q, filtro);
		}
		public java.util.List<Cart> getLessThanOrEqual(Long items){
			return getLessThanOrEqual(items, (java.util.function.Predicate<Cart>)null);
		}
		public Cart getLessThanOrEqualFirst(Long items){
			return getLessThanOrEqualFirst(items, (java.util.function.Predicate<Cart>)null);
		}
		public java.util.List<Cart> getLessThanOrEqual(Long items, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN_OR_EQUAL, items));
			return processQuery(q, filtro);
		}
		public Cart getLessThanOrEqualFirst(Long items, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN_OR_EQUAL, items));
			return processQueryUnique(q, filtro);
		}
		public java.util.List<Cart> getGreaterThan(Long items){
			return getGreaterThan(items, (java.util.function.Predicate<Cart>)null);
		}
		public Cart getGreaterThanFirst(Long items){
			return getGreaterThanFirst(items, (java.util.function.Predicate<Cart>)null);
		}
		public java.util.List<Cart> getGreaterThan(Long items, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN, items));
			return processQuery(q, filtro);
		}
		public Cart getGreaterThanFirst(Long items, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN, items));
			return processQueryUnique(q, filtro);
		}
		public java.util.List<Cart> getGreaterThanOrEqual(Long items){
			return getGreaterThanOrEqual(items, (java.util.function.Predicate<Cart>)null);
		}
		public Cart getGreaterThanOrEqualFirst(Long items){
			return getGreaterThanOrEqualFirst(items, (java.util.function.Predicate<Cart>)null);
		}
		public java.util.List<Cart> getGreaterThanOrEqual(Long items, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, items));
			return processQuery(q, filtro);
		}
		public Cart getGreaterThanOrEqualFirst(Long items, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, items));
			return processQueryUnique(q, filtro);
		}
		public java.util.List<Cart> get(Long items){
			return get(items, (java.util.function.Predicate<Cart>)null);
		}
		public Cart getFirst(Long items){
			return getFirst(items, (java.util.function.Predicate<Cart>)null);
		}
		public java.util.List<Cart> get(Long items, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, items));
			return processQuery(q, filtro);
		}
		public Cart getFirst(Long items, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, items));
			return processQueryUnique(q, filtro);
		}
		public java.util.List<Cart> getIn(Long items, Long upperItems){
			return getIn(items, upperItems, (java.util.function.Predicate<Cart>)null);
		}
		public Cart getInFirst(Long items, Long upperItems){
			return getInFirst(items, upperItems, (java.util.function.Predicate<Cart>)null);
		}
		public java.util.List<Cart> getIn(Long items, Long upperItems, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.CompositeFilter(com.google.appengine.api.datastore.Query.CompositeFilterOperator.AND, java.util.Arrays.asList((com.google.appengine.api.datastore.Query.Filter)new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, items),new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, upperItems))));
			return processQuery(q, filtro);
		}
		public Cart getInFirst(Long items, Long upperItems, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.CompositeFilter(com.google.appengine.api.datastore.Query.CompositeFilterOperator.AND, java.util.Arrays.asList((com.google.appengine.api.datastore.Query.Filter)new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, items),new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, upperItems))));
			return processQueryUnique(q, filtro);
		}
	}
	public static HelperFavorites Favorites = new HelperFavorites();
	public static class HelperFavorites extends jcrystal.db.datastore.query.AbsBaseHelper<HelperFavorites,Cart>{
		private HelperFavorites(){
			super(jcrystal.context.CrystalContext.get().DefaultDB());
		}
		@Override public HelperFavorites create(){return new HelperFavorites();}
		@Override public Cart create(com.google.appengine.api.datastore.Entity entidad){
			return new Cart(entidad);
		}
		public java.util.List<Cart> getLessThan(Long favorites){
			return getLessThan(favorites, (java.util.function.Predicate<Cart>)null);
		}
		public Cart getLessThanFirst(Long favorites){
			return getLessThanFirst(favorites, (java.util.function.Predicate<Cart>)null);
		}
		public java.util.List<Cart> getLessThan(Long favorites, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, favorites));
			return processQuery(q, filtro);
		}
		public Cart getLessThanFirst(Long favorites, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, favorites));
			return processQueryUnique(q, filtro);
		}
		public java.util.List<Cart> getLessThanOrEqual(Long favorites){
			return getLessThanOrEqual(favorites, (java.util.function.Predicate<Cart>)null);
		}
		public Cart getLessThanOrEqualFirst(Long favorites){
			return getLessThanOrEqualFirst(favorites, (java.util.function.Predicate<Cart>)null);
		}
		public java.util.List<Cart> getLessThanOrEqual(Long favorites, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN_OR_EQUAL, favorites));
			return processQuery(q, filtro);
		}
		public Cart getLessThanOrEqualFirst(Long favorites, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN_OR_EQUAL, favorites));
			return processQueryUnique(q, filtro);
		}
		public java.util.List<Cart> getGreaterThan(Long favorites){
			return getGreaterThan(favorites, (java.util.function.Predicate<Cart>)null);
		}
		public Cart getGreaterThanFirst(Long favorites){
			return getGreaterThanFirst(favorites, (java.util.function.Predicate<Cart>)null);
		}
		public java.util.List<Cart> getGreaterThan(Long favorites, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN, favorites));
			return processQuery(q, filtro);
		}
		public Cart getGreaterThanFirst(Long favorites, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN, favorites));
			return processQueryUnique(q, filtro);
		}
		public java.util.List<Cart> getGreaterThanOrEqual(Long favorites){
			return getGreaterThanOrEqual(favorites, (java.util.function.Predicate<Cart>)null);
		}
		public Cart getGreaterThanOrEqualFirst(Long favorites){
			return getGreaterThanOrEqualFirst(favorites, (java.util.function.Predicate<Cart>)null);
		}
		public java.util.List<Cart> getGreaterThanOrEqual(Long favorites, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, favorites));
			return processQuery(q, filtro);
		}
		public Cart getGreaterThanOrEqualFirst(Long favorites, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, favorites));
			return processQueryUnique(q, filtro);
		}
		public java.util.List<Cart> get(Long favorites){
			return get(favorites, (java.util.function.Predicate<Cart>)null);
		}
		public Cart getFirst(Long favorites){
			return getFirst(favorites, (java.util.function.Predicate<Cart>)null);
		}
		public java.util.List<Cart> get(Long favorites, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, favorites));
			return processQuery(q, filtro);
		}
		public Cart getFirst(Long favorites, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, favorites));
			return processQueryUnique(q, filtro);
		}
		public java.util.List<Cart> getIn(Long favorites, Long upperFavorites){
			return getIn(favorites, upperFavorites, (java.util.function.Predicate<Cart>)null);
		}
		public Cart getInFirst(Long favorites, Long upperFavorites){
			return getInFirst(favorites, upperFavorites, (java.util.function.Predicate<Cart>)null);
		}
		public java.util.List<Cart> getIn(Long favorites, Long upperFavorites, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.CompositeFilter(com.google.appengine.api.datastore.Query.CompositeFilterOperator.AND, java.util.Arrays.asList((com.google.appengine.api.datastore.Query.Filter)new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, favorites),new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, upperFavorites))));
			return processQuery(q, filtro);
		}
		public Cart getInFirst(Long favorites, Long upperFavorites, java.util.function.Predicate<Cart> filtro){
			com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.CompositeFilter(com.google.appengine.api.datastore.Query.CompositeFilterOperator.AND, java.util.Arrays.asList((com.google.appengine.api.datastore.Query.Filter)new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, favorites),new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, upperFavorites))));
			return processQueryUnique(q, filtro);
		}
	}
	public static java.util.ArrayList<Cart> getAll(){
		return getAll((java.util.function.Predicate<Cart>)null);
	}
	public static java.util.ArrayList<Cart> getAll(java.util.function.Predicate<Cart> filtro){
		com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query("Cart");
		java.util.ArrayList<Cart> ret = new java.util.ArrayList<>();
		for(com.google.appengine.api.datastore.Entity ent : jcrystal.context.CrystalContext.get().DefaultDB().service.prepare(null, q).asIterable()){
			Cart toAdd = new Cart(ent);
			if(filtro == null || filtro.test(toAdd)){
				ret.add(toAdd);
			}
		}
		return ret;
	}
	public static java.util.ArrayList<Cart> getAllKeys(){
		com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query("Cart").setKeysOnly();
		java.util.ArrayList<Cart> ret = new java.util.ArrayList<>();
		for(com.google.appengine.api.datastore.Entity ent : jcrystal.context.CrystalContext.get().DefaultDB().service.prepare(null, q).asIterable()){
			Cart toAdd = new Cart(ent);
			ret.add(toAdd);
		}
		return ret;
	}
}
