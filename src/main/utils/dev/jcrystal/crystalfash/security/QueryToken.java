package dev.jcrystal.crystalfash.security;
import dev.jcrystal.crystalfash.security.Token;
import static dev.jcrystal.crystalfash.security.Token.ENTITY_NAME;
public class QueryToken extends jcrystal.db.datastore.query.AbsBaseHelper<QueryToken, Token>{
	protected QueryToken(){
		super(jcrystal.context.CrystalContext.get().DefaultDB());
		this.ancestor = null;
	}
	protected QueryToken(com.google.appengine.api.datastore.Key ancestor){
		super(jcrystal.context.CrystalContext.get().DefaultDB(), ancestor);
	}
	@Override public QueryToken create(){return new QueryToken(ancestor);}
	@Override public Token create(com.google.appengine.api.datastore.Entity entidad){
		return new Token(entidad);
	}
	public java.util.List<Token> user(Long user){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("user", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, user));
		return processQuery(q);
	}
	public Token userFirst(Long user){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("user", com.google.appengine.api.datastore.Query.FilterOperator.EQUAL, user));
		return processQueryUnique(q);
	}
	public java.util.List<Token> user(jcrystal.server.db.query.Op operator, Long user){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.FilterPredicate("user", operator.datastoreOp, user));
		return processQuery(q);
	}
	public java.util.List<Token> user(Long user, Long upperUser){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setFilter(new com.google.appengine.api.datastore.Query.CompositeFilter(com.google.appengine.api.datastore.Query.CompositeFilterOperator.AND, java.util.Arrays.asList((com.google.appengine.api.datastore.Query.Filter)new com.google.appengine.api.datastore.Query.FilterPredicate("user", com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL, user),new com.google.appengine.api.datastore.Query.FilterPredicate("user", com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN, upperUser))));
		return processQuery(q);
	}
	public java.util.List<Token> getAll(){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME);
		return processQuery(q);
	}
	public java.util.List<Token> getAllKeys(){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setKeysOnly();
		return processQuery(q);
	}
}
