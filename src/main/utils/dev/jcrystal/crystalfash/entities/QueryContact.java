package dev.jcrystal.crystalfash.entities;
import dev.jcrystal.crystalfash.entities.Contact;
import static dev.jcrystal.crystalfash.entities.Contact.ENTITY_NAME;
public class QueryContact{
	protected QueryContact(){}
	public static java.util.ArrayList<Contact> getAll(){
		return getAll((java.util.function.Predicate<Contact>)null);
	}
	public static java.util.ArrayList<Contact> getAll(java.util.function.Predicate<Contact> filtro){
		com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query("Contact");
		java.util.ArrayList<Contact> ret = new java.util.ArrayList<>();
		for(com.google.appengine.api.datastore.Entity ent : jcrystal.context.CrystalContext.get().DefaultDB().service.prepare(null, q).asIterable()){
			Contact toAdd = new Contact(ent);
			if(filtro == null || filtro.test(toAdd)){
				ret.add(toAdd);
			}
		}
		return ret;
	}
	public static java.util.ArrayList<Contact> getAllKeys(){
		com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query("Contact").setKeysOnly();
		java.util.ArrayList<Contact> ret = new java.util.ArrayList<>();
		for(com.google.appengine.api.datastore.Entity ent : jcrystal.context.CrystalContext.get().DefaultDB().service.prepare(null, q).asIterable()){
			Contact toAdd = new Contact(ent);
			ret.add(toAdd);
		}
		return ret;
	}
}
