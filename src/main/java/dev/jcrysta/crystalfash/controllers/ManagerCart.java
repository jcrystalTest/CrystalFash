package dev.jcrysta.crystalfash.controllers;

import java.util.List;

import dev.jcrystal.crystalfash.entities.Cart;
import dev.jcrystal.crystalfash.entities.CartItem;
import dev.jcrystal.crystalfash.entities.Product;

public class ManagerCart {
	private static final double IVA = 0.19;

	public static Cart addToCart(Cart cart, Product product, int quantity) {
		CartItem i = new CartItem().product(product).quantity(quantity);
		cart.items().add(i);
		cart = updateCartTotal(cart);
		return cart;
	}

	public static Cart getCart(long id) {
		Cart c = Cart.get(id);
		return c;
	}

	public static void addToFavorites(long cartId, Product p) {
		Cart c = Cart.get(cartId);
		c.favorites().add(p);
	}
	public static List<Product> listFavorites(long cartId){
		return Cart.get(cartId).favorites();
	}
	public static Cart createCart() {
		return new Cart()
				.subtotal(0)
				.total(0);
	}
	
	private static Cart updateCartTotal(Cart cart) {
		double subtotal = 0;
		double total = 0;
		for(CartItem i:cart.items()) {
			subtotal += i.quantity()*i.product().price();
		}
		total = subtotal*(1+IVA);
		return cart.subtotal(subtotal).total(total);
	}

}
