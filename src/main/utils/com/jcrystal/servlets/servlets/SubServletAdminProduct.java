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
@javax.servlet.annotation.WebServlet(name = "SubServletAdminProduct",urlPatterns = {"/api/adminProduct/createProducts"})
public class SubServletAdminProduct extends AbsSubServlet{
	private static final long serialVersionUID = 1L;
	private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(SubServletAdminProduct.class.getName());
	public void doGet(String path, HttpServletRequest req, HttpServletResponse resp) throws Exception{
		switch(path){
			case "/api/adminProduct/createProducts":{
				dev_jcrystal_admin_controllers_ManagerAdminProduct_createProducts(req, resp);
				break;
			}
			default: send404(resp);break;
		}
	}
	static void dev_jcrystal_admin_controllers_ManagerAdminProduct_createProducts(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		dev.jcrystal.admin.controllers.ManagerAdminProduct.createProducts();
		resp.getWriter().print("{\"success\":1}");
	}
}
