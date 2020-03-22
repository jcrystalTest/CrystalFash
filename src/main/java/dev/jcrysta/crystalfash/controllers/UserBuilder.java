package dev.jcrysta.crystalfash.controllers;

import com.google.appengine.api.datastore.Email;
import com.google.firebase.auth.FirebaseToken;

import dev.jcrystal.crystalfash.entities.User;
import dev.jcrystal.crystalfash.entities.UserAuthBuilder;

public class UserBuilder implements UserAuthBuilder {
	@Override
	public User create(FirebaseToken decodedToken) {
		User ret = new User()
			.firebaseId(decodedToken.getUid())
			.name(decodedToken.getName());
		return ret.put();
	}

}





