package dev.jcrystal.crystalfash.entities;
import jcrystal.PrintWriterUtils;
public class SerializerUser{
	public static void toJsonId(java.io.PrintWriter _pw, User objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonIdUser(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<User>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonId(_pw, valor, rol));
	}
	public static void toJsonIdUser(java.io.PrintWriter _pw, long rol, java.lang.Iterable<User> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonId(_pw, valor, rol));
	}
	public static void toJsonIdUser(java.io.PrintWriter _pw, long rol, java.util.Map<Long, User> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonId(_pw, valor, rol));
	}
	public static void toJsonMin(java.io.PrintWriter _pw, User objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonMinUser(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<User>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonMin(_pw, valor, rol));
	}
	public static void toJsonMinUser(java.io.PrintWriter _pw, long rol, java.lang.Iterable<User> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonMin(_pw, valor, rol));
	}
	public static void toJsonMinUser(java.io.PrintWriter _pw, long rol, java.util.Map<Long, User> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonMin(_pw, valor, rol));
	}
	public static void toJsonBasic(java.io.PrintWriter _pw, User objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonBasicUser(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<User>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonBasicUser(java.io.PrintWriter _pw, long rol, java.lang.Iterable<User> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonBasicUser(java.io.PrintWriter _pw, long rol, java.util.Map<Long, User> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonNormal(java.io.PrintWriter _pw, User objeto, long rol){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"name\":", objeto.name());
		com.google.appengine.api.datastore.Email val1 = objeto.email();
		if(val1 != null){
			if(__first){
				PrintWriterUtils.print(_pw, "\"email\":", jcrystal.JSONUtils.jsonQuote(val1.getEmail()));
				__first = false;
			}
			else{
				PrintWriterUtils.print(_pw, ",\"email\":", jcrystal.JSONUtils.jsonQuote(val1.getEmail()));
			}
		}
		java.util.Date val2 = objeto.creation();
		if(val2 != null){
			if(__first){
				PrintWriterUtils.print(_pw, "\"creation\":", jcrystal.JSONUtils.jsonQuote(jcrystal.datetime.CrystalDateMilis.SDF.format(val2)));
				__first = false;
			}
			else{
				PrintWriterUtils.print(_pw, ",\"creation\":", jcrystal.JSONUtils.jsonQuote(jcrystal.datetime.CrystalDateMilis.SDF.format(val2)));
			}
		}
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonNormalUser(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<User>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonNormalUser(java.io.PrintWriter _pw, long rol, java.lang.Iterable<User> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonNormalUser(java.io.PrintWriter _pw, long rol, java.util.Map<Long, User> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonDetail(java.io.PrintWriter _pw, User objeto, long rol){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"name\":", objeto.name());
		com.google.appengine.api.datastore.Email val1 = objeto.email();
		if(val1 != null){
			if(__first){
				PrintWriterUtils.print(_pw, "\"email\":", jcrystal.JSONUtils.jsonQuote(val1.getEmail()));
				__first = false;
			}
			else{
				PrintWriterUtils.print(_pw, ",\"email\":", jcrystal.JSONUtils.jsonQuote(val1.getEmail()));
			}
		}
		java.util.Date val2 = objeto.creation();
		if(val2 != null){
			if(__first){
				PrintWriterUtils.print(_pw, "\"creation\":", jcrystal.JSONUtils.jsonQuote(jcrystal.datetime.CrystalDateMilis.SDF.format(val2)));
				__first = false;
			}
			else{
				PrintWriterUtils.print(_pw, ",\"creation\":", jcrystal.JSONUtils.jsonQuote(jcrystal.datetime.CrystalDateMilis.SDF.format(val2)));
			}
		}
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonDetailUser(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<User>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonDetailUser(java.io.PrintWriter _pw, long rol, java.lang.Iterable<User> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonDetailUser(java.io.PrintWriter _pw, long rol, java.util.Map<Long, User> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonFull(java.io.PrintWriter _pw, User objeto, long rol){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"name\":", objeto.name());
		com.google.appengine.api.datastore.Email val1 = objeto.email();
		if(val1 != null){
			if(__first){
				PrintWriterUtils.print(_pw, "\"email\":", jcrystal.JSONUtils.jsonQuote(val1.getEmail()));
				__first = false;
			}
			else{
				PrintWriterUtils.print(_pw, ",\"email\":", jcrystal.JSONUtils.jsonQuote(val1.getEmail()));
			}
		}
		java.util.Date val2 = objeto.creation();
		if(val2 != null){
			if(__first){
				PrintWriterUtils.print(_pw, "\"creation\":", jcrystal.JSONUtils.jsonQuote(jcrystal.datetime.CrystalDateMilis.SDF.format(val2)));
				__first = false;
			}
			else{
				PrintWriterUtils.print(_pw, ",\"creation\":", jcrystal.JSONUtils.jsonQuote(jcrystal.datetime.CrystalDateMilis.SDF.format(val2)));
			}
		}
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonFullUser(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<User>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonFull(_pw, valor, rol));
	}
	public static void toJsonFullUser(java.io.PrintWriter _pw, long rol, java.lang.Iterable<User> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonFull(_pw, valor, rol));
	}
	public static void toJsonFullUser(java.io.PrintWriter _pw, long rol, java.util.Map<Long, User> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonFull(_pw, valor, rol));
	}
	public static void toJsonTostring(java.io.PrintWriter _pw, User objeto, long rol){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"id\":", objeto.id());
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"tostring\":", objeto.toString());
		_pw.print("}");
	}
	public static void toJsonTostringUser(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<User>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonTostring(_pw, valor, rol));
	}
	public static void toJsonTostringUser(java.io.PrintWriter _pw, long rol, java.lang.Iterable<User> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonTostring(_pw, valor, rol));
	}
	public static void toJsonTostringUser(java.io.PrintWriter _pw, long rol, java.util.Map<Long, User> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonTostring(_pw, valor, rol));
	}
}
