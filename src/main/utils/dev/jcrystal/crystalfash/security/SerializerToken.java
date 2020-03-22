package dev.jcrystal.crystalfash.security;
import jcrystal.PrintWriterUtils;
public class SerializerToken{
	public static void toJsonId(java.io.PrintWriter _pw, Token objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"token\":", objeto.token());
		_pw.print("}");
	}
	public static void toJsonIdToken(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Token>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonId(_pw, valor, rol));
	}
	public static void toJsonIdToken(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Token> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonId(_pw, valor, rol));
	}
	public static void toJsonIdToken(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Token> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonId(_pw, valor, rol));
	}
	public static void toJsonMin(java.io.PrintWriter _pw, Token objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"token\":", objeto.token());
		_pw.print("}");
	}
	public static void toJsonMinToken(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Token>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonMin(_pw, valor, rol));
	}
	public static void toJsonMinToken(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Token> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonMin(_pw, valor, rol));
	}
	public static void toJsonMinToken(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Token> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonMin(_pw, valor, rol));
	}
	public static void toJsonBasic(java.io.PrintWriter _pw, Token objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"token\":", objeto.token());
		_pw.print("}");
	}
	public static void toJsonBasicToken(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Token>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonBasicToken(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Token> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonBasicToken(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Token> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonNormal(java.io.PrintWriter _pw, Token objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.print(_pw, "\"rol\":", objeto.rol());
		PrintWriterUtils.printJsonProp(_pw, false, "\"token\":", objeto.token());
		PrintWriterUtils.printJsonProp(_pw, false, "\"user\":", objeto.user$Key());
		_pw.print("}");
	}
	public static void toJsonNormalToken(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Token>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonNormalToken(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Token> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonNormalToken(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Token> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonDetail(java.io.PrintWriter _pw, Token objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.print(_pw, "\"rol\":", objeto.rol());
		PrintWriterUtils.printJsonProp(_pw, false, "\"token\":", objeto.token());
		PrintWriterUtils.printJsonProp(_pw, false, "\"user\":", objeto.user$Key());
		_pw.print("}");
	}
	public static void toJsonDetailToken(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Token>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonDetailToken(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Token> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonDetailToken(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Token> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonFull(java.io.PrintWriter _pw, Token objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.print(_pw, "\"rol\":", objeto.rol());
		PrintWriterUtils.printJsonProp(_pw, false, "\"token\":", objeto.token());
		PrintWriterUtils.printJsonProp(_pw, false, "\"user\":", objeto.user$Key());
		_pw.print("}");
	}
	public static void toJsonFullToken(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Token>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonFull(_pw, valor, rol));
	}
	public static void toJsonFullToken(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Token> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonFull(_pw, valor, rol));
	}
	public static void toJsonFullToken(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Token> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonFull(_pw, valor, rol));
	}
	public static void toJsonTostring(java.io.PrintWriter _pw, Token objeto, long rol){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"token\":", objeto.token());
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"tostring\":", objeto.toString());
		_pw.print("}");
	}
	public static void toJsonTostringToken(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Token>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonTostring(_pw, valor, rol));
	}
	public static void toJsonTostringToken(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Token> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonTostring(_pw, valor, rol));
	}
	public static void toJsonTostringToken(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Token> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonTostring(_pw, valor, rol));
	}
}
