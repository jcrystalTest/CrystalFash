package dev.jcrystal.admin.controllers;

import dev.jcrystal.crystalfash.entities.Categories;
import dev.jcrystal.crystalfash.entities.Color;
import dev.jcrystal.crystalfash.entities.Product;

public class ManagerAdminProduct {
	public static void createProducts() {
		new Product().category(Categories.WOMEN).color(Color.BLUE).name("Sweater 1").price(28).oldPrice(35).discount(20).put();
		new Product().category(Categories.WOMEN).color(Color.YELLOW).name("Sweater 2").price(28).oldPrice(35).discount(20).put();
		new Product().category(Categories.MEN).color(Color.RED).name("Sweater 3").price(28).oldPrice(35).discount(20).put();
		new Product().category(Categories.MEN).color(Color.RED).name("Sweater 4").price(28).oldPrice(35).discount(20).put();
		new Product().category(Categories.MEN).color(Color.RED).name("Sweater 5").price(28).oldPrice(35).discount(20).put();
		new Product().category(Categories.MEN).color(Color.BLUE).name("Sweater 6").price(28).oldPrice(35).discount(20).put();
		new Product().category(Categories.WOMEN).color(Color.RED).name("Sweater 7").price(28).oldPrice(35).discount(20).put();
		new Product().category(Categories.WOMEN).color(Color.BLUE).name("Sweater 8").price(28).oldPrice(35).discount(20).put();
		new Product().category(Categories.KIDS).color(Color.YELLOW).name("Sweater 9").price(28).oldPrice(35).discount(20).put();
		new Product().category(Categories.KIDS).color(Color.BLUE).name("Sweater 10").price(28).oldPrice(35).discount(20).put();
	}

}
