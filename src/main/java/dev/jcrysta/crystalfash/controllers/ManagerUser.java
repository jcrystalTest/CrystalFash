package dev.jcrysta.crystalfash.controllers;

import java.util.List;

import dev.jcrystal.crystalfash.entities.User;
import dev.jcrystal.crystalfash.security.Token;
import jcrystal.results.Tupla2;
import jcrystal.security.SignInInfo;
import jcrystal.utils.InternalException;
public class ManagerUser {

	public static Token login(User user, SignInInfo signin){
		Token token = Token.generateTokenBase64(user.id()+"_"+System.currentTimeMillis()+"uhjlk")
				.user(user)
				.rol(0)
				.put();
		return token;
	}
	
}
