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
@javax.servlet.annotation.WebServlet(name = "SubServletProduct",urlPatterns = {"/api/product/filterProductsByCategory", "/api/product/getCategories", "/api/product/getProductById", "/api/product/getProducts"})
public class SubServletProduct extends AbsSubServlet{
	private static final long serialVersionUID = 1L;
	private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(SubServletProduct.class.getName());
	public void doGet(String path, HttpServletRequest req, HttpServletResponse resp) throws Exception{
		switch(path){
			case "/api/product/filterProductsByCategory":{
				dev_jcrysta_crystalfash_controllers_ManagerProduct_filterProductsByCategory(req, resp);
				break;
			}
			case "/api/product/getCategories":{
				dev_jcrysta_crystalfash_controllers_ManagerProduct_getCategories(req, resp);
				break;
			}
			case "/api/product/getProductById":{
				dev_jcrysta_crystalfash_controllers_ManagerProduct_getProductById(req, resp);
				break;
			}
			case "/api/product/getProducts":{
				dev_jcrysta_crystalfash_controllers_ManagerProduct_getProducts(req, resp);
				break;
			}
			default: send404(resp);break;
		}
	}
	static void dev_jcrysta_crystalfash_controllers_ManagerProduct_filterProductsByCategory(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		Long $long_category = optLong(req, "category");
		dev.jcrystal.crystalfash.entities.Categories category = $long_category==null?null:dev.jcrystal.crystalfash.entities.Categories.fromId($long_category);
		java.util.List<dev.jcrystal.crystalfash.entities.Product> $salida = dev.jcrysta.crystalfash.controllers.ManagerProduct.filterProductsByCategory(category);
		java.io.PrintWriter _pw = resp.getWriter();
		_pw.print("{\"success\":1, \"r\":");
		dev.jcrystal.crystalfash.entities.SerializerProduct.toJsonNormalProduct(_pw, 0,  $salida);
		_pw.print("}");
	}
	static void dev_jcrysta_crystalfash_controllers_ManagerProduct_getCategories(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		java.util.ArrayList<java.lang.String> $salida = dev.jcrysta.crystalfash.controllers.ManagerProduct.getCategories();
		java.io.PrintWriter _pw = resp.getWriter();
		_pw.print("{\"success\":1, \"r\":");
		jcrystal.JSONUtils.jsonQuoteString(_pw, $salida);
		_pw.print("}");
	}
	static void dev_jcrysta_crystalfash_controllers_ManagerProduct_getProductById(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		long id = Long.parseLong(req.getParameter("id"));
		dev.jcrystal.crystalfash.entities.Product $salida = dev.jcrysta.crystalfash.controllers.ManagerProduct.getProductById(id);
		if($salida != null){
			java.io.PrintWriter _pw = resp.getWriter();
			_pw.print("{\"success\":1, \"r\":");
			dev.jcrystal.crystalfash.entities.SerializerProduct.toJsonNormal(_pw, $salida, 0);
			_pw.print("}");
		}
		else{
			resp.getWriter().print("{\"success\":1, \"r\":null}");
		}
	}
	static void dev_jcrysta_crystalfash_controllers_ManagerProduct_getProducts(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		java.util.List<dev.jcrystal.crystalfash.entities.Product> $salida = dev.jcrysta.crystalfash.controllers.ManagerProduct.getProducts();
		java.io.PrintWriter _pw = resp.getWriter();
		_pw.print("{\"success\":1, \"r\":");
		dev.jcrystal.crystalfash.entities.SerializerProduct.toJsonNormalProduct(_pw, 0,  $salida);
		_pw.print("}");
	}
}
