package dev.jcrystal.admin.controllers;

import dev.jcrystal.crystalfash.entities.Categories;
import dev.jcrystal.crystalfash.entities.Color;
import dev.jcrystal.crystalfash.entities.Product;

public class ManagerAdminProduct {
	public static void createProducts() {
		String desc = "Soft, knit sweater with a slightly wider neckline. Long sleeves and ribbing at neckline, cuffs, and hem.";
		new Product().category(Categories.WOMEN).color(Color.BLUE).name("Sweater 1").price(28).oldPrice(35).discount(20).image("https://imgur.com/sjCZd8s.jpg").description(desc).put();
		new Product().category(Categories.WOMEN).color(Color.YELLOW).name("Sweater 2").price(28).oldPrice(35).discount(20).image("https://imgur.com/sjCZd8s.jpg").description(desc).put();
		new Product().category(Categories.MEN).color(Color.YELLOW).name("Sweater 3").price(28).oldPrice(35).discount(20).image("https://imgur.com/OqgIsqf.jpg").description(desc).put();
		new Product().category(Categories.MEN).color(Color.YELLOW).name("Sweater 4").price(28).oldPrice(35).discount(20).image("https://imgur.com/OqgIsqf.jpg").description(desc).put();
		new Product().category(Categories.MEN).color(Color.RED).name("Sweater 5").price(28).oldPrice(35).discount(20).image("https://imgur.com/OqgIsqf.jpg").description(desc).put();
		new Product().category(Categories.MEN).color(Color.BLUE).name("Sweater 6").price(28).oldPrice(35).discount(20).image("https://imgur.com/OqgIsqf.jpg").description(desc).put();
		new Product().category(Categories.WOMEN).color(Color.RED).name("Sweater 7").price(28).oldPrice(35).discount(20).image("https://imgur.com/sjCZd8s.jpg").description(desc).put();
		new Product().category(Categories.WOMEN).color(Color.BLUE).name("Sweater 8").price(28).oldPrice(35).discount(20).image("https://imgur.com/sjCZd8s.jpg").description(desc).put();
		new Product().category(Categories.KIDS).color(Color.YELLOW).name("Sweater 9").price(28).oldPrice(35).discount(20).image("https://imgur.com/MNwqYpW.jpg").description(desc).put();
		new Product().category(Categories.KIDS).color(Color.BLUE).name("Sweater 10").price(28).oldPrice(35).discount(20).image("https://imgur.com/MNwqYpW.jpg").description(desc).put();
	}

}
