package jcrystal.context;
public class UtilsDefaultDB{
	public static void clearDB(){
		if(com.google.appengine.api.utils.SystemProperty.environment.value() == com.google.appengine.api.utils.SystemProperty.Environment.Value.Development){
			dev.jcrystal.crystalfash.entities.Cart.Batch.delete(dev.jcrystal.crystalfash.entities.Cart.Query.getAllKeys());
			dev.jcrystal.crystalfash.entities.CartItem.Batch.delete(dev.jcrystal.crystalfash.entities.CartItem.Query.getAllKeys());
			dev.jcrystal.crystalfash.entities.Contact.Batch.delete(dev.jcrystal.crystalfash.entities.Contact.Query.getAllKeys());
			dev.jcrystal.crystalfash.entities.Product.Batch.delete(dev.jcrystal.crystalfash.entities.Product.Query.getAllKeys());
			dev.jcrystal.crystalfash.entities.User.Batch.delete(dev.jcrystal.crystalfash.entities.User.Query.getAllKeys());
			dev.jcrystal.crystalfash.security.Token.Batch.delete(dev.jcrystal.crystalfash.security.Token.Query.getAllKeys());
		}
	}
	public static void migrateDBToNamespace(String originNamespace, String targetNamespace){
		if(java.util.Objects.equals(originNamespace, targetNamespace)){
			throw new jcrystal.errors.ErrorException("Can't migrate from " + originNamespace + " to " + targetNamespace);
		}
		jcrystal.context.CrystalContext $ctx = jcrystal.context.CrystalContext.get();
		com.google.appengine.api.NamespaceManager.set(originNamespace);
		java.util.List<dev.jcrystal.crystalfash.entities.Cart> cart = dev.jcrystal.crystalfash.entities.Cart.Query.getAll();
		com.google.appengine.api.NamespaceManager.set(targetNamespace);
		$ctx.DefaultDB().service.put(cart.stream().map(data ->{
			com.google.appengine.api.datastore.Entity entity = new com.google.appengine.api.datastore.Entity(dev.jcrystal.crystalfash.entities.Cart.Key.cloneKey(data.getKey()));
			entity.setPropertiesFrom(data.getRawEntity());
			return entity;
		}).collect(java.util.stream.Collectors.toList()));
		System.out.println("Stored " + cart.size() + " entities for dev.jcrystal.crystalfash.entities.Cart");
		com.google.appengine.api.NamespaceManager.set(originNamespace);
		java.util.List<dev.jcrystal.crystalfash.entities.CartItem> cartItem = dev.jcrystal.crystalfash.entities.CartItem.Query.getAll();
		com.google.appengine.api.NamespaceManager.set(targetNamespace);
		$ctx.DefaultDB().service.put(cartItem.stream().map(data ->{
			com.google.appengine.api.datastore.Entity entity = new com.google.appengine.api.datastore.Entity(dev.jcrystal.crystalfash.entities.CartItem.Key.cloneKey(data.getKey()));
			entity.setPropertiesFrom(data.getRawEntity());
			return entity;
		}).collect(java.util.stream.Collectors.toList()));
		System.out.println("Stored " + cartItem.size() + " entities for dev.jcrystal.crystalfash.entities.CartItem");
		com.google.appengine.api.NamespaceManager.set(originNamespace);
		java.util.List<dev.jcrystal.crystalfash.entities.Contact> contact = dev.jcrystal.crystalfash.entities.Contact.Query.getAll();
		com.google.appengine.api.NamespaceManager.set(targetNamespace);
		$ctx.DefaultDB().service.put(contact.stream().map(data ->{
			com.google.appengine.api.datastore.Entity entity = new com.google.appengine.api.datastore.Entity(dev.jcrystal.crystalfash.entities.Contact.Key.cloneKey(data.getKey()));
			entity.setPropertiesFrom(data.getRawEntity());
			return entity;
		}).collect(java.util.stream.Collectors.toList()));
		System.out.println("Stored " + contact.size() + " entities for dev.jcrystal.crystalfash.entities.Contact");
		com.google.appengine.api.NamespaceManager.set(originNamespace);
		java.util.List<dev.jcrystal.crystalfash.entities.Product> product = dev.jcrystal.crystalfash.entities.Product.Query.getAll();
		com.google.appengine.api.NamespaceManager.set(targetNamespace);
		$ctx.DefaultDB().service.put(product.stream().map(data ->{
			com.google.appengine.api.datastore.Entity entity = new com.google.appengine.api.datastore.Entity(dev.jcrystal.crystalfash.entities.Product.Key.cloneKey(data.getKey()));
			entity.setPropertiesFrom(data.getRawEntity());
			return entity;
		}).collect(java.util.stream.Collectors.toList()));
		System.out.println("Stored " + product.size() + " entities for dev.jcrystal.crystalfash.entities.Product");
		com.google.appengine.api.NamespaceManager.set(originNamespace);
		java.util.List<dev.jcrystal.crystalfash.entities.User> user = dev.jcrystal.crystalfash.entities.User.Query.getAll();
		com.google.appengine.api.NamespaceManager.set(targetNamespace);
		$ctx.DefaultDB().service.put(user.stream().map(data ->{
			com.google.appengine.api.datastore.Entity entity = new com.google.appengine.api.datastore.Entity(dev.jcrystal.crystalfash.entities.User.Key.cloneKey(data.getKey()));
			entity.setPropertiesFrom(data.getRawEntity());
			return entity;
		}).collect(java.util.stream.Collectors.toList()));
		System.out.println("Stored " + user.size() + " entities for dev.jcrystal.crystalfash.entities.User");
		com.google.appengine.api.NamespaceManager.set(originNamespace);
		java.util.List<dev.jcrystal.crystalfash.security.Token> token = dev.jcrystal.crystalfash.security.Token.Query.getAll();
		com.google.appengine.api.NamespaceManager.set(targetNamespace);
		$ctx.DefaultDB().service.put(token.stream().map(data ->{
			com.google.appengine.api.datastore.Entity entity = new com.google.appengine.api.datastore.Entity(dev.jcrystal.crystalfash.security.Token.Key.cloneKey(data.getKey()));
			entity.setPropertiesFrom(data.getRawEntity());
			return entity;
		}).collect(java.util.stream.Collectors.toList()));
		System.out.println("Stored " + token.size() + " entities for dev.jcrystal.crystalfash.security.Token");
	}
}
