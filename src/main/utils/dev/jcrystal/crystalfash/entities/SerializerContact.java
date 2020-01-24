package dev.jcrystal.crystalfash.entities;
import jcrystal.PrintWriterUtils;
public class SerializerContact{
	public static void toJsonId(java.io.PrintWriter _pw, Contact objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonIdContact(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Contact>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonId(_pw, valor, rol));
	}
	public static void toJsonIdContact(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Contact> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonId(_pw, valor, rol));
	}
	public static void toJsonIdContact(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Contact> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonId(_pw, valor, rol));
	}
	public static void toJsonMin(java.io.PrintWriter _pw, Contact objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonMinContact(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Contact>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonMin(_pw, valor, rol));
	}
	public static void toJsonMinContact(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Contact> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonMin(_pw, valor, rol));
	}
	public static void toJsonMinContact(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Contact> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonMin(_pw, valor, rol));
	}
	public static void toJsonBasic(java.io.PrintWriter _pw, Contact objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonBasicContact(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Contact>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonBasicContact(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Contact> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonBasicContact(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Contact> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonNormal(java.io.PrintWriter _pw, Contact objeto, long rol){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"name\":", objeto.name());
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"email\":", objeto.email());
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"message\":", objeto.message());
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonNormalContact(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Contact>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonNormalContact(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Contact> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonNormalContact(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Contact> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonDetail(java.io.PrintWriter _pw, Contact objeto, long rol){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"name\":", objeto.name());
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"email\":", objeto.email());
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"message\":", objeto.message());
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonDetailContact(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Contact>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonDetailContact(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Contact> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonDetailContact(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Contact> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonFull(java.io.PrintWriter _pw, Contact objeto, long rol){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"name\":", objeto.name());
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"email\":", objeto.email());
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"message\":", objeto.message());
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonFullContact(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Contact>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonFull(_pw, valor, rol));
	}
	public static void toJsonFullContact(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Contact> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonFull(_pw, valor, rol));
	}
	public static void toJsonFullContact(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Contact> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonFull(_pw, valor, rol));
	}
	public static void toJsonTostring(java.io.PrintWriter _pw, Contact objeto, long rol){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"id\":", objeto.id());
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"tostring\":", objeto.toString());
		_pw.print("}");
	}
	public static void toJsonTostringContact(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Contact>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonTostring(_pw, valor, rol));
	}
	public static void toJsonTostringContact(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Contact> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonTostring(_pw, valor, rol));
	}
	public static void toJsonTostringContact(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Contact> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonTostring(_pw, valor, rol));
	}
}
