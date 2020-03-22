package dev.jcrystal.crystalfash.entities;
import dev.jcrystal.crystalfash.entities.Product;
import static dev.jcrystal.crystalfash.entities.Product.ENTITY_NAME;
public class QueryProduct extends jcrystal.db.datastore.query.AbsBaseHelper<QueryProduct, Product>{
	protected QueryProduct(){
		super(jcrystal.context.CrystalContext.get().DefaultDB());
		this.ancestor = null;
	}
	protected QueryProduct(com.google.appengine.api.datastore.Key ancestor){
		super(jcrystal.context.CrystalContext.get().DefaultDB(), ancestor);
	}
	@Override public QueryProduct create(){return new QueryProduct(ancestor);}
	@Override public Product create(com.google.appengine.api.datastore.Entity entidad){
		return new Product(entidad);
	}
	public java.util.List<Product> category(dev.jcrystal.crystalfash.entities.Categories category){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("category", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, category.id));
		return processQuery(q);
	}
	public Product categoryFirst(dev.jcrystal.crystalfash.entities.Categories category){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("category", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, category.id));
		return processQueryUnique(q);
	}
	public java.util.List<Product> getAll(){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME);
		return processQuery(q);
	}
	public java.util.List<Product> getAllKeys(){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setKeysOnly();
		return processQuery(q);
	}
}
