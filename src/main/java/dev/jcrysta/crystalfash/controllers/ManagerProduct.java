package dev.jcrysta.crystalfash.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dev.jcrystal.crystalfash.entities.Categories;
import dev.jcrystal.crystalfash.entities.Product;
import dev.jcrystal.crystalfash.entities.Size;

public class ManagerProduct {
	public static Product getProductById(long id) {
		Product p = Product.get(id);
		return p;
	}
	public static ArrayList<Product> getProducts(){
		return Product.Query.getAll();
	}
	public static ArrayList<String> getCategories(){
		List<Categories> list = Arrays.asList(Categories.values());
		ArrayList<String> categories = new ArrayList<String>();
		list.forEach(c ->{
			categories.add(c.name);
		});
		return categories;
	}
	public static List<Product> filterProductsByCategory(Categories category){
		return Product.Query.ByCategory.get(category);
	}

}
