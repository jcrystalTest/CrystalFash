package jcrystal.server.db.query;
public enum Op{
	lessThan(com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN),
	lessThanEq(com.google.appengine.api.datastore.Query.FilterOperator.LESS_THAN_OR_EQUAL),
	greaterThan(com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN),
	greaterThanEq(com.google.appengine.api.datastore.Query.FilterOperator.GREATER_THAN_OR_EQUAL),
	is(com.google.appengine.api.datastore.Query.FilterOperator.EQUAL),
	;
	public final com.google.appengine.api.datastore.Query.FilterOperator datastoreOp;
	private Op(com.google.appengine.api.datastore.Query.FilterOperator datastoreOp){
		this.datastoreOp = datastoreOp;
	}
}
