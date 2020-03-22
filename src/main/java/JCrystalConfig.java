import static jcrystal.JCrystalConfig.*;

import jcrystal.configs.clients.ClientType;

public class JCrystalConfig {
	
	private static String TEST_SERVER_URL = "http://localhost:8080/";
	
	private static String PROD_SERVER_URL = "https://yourserver.com/";
	static String ios_folder = "/Users/andreabuitrago/Documents/jCrystal/DemojCrystal/iOS/Demo";

	public static void config(){
		//JCRYSTAL_SERVER_URL = "http://test-dot-back-dot-jcrystal-213302.appspot.com";

		SERVER.FIREBASE.firebaseKey = "crystalflash-firebase-adminsdk-9cz8o-91800ac321.json";//It must be placed on WEB-INF
		SERVER.FIREBASE.firebaseDB = "https://crystalflash.firebaseio.com/";
		SERVER.DEBUG.CORS = true;
		addAngularExample();
		addAndroidExample();
		addSwiftiOSExample();
		//addMobileExample();
		//addFlutterExample();
	}
	private static void addAngularExample(){
		CLIENT.add(ClientType.TYPESCRIPT, "web")
			.setOutput("/Users/andreabuitrago/Documents/jCrystal/jCrystalECommerce/src/app")
			.setServerUrl(TEST_SERVER_URL);
			//.setServerUrl(PROD_SERVER_URL);
	}
	private static void addAndroidExample(){
		CLIENT.addAndroid("android")
			//.enableFirebasCrashReporting()
			.setOutput("./androidgeneratedcode")
			.setServerUrl(TEST_SERVER_URL);
			//.setServerUrl(PROD_SERVER_URL);
	}
	private static void addSwiftiOSExample(){
		CLIENT.addiOS("ios")
			//.enableFirebasCrashReporting()
			.setOutput(ios_folder)
			.setServerUrl(TEST_SERVER_URL);
			//.setServerUrl(PROD_SERVER_URL);
	}
	private static void addMobileExample(){//Combines android and iOS on one single client
		CLIENT.addMobile("mobile")
			.setOutputAndroid("./androidgeneratedcode")
			.setOutputiOS("./iosgeneratedcode")
			.setServerUrl(TEST_SERVER_URL);
			//.setServerUrl(PROD_SERVER_URL);
	}
	private static void addFlutterExample(){
		CLIENT.add(ClientType.FLUTTER, "flutter")
			.setOutput("./fluttergeneratedcode")
			.setServerUrl(TEST_SERVER_URL);
			//.setServerUrl(PROD_SERVER_URL);
	}
}
