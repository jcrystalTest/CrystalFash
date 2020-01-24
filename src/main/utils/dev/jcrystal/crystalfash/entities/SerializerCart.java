package dev.jcrystal.crystalfash.entities;
import jcrystal.PrintWriterUtils;
public class SerializerCart{
	public static void toJsonId(java.io.PrintWriter _pw, Cart objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonIdCart(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Cart>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonId(_pw, valor, rol));
	}
	public static void toJsonIdCart(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Cart> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonId(_pw, valor, rol));
	}
	public static void toJsonIdCart(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Cart> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonId(_pw, valor, rol));
	}
	public static void toJsonMin(java.io.PrintWriter _pw, Cart objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonMinCart(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Cart>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonMin(_pw, valor, rol));
	}
	public static void toJsonMinCart(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Cart> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonMin(_pw, valor, rol));
	}
	public static void toJsonMinCart(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Cart> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonMin(_pw, valor, rol));
	}
	public static void toJsonBasic(java.io.PrintWriter _pw, Cart objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonBasicCart(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Cart>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonBasicCart(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Cart> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonBasicCart(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Cart> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonNormal(java.io.PrintWriter _pw, Cart objeto, long rol){
		_pw.print("{");
		if((!Double.isInfinite(objeto.subtotal()) && !Double.isNaN(objeto.subtotal()))){
			PrintWriterUtils.print(_pw, "\"subtotal\":", objeto.subtotal());
		}
		if((!Double.isInfinite(objeto.total()) && !Double.isNaN(objeto.total()))){
			PrintWriterUtils.print(_pw, ",\"total\":", objeto.total());
		}
		PrintWriterUtils.printJsonProp(_pw, false, "\"id\":", objeto.id());
		java.util.List<Long> val3 = objeto.items$Key();
		if(val3 != null){
			_pw.print(",\"items\":");
			jcrystal.JSONUtils.jsonQuoteLong(_pw, val3);
		}
		java.util.List<Long> val4 = objeto.favorites$Key();
		if(val4 != null){
			_pw.print(",\"favorites\":");
			jcrystal.JSONUtils.jsonQuoteLong(_pw, val4);
		}
		_pw.print("}");
	}
	public static void toJsonNormalCart(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Cart>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonNormalCart(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Cart> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonNormalCart(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Cart> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonDetail(java.io.PrintWriter _pw, Cart objeto, long rol){
		_pw.print("{");
		if((!Double.isInfinite(objeto.subtotal()) && !Double.isNaN(objeto.subtotal()))){
			PrintWriterUtils.print(_pw, "\"subtotal\":", objeto.subtotal());
		}
		if((!Double.isInfinite(objeto.total()) && !Double.isNaN(objeto.total()))){
			PrintWriterUtils.print(_pw, ",\"total\":", objeto.total());
		}
		PrintWriterUtils.printJsonProp(_pw, false, "\"id\":", objeto.id());
		java.util.List<Long> val3 = objeto.items$Key();
		if(val3 != null){
			_pw.print(",\"items\":");
			jcrystal.JSONUtils.jsonQuoteLong(_pw, val3);
		}
		java.util.List<Long> val4 = objeto.favorites$Key();
		if(val4 != null){
			_pw.print(",\"favorites\":");
			jcrystal.JSONUtils.jsonQuoteLong(_pw, val4);
		}
		_pw.print("}");
	}
	public static void toJsonDetailCart(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Cart>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonDetailCart(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Cart> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonDetailCart(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Cart> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonFull(java.io.PrintWriter _pw, Cart objeto, long rol){
		_pw.print("{");
		if((!Double.isInfinite(objeto.subtotal()) && !Double.isNaN(objeto.subtotal()))){
			PrintWriterUtils.print(_pw, "\"subtotal\":", objeto.subtotal());
		}
		if((!Double.isInfinite(objeto.total()) && !Double.isNaN(objeto.total()))){
			PrintWriterUtils.print(_pw, ",\"total\":", objeto.total());
		}
		PrintWriterUtils.printJsonProp(_pw, false, "\"id\":", objeto.id());
		java.util.List<Long> val3 = objeto.items$Key();
		if(val3 != null){
			_pw.print(",\"items\":");
			jcrystal.JSONUtils.jsonQuoteLong(_pw, val3);
		}
		java.util.List<Long> val4 = objeto.favorites$Key();
		if(val4 != null){
			_pw.print(",\"favorites\":");
			jcrystal.JSONUtils.jsonQuoteLong(_pw, val4);
		}
		_pw.print("}");
	}
	public static void toJsonFullCart(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Cart>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonFull(_pw, valor, rol));
	}
	public static void toJsonFullCart(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Cart> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonFull(_pw, valor, rol));
	}
	public static void toJsonFullCart(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Cart> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonFull(_pw, valor, rol));
	}
	public static void toJsonTostring(java.io.PrintWriter _pw, Cart objeto, long rol){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"id\":", objeto.id());
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"tostring\":", objeto.toString());
		_pw.print("}");
	}
	public static void toJsonTostringCart(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Cart>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonTostring(_pw, valor, rol));
	}
	public static void toJsonTostringCart(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Cart> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonTostring(_pw, valor, rol));
	}
	public static void toJsonTostringCart(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Cart> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonTostring(_pw, valor, rol));
	}
}
