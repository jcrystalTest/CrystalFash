package dev.jcrystal.crystalfash.entities;
import dev.jcrystal.crystalfash.entities.User;
import static dev.jcrystal.crystalfash.entities.User.ENTITY_NAME;
public class QueryUser extends jcrystal.db.datastore.query.AbsBaseHelper<QueryUser, User>{
	protected QueryUser(){
		super(jcrystal.context.CrystalContext.get().DefaultDB());
		this.ancestor = null;
	}
	protected QueryUser(com.google.appengine.api.datastore.Key ancestor){
		super(jcrystal.context.CrystalContext.get().DefaultDB(), ancestor);
	}
	@Override public QueryUser create(){return new QueryUser(ancestor);}
	@Override public User create(com.google.appengine.api.datastore.Entity entidad){
		return new User(entidad);
	}
	public User firebaseId(String firebaseId){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("firebaseId", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, firebaseId));
		return processQueryUnique(q);
	}
	public java.util.List<User> firebaseId(jcrystal.server.db.query.Op operator, String firebaseId){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("firebaseId", operator.datastoreOp, firebaseId));
		return processQuery(q);
	}
	public java.util.List<User> firebaseId(String firebaseId, String upperFirebaseId){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.CompositeFilter(com.google.appengine.api.datastore.Query.CompositeFilterOperator.AND, java.util.Arrays.asList((com.google.appengine.api.datastore.Query.Filter)new com.google.appengine.api.datastore.Query.FilterPredicate("firebaseId", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, firebaseId),new com.google.appengine.api.datastore.Query.FilterPredicate("firebaseId", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, upperFirebaseId))));
		return processQuery(q);
	}
	public User email(com.google.appengine.api.datastore.Email email){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("email", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, email));
		return processQueryUnique(q);
	}
	public java.util.List<User> email(jcrystal.server.db.query.Op operator, com.google.appengine.api.datastore.Email email){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("email", operator.datastoreOp, email));
		return processQuery(q);
	}
	public java.util.List<User> email(com.google.appengine.api.datastore.Email email, com.google.appengine.api.datastore.Email upperEmail){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.CompositeFilter(com.google.appengine.api.datastore.Query.CompositeFilterOperator.AND, java.util.Arrays.asList((com.google.appengine.api.datastore.Query.Filter)new com.google.appengine.api.datastore.Query.FilterPredicate("email", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, email),new com.google.appengine.api.datastore.Query.FilterPredicate("email", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, upperEmail))));
		return processQuery(q);
	}
	public java.util.List<User> creation(java.util.Date creation){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("creation", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, creation));
		return processQuery(q);
	}
	public User creationFirst(java.util.Date creation){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("creation", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, creation));
		return processQueryUnique(q);
	}
	public java.util.List<User> creation(jcrystal.server.db.query.Op operator, java.util.Date creation){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("creation", operator.datastoreOp, creation));
		return processQuery(q);
	}
	public java.util.List<User> creation(java.util.Date creation, java.util.Date upperCreation){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.CompositeFilter(com.google.appengine.api.datastore.Query.CompositeFilterOperator.AND, java.util.Arrays.asList((com.google.appengine.api.datastore.Query.Filter)new com.google.appengine.api.datastore.Query.FilterPredicate("creation", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, creation),new com.google.appengine.api.datastore.Query.FilterPredicate("creation", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, upperCreation))));
		return processQuery(q);
	}
	public java.util.List<User> getAll(){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME);
		return processQuery(q);
	}
	public java.util.List<User> getAllKeys(){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setKeysOnly();
		return processQuery(q);
	}
}
