package com.jcrystal.servlets.servlets;
import org.json.JSONObject;
import org.json.JSONTokener;
import jcrystal.utils.InternalException;
import jcrystal.utils.ValidationException;
import jcrystal.datetime.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jcrystal.utils.ServletUtils.*;
@SuppressWarnings("unused")
@javax.servlet.annotation.WebServlet(name = "SubServletCart",urlPatterns = {"/api/cart/addToCart", "/api/cart/addToFavorites", "/api/cart/createCart", "/api/cart/getCart", "/api/cart/listFavorites"})
public class SubServletCart extends AbsSubServlet{
	private static final long serialVersionUID = 1L;
	private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(SubServletCart.class.getName());
	public void doGet(String path, HttpServletRequest req, HttpServletResponse resp) throws Exception{
		switch(path){
			case "/api/cart/addToCart":{
				dev_jcrysta_crystalfash_controllers_ManagerCart_addToCart(req, resp);
				break;
			}
			case "/api/cart/addToFavorites":{
				dev_jcrysta_crystalfash_controllers_ManagerCart_addToFavorites(req, resp);
				break;
			}
			case "/api/cart/createCart":{
				dev_jcrysta_crystalfash_controllers_ManagerCart_createCart(req, resp);
				break;
			}
			case "/api/cart/getCart":{
				dev_jcrysta_crystalfash_controllers_ManagerCart_getCart(req, resp);
				break;
			}
			case "/api/cart/listFavorites":{
				dev_jcrysta_crystalfash_controllers_ManagerCart_listFavorites(req, resp);
				break;
			}
			default: send404(resp);break;
		}
	}
	static void dev_jcrysta_crystalfash_controllers_ManagerCart_addToCart(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		Long idCart = optLong(req, "idCart");
		dev.jcrystal.crystalfash.entities.Cart cart = dev.jcrystal.crystalfash.entities.Cart.get(idCart);
		Long idProduct = optLong(req, "idProduct");
		dev.jcrystal.crystalfash.entities.Product product = dev.jcrystal.crystalfash.entities.Product.get(idProduct);
		int quantity = Integer.parseInt(req.getParameter("quantity"));
		dev.jcrystal.crystalfash.entities.Cart $salida = dev.jcrysta.crystalfash.controllers.ManagerCart.addToCart(cart,product,quantity);
		if($salida != null){
			java.io.PrintWriter _pw = resp.getWriter();
			_pw.print("{\"success\":1, \"r\":");
			dev.jcrystal.crystalfash.entities.SerializerCart.toJsonNormal(_pw, $salida, 0);
			_pw.print("}");
		}
		else{
			resp.getWriter().print("{\"success\":1, \"r\":null}");
		}
	}
	static void dev_jcrysta_crystalfash_controllers_ManagerCart_addToFavorites(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		long cartId = Long.parseLong(req.getParameter("cartId"));
		Long idP = optLong(req, "idP");
		dev.jcrystal.crystalfash.entities.Product p = dev.jcrystal.crystalfash.entities.Product.get(idP);
		dev.jcrysta.crystalfash.controllers.ManagerCart.addToFavorites(cartId,p);
		resp.getWriter().print("{\"success\":1}");
	}
	static void dev_jcrysta_crystalfash_controllers_ManagerCart_createCart(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		dev.jcrystal.crystalfash.entities.Cart $salida = dev.jcrysta.crystalfash.controllers.ManagerCart.createCart();
		if($salida != null){
			java.io.PrintWriter _pw = resp.getWriter();
			_pw.print("{\"success\":1, \"r\":");
			dev.jcrystal.crystalfash.entities.SerializerCart.toJsonNormal(_pw, $salida, 0);
			_pw.print("}");
		}
		else{
			resp.getWriter().print("{\"success\":1, \"r\":null}");
		}
	}
	static void dev_jcrysta_crystalfash_controllers_ManagerCart_getCart(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		long id = Long.parseLong(req.getParameter("id"));
		dev.jcrystal.crystalfash.entities.Cart $salida = dev.jcrysta.crystalfash.controllers.ManagerCart.getCart(id);
		if($salida != null){
			java.io.PrintWriter _pw = resp.getWriter();
			_pw.print("{\"success\":1, \"r\":");
			dev.jcrystal.crystalfash.entities.SerializerCart.toJsonNormal(_pw, $salida, 0);
			_pw.print("}");
		}
		else{
			resp.getWriter().print("{\"success\":1, \"r\":null}");
		}
	}
	static void dev_jcrysta_crystalfash_controllers_ManagerCart_listFavorites(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		long cartId = Long.parseLong(req.getParameter("cartId"));
		java.util.List<dev.jcrystal.crystalfash.entities.Product> $salida = dev.jcrysta.crystalfash.controllers.ManagerCart.listFavorites(cartId);
		java.io.PrintWriter _pw = resp.getWriter();
		_pw.print("{\"success\":1, \"r\":");
		dev.jcrystal.crystalfash.entities.SerializerProduct.toJsonNormalProduct(_pw, 0,  $salida);
		_pw.print("}");
	}
}
