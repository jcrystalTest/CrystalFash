package dev.jcrystal.crystalfash.entities;
import dev.jcrystal.crystalfash.entities.CartItem;
import static dev.jcrystal.crystalfash.entities.CartItem.ENTITY_NAME;
public class QueryCartItem extends jcrystal.db.datastore.query.AbsBaseHelper<QueryCartItem, CartItem>{
	protected QueryCartItem(){
		super(jcrystal.context.CrystalContext.get().DefaultDB());
		this.ancestor = null;
	}
	protected QueryCartItem(com.google.appengine.api.datastore.Key ancestor){
		super(jcrystal.context.CrystalContext.get().DefaultDB(), ancestor);
	}
	@Override public QueryCartItem create(){return new QueryCartItem(ancestor);}
	@Override public CartItem create(com.google.appengine.api.datastore.Entity entidad){
		return new CartItem(entidad);
	}
	public CartItem product(Long product){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("product", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, product));
		return processQueryUnique(q);
	}
	public java.util.List<CartItem> product(jcrystal.server.db.query.Op operator, Long product){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("product", operator.datastoreOp, product));
		return processQuery(q);
	}
	public java.util.List<CartItem> product(Long product, Long upperProduct){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.CompositeFilter(com.google.appengine.api.datastore.Query.CompositeFilterOperator.AND, java.util.Arrays.asList((com.google.appengine.api.datastore.Query.Filter)new com.google.appengine.api.datastore.Query.FilterPredicate("product", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, product),new com.google.appengine.api.datastore.Query.FilterPredicate("product", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, upperProduct))));
		return processQuery(q);
	}
	public java.util.List<CartItem> getAll(){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME);
		return processQuery(q);
	}
	public java.util.List<CartItem> getAllKeys(){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setKeysOnly();
		return processQuery(q);
	}
}
