package dev.jcrystal.crystalfash.entities;
import dev.jcrystal.crystalfash.entities.User;
import static dev.jcrystal.crystalfash.entities.User.ENTITY_NAME;
public interface UserAuthBuilder{
	public User create(final com.google.firebase.auth.FirebaseToken decodedToken);
}
