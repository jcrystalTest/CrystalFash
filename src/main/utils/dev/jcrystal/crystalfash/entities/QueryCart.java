package dev.jcrystal.crystalfash.entities;
import dev.jcrystal.crystalfash.entities.Cart;
import static dev.jcrystal.crystalfash.entities.Cart.ENTITY_NAME;
public class QueryCart extends jcrystal.db.datastore.query.AbsBaseHelper<QueryCart, Cart>{
	protected QueryCart(){
		super(jcrystal.context.CrystalContext.get().DefaultDB());
		this.ancestor = null;
	}
	protected QueryCart(com.google.appengine.api.datastore.Key ancestor){
		super(jcrystal.context.CrystalContext.get().DefaultDB(), ancestor);
	}
	@Override public QueryCart create(){return new QueryCart(ancestor);}
	@Override public Cart create(com.google.appengine.api.datastore.Entity entidad){
		return new Cart(entidad);
	}
	public java.util.List<Cart> items(Long items){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, items));
		return processQuery(q);
	}
	public Cart itemsFirst(Long items){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, items));
		return processQueryUnique(q);
	}
	public java.util.List<Cart> items(jcrystal.server.db.query.Op operator, Long items){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("items", operator.datastoreOp, items));
		return processQuery(q);
	}
	public java.util.List<Cart> items(Long items, Long upperItems){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.CompositeFilter(com.google.appengine.api.datastore.Query.CompositeFilterOperator.AND, java.util.Arrays.asList((com.google.appengine.api.datastore.Query.Filter)new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, items),new com.google.appengine.api.datastore.Query.FilterPredicate("items", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, upperItems))));
		return processQuery(q);
	}
	public java.util.List<Cart> favorites(Long favorites){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, favorites));
		return processQuery(q);
	}
	public Cart favoritesFirst(Long favorites){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, favorites));
		return processQueryUnique(q);
	}
	public java.util.List<Cart> favorites(jcrystal.server.db.query.Op operator, Long favorites){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", operator.datastoreOp, favorites));
		return processQuery(q);
	}
	public java.util.List<Cart> favorites(Long favorites, Long upperFavorites){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.CompositeFilter(com.google.appengine.api.datastore.Query.CompositeFilterOperator.AND, java.util.Arrays.asList((com.google.appengine.api.datastore.Query.Filter)new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, favorites),new com.google.appengine.api.datastore.Query.FilterPredicate("favorites", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, upperFavorites))));
		return processQuery(q);
	}
	public java.util.List<Cart> getAll(){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME);
		return processQuery(q);
	}
	public java.util.List<Cart> getAllKeys(){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setKeysOnly();
		return processQuery(q);
	}
}
