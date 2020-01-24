package dev.jcrysta.crystalfash.controllers;

import dev.jcrystal.crystalfash.entities.Contact;

public class ManagerContact {
	public static void contact(String name, String email, String message) {
		new Contact().name(name).email(email).message(message);
	}

}
