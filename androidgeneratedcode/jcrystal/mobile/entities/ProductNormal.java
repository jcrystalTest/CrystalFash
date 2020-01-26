package jcrystal.mobile.entities;
import jcrystal.mobile.*;
import jcrystal.datetime.*;
public interface ProductNormal extends jcrystal.mobile.net.ISerializable{
	Long id();
	String name();
	String description();
	long category();
	double price();
	double discount();
	double oldPrice();
	long color();
	long size();
	String image();
}
