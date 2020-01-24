package dev.jcrystal.crystalfash.entities;
import jcrystal.PrintWriterUtils;
public class SerializerCartItem{
	public static void toJsonId(java.io.PrintWriter _pw, CartItem objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonIdCartItem(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<CartItem>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonId(_pw, valor, rol));
	}
	public static void toJsonIdCartItem(java.io.PrintWriter _pw, long rol, java.lang.Iterable<CartItem> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonId(_pw, valor, rol));
	}
	public static void toJsonIdCartItem(java.io.PrintWriter _pw, long rol, java.util.Map<Long, CartItem> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonId(_pw, valor, rol));
	}
	public static void toJsonMin(java.io.PrintWriter _pw, CartItem objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonMinCartItem(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<CartItem>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonMin(_pw, valor, rol));
	}
	public static void toJsonMinCartItem(java.io.PrintWriter _pw, long rol, java.lang.Iterable<CartItem> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonMin(_pw, valor, rol));
	}
	public static void toJsonMinCartItem(java.io.PrintWriter _pw, long rol, java.util.Map<Long, CartItem> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonMin(_pw, valor, rol));
	}
	public static void toJsonBasic(java.io.PrintWriter _pw, CartItem objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonBasicCartItem(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<CartItem>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonBasicCartItem(java.io.PrintWriter _pw, long rol, java.lang.Iterable<CartItem> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonBasicCartItem(java.io.PrintWriter _pw, long rol, java.util.Map<Long, CartItem> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonNormal(java.io.PrintWriter _pw, CartItem objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.print(_pw, "\"quantity\":", objeto.quantity());
		PrintWriterUtils.printJsonProp(_pw, false, "\"id\":", objeto.id());
		PrintWriterUtils.printJsonProp(_pw, false, "\"product\":", objeto.product$Key());
		_pw.print("}");
	}
	public static void toJsonNormalCartItem(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<CartItem>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonNormalCartItem(java.io.PrintWriter _pw, long rol, java.lang.Iterable<CartItem> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonNormalCartItem(java.io.PrintWriter _pw, long rol, java.util.Map<Long, CartItem> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonDetail(java.io.PrintWriter _pw, CartItem objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.print(_pw, "\"quantity\":", objeto.quantity());
		PrintWriterUtils.printJsonProp(_pw, false, "\"id\":", objeto.id());
		PrintWriterUtils.printJsonProp(_pw, false, "\"product\":", objeto.product$Key());
		_pw.print("}");
	}
	public static void toJsonDetailCartItem(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<CartItem>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonDetailCartItem(java.io.PrintWriter _pw, long rol, java.lang.Iterable<CartItem> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonDetailCartItem(java.io.PrintWriter _pw, long rol, java.util.Map<Long, CartItem> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonFull(java.io.PrintWriter _pw, CartItem objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.print(_pw, "\"quantity\":", objeto.quantity());
		PrintWriterUtils.printJsonProp(_pw, false, "\"id\":", objeto.id());
		PrintWriterUtils.printJsonProp(_pw, false, "\"product\":", objeto.product$Key());
		_pw.print("}");
	}
	public static void toJsonFullCartItem(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<CartItem>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonFull(_pw, valor, rol));
	}
	public static void toJsonFullCartItem(java.io.PrintWriter _pw, long rol, java.lang.Iterable<CartItem> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonFull(_pw, valor, rol));
	}
	public static void toJsonFullCartItem(java.io.PrintWriter _pw, long rol, java.util.Map<Long, CartItem> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonFull(_pw, valor, rol));
	}
	public static void toJsonTostring(java.io.PrintWriter _pw, CartItem objeto, long rol){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"id\":", objeto.id());
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"tostring\":", objeto.toString());
		_pw.print("}");
	}
	public static void toJsonTostringCartItem(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<CartItem>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonTostring(_pw, valor, rol));
	}
	public static void toJsonTostringCartItem(java.io.PrintWriter _pw, long rol, java.lang.Iterable<CartItem> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonTostring(_pw, valor, rol));
	}
	public static void toJsonTostringCartItem(java.io.PrintWriter _pw, long rol, java.util.Map<Long, CartItem> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonTostring(_pw, valor, rol));
	}
}
