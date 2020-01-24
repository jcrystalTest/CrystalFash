package jcrystal.mobile.entities;
import jcrystal.mobile.*;
import jcrystal.datetime.*;
public interface ProductNormal extends jcrystal.mobile.net.ISerializable{
	Long id();
	String name();
	long category();
	double price();
	double discount();
	double oldPrice();
	long color();
	long size();
}
