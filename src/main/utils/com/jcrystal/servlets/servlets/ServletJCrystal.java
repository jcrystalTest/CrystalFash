package com.jcrystal.servlets.servlets;
import jcrystal.utils.InternalException;
import jcrystal.utils.ValidationException;
import javax.servlet.http.*;
import java.io.IOException;
import static jcrystal.utils.ServletUtils.*;
@javax.servlet.annotation.WebServlet(name = "ServletjCrystalAsync",urlPatterns = {"/jcrystal/async"})
public class ServletJCrystal extends HttpServlet{
	private static final long serialVersionUID = 2712227315844587832L;
	private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(ServletJCrystal.class.getName());
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		if((!"0.1.0.2".equals(req.getRemoteAddr()) && com.google.appengine.api.utils.SystemProperty.environment.value() == com.google.appengine.api.utils.SystemProperty.Environment.Value.Production)){
			resp.setStatus(401);
			return;
		}
		final String path = req.getServletPath();
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		try{
			switch(path){
				case "/jcrystal/async" : {
					jcrystal.queue.Async.dequeue(req);
					resp.setStatus(200);
					resp.getWriter().print("{\"success\":1}");
					break;
				}
				default: send404(resp);break;
			}
		}
		catch(NumberFormatException ex){resp.getWriter().print("{\"success\":2, \"mensaje\":\"Invalid request\"}");}
		catch(org.json.JSONException ex){resp.getWriter().print("{\"success\":2,\"code\": 500, \"mensaje\":\"Invalid JSON object\"}");}
		catch(ValidationException ex){resp.getWriter().print("{\"success\":2, \"mensaje\":\"" + ex.getMessage() + "\"}");}
		catch(InternalException ex){resp.getWriter().print("{\"success\":2,\"code\":" + ex.code + ", \"mensaje\":\"" + ex.getMessage() + "\"}");}
		catch(Throwable ex){
			resp.setStatus(500);
			log.log(java.util.logging.Level.SEVERE,"error", ex);
		}
	}
}
