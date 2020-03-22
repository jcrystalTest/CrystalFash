package com.jcrystal.servlets.servlets;
import javax.servlet.ServletException;
import javax.servlet.http.*;
@javax.servlet.annotation.WebServlet(name = "_ah_warmup", urlPatterns = {"/_ah/warmup"}, loadOnStartup = 1)
public class OnLoadServlet extends HttpServlet{
	private static boolean init = true;
	public static final String FIREBASE_BASE_URL = "https://crystalflash.firebaseio.com";
	private static com.google.api.client.auth.oauth2.Credential FIREBASE_CREDENTIALS;
	public static com.google.api.client.auth.oauth2.Credential FIREBASE_CREDENTIALS(){
		if(FIREBASE_CREDENTIALS == null){
			try(java.io.FileInputStream serviceAccount = new java.io.FileInputStream("WEB-INF/crystalflash-firebase-adminsdk-9cz8o-91800ac321.json")){
				FIREBASE_CREDENTIALS = com.google.api.client.googleapis.auth.oauth2.GoogleCredential.fromStream(serviceAccount).createScoped(java.util.Arrays.asList("https://www.googleapis.com/auth/userinfo.email","https://www.googleapis.com/auth/firebase.database"));
			}
			catch(Exception ex){ex.printStackTrace();}
		}
		return FIREBASE_CREDENTIALS;
	}
	private void initFirebase() throws java.io.FileNotFoundException, java.io.IOException{
		try(java.io.FileInputStream serviceAccount = new java.io.FileInputStream("WEB-INF/crystalflash-firebase-adminsdk-9cz8o-91800ac321.json")){
			com.google.firebase.FirebaseOptions options = new com.google.firebase.FirebaseOptions.Builder().setCredentials(com.google.auth.oauth2.GoogleCredentials.fromStream(serviceAccount)).setDatabaseUrl("https://crystalflash.firebaseio.com/").build();
			com.google.firebase.FirebaseApp.initializeApp(options);
		}
	}
	@Override public void doGet(HttpServletRequest req, HttpServletResponse resp){
		try{
			this.init();
		}
		catch(Exception ex){ex.printStackTrace();}
	}
	@Override public void init() throws ServletException{
		if(init){
			super.init();
			System.out.println("init");
			init = false;
			try{
				initFirebase();
			}
			catch(Exception ex){ex.printStackTrace();}
		}
	}
}
