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
@javax.servlet.annotation.WebServlet(name = "SubServletContact",urlPatterns = {"/api/contact/contact"})
public class SubServletContact extends AbsSubServlet{
	private static final long serialVersionUID = 1L;
	private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(SubServletContact.class.getName());
	public void doGet(String path, HttpServletRequest req, HttpServletResponse resp) throws Exception{
		switch(path){
			case "/api/contact/contact":{
				dev_jcrysta_crystalfash_controllers_ManagerContact_contact(req, resp);
				break;
			}
			default: send404(resp);break;
		}
	}
	static void dev_jcrysta_crystalfash_controllers_ManagerContact_contact(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String message = req.getParameter("message");
		dev.jcrysta.crystalfash.controllers.ManagerContact.contact(name,email,message);
		resp.getWriter().print("{\"success\":1}");
	}
}
