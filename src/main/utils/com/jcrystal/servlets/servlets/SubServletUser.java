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
@javax.servlet.annotation.WebServlet(name = "SubServletUser",urlPatterns = {"/api/user/login"})
public class SubServletUser extends AbsSubServlet{
	private static final long serialVersionUID = 1L;
	private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(SubServletUser.class.getName());
	public void doPost(String path, HttpServletRequest req, HttpServletResponse resp) throws Exception{
		switch(path){
			case "/api/user/login":{
				dev_jcrysta_crystalfash_controllers_ManagerUser_login(req, resp);
				break;
			}
			default: send404(resp);break;
		}
	}
	static void dev_jcrysta_crystalfash_controllers_ManagerUser_login(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		JSONObject $body = new JSONObject(new JSONTokener(req.getCharacterEncoding()==null?new java.io.InputStreamReader(req.getInputStream()):new java.io.InputStreamReader(req.getInputStream(), req.getCharacterEncoding())));
		jcrystal.security.SignInInfo signin = new jcrystal.security.SignInInfo();
		dev.jcrystal.crystalfash.entities.User user = null;
		if($body.has("firebaseId")){
			String firebaseId = $body.getString("firebaseId");
			com.google.firebase.auth.FirebaseToken $data = com.google.firebase.auth.FirebaseAuth.getInstance().verifyIdToken(firebaseId);
			user = dev.jcrystal.crystalfash.entities.User.Query.firebaseId($data.getUid());
			if(user == null){
				signin.isSignUp = true;
				signin.isEmailVerified = $data.isEmailVerified();
				user = new dev.jcrysta.crystalfash.controllers.UserBuilder().create($data);
			}
			if(user == null){
				throw new jcrystal.http.responses.HttpPreconditionFailed412();
			}
		}
		dev.jcrystal.crystalfash.security.Token $salida = dev.jcrysta.crystalfash.controllers.ManagerUser.login(user, signin);
		if($salida != null){
			java.io.PrintWriter _pw = resp.getWriter();
			_pw.print("{\"success\":1, \"r\":");
			dev.jcrystal.crystalfash.security.SerializerToken.toJsonNormal(_pw, $salida, 0);
			_pw.print("}");
			resp.addCookie(setPath(setAge(new Cookie("token", $salida.token()), 3600*24),"/"));
		}
		else{
			resp.getWriter().print("{\"success\":1, \"r\":null}");
		}
	}
}
