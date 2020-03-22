package dev.jcrystal.crystalfash.entities;
import dev.jcrystal.crystalfash.entities.Contact;
import static dev.jcrystal.crystalfash.entities.Contact.ENTITY_NAME;
public class QueryContact extends jcrystal.db.datastore.query.AbsBaseHelper<QueryContact, Contact>{
	protected QueryContact(){
		super(jcrystal.context.CrystalContext.get().DefaultDB());
		this.ancestor = null;
	}
	protected QueryContact(com.google.appengine.api.datastore.Key ancestor){
		super(jcrystal.context.CrystalContext.get().DefaultDB(), ancestor);
	}
	@Override public QueryContact create(){return new QueryContact(ancestor);}
	@Override public Contact create(com.google.appengine.api.datastore.Entity entidad){
		return new Contact(entidad);
	}
	public java.util.List<Contact> getAll(){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME);
		return processQuery(q);
	}
	public java.util.List<Contact> getAllKeys(){
		com.google.appengine.api.datastore.Query q = createQuery(ENTITY_NAME).setKeysOnly();
		return processQuery(q);
	}
}
