package dev.jcrystal.crystalfash.entities;
import jcrystal.PrintWriterUtils;
public class SerializerProduct{
	public static void toJsonId(java.io.PrintWriter _pw, Product objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonIdProduct(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Product>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonId(_pw, valor, rol));
	}
	public static void toJsonIdProduct(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Product> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonId(_pw, valor, rol));
	}
	public static void toJsonIdProduct(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Product> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonId(_pw, valor, rol));
	}
	public static void toJsonMin(java.io.PrintWriter _pw, Product objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonMinProduct(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Product>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonMin(_pw, valor, rol));
	}
	public static void toJsonMinProduct(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Product> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonMin(_pw, valor, rol));
	}
	public static void toJsonMinProduct(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Product> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonMin(_pw, valor, rol));
	}
	public static void toJsonBasic(java.io.PrintWriter _pw, Product objeto, long rol){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"id\":", objeto.id());
		_pw.print("}");
	}
	public static void toJsonBasicProduct(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Product>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonBasicProduct(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Product> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonBasicProduct(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Product> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonBasic(_pw, valor, rol));
	}
	public static void toJsonNormal(java.io.PrintWriter _pw, Product objeto, long rol){
		_pw.print("{");
		if((!Double.isInfinite(objeto.price()) && !Double.isNaN(objeto.price()))){
			PrintWriterUtils.print(_pw, "\"price\":", objeto.price());
		}
		if((!Double.isInfinite(objeto.discount()) && !Double.isNaN(objeto.discount()))){
			PrintWriterUtils.print(_pw, ",\"discount\":", objeto.discount());
		}
		if((!Double.isInfinite(objeto.oldPrice()) && !Double.isNaN(objeto.oldPrice()))){
			PrintWriterUtils.print(_pw, ",\"oldPrice\":", objeto.oldPrice());
		}
		PrintWriterUtils.printJsonProp(_pw, false, "\"id\":", objeto.id());
		PrintWriterUtils.printJsonProp(_pw, false, "\"name\":", objeto.name());
		PrintWriterUtils.printJsonProp(_pw, false, "\"description\":", objeto.description());
		dev.jcrystal.crystalfash.entities.Categories val6 = objeto.category();
		if(val6 != null){
			PrintWriterUtils.print(_pw, ",\"category\":", val6.id);
		}
		dev.jcrystal.crystalfash.entities.Color val7 = objeto.color();
		if(val7 != null){
			PrintWriterUtils.print(_pw, ",\"color\":", val7.id);
		}
		dev.jcrystal.crystalfash.entities.Size val8 = objeto.size();
		if(val8 != null){
			PrintWriterUtils.print(_pw, ",\"size\":", val8.id);
		}
		PrintWriterUtils.printJsonProp(_pw, false, "\"image\":", objeto.image());
		_pw.print("}");
	}
	public static void toJsonNormalProduct(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Product>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonNormalProduct(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Product> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonNormalProduct(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Product> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonNormal(_pw, valor, rol));
	}
	public static void toJsonDetail(java.io.PrintWriter _pw, Product objeto, long rol){
		_pw.print("{");
		if((!Double.isInfinite(objeto.price()) && !Double.isNaN(objeto.price()))){
			PrintWriterUtils.print(_pw, "\"price\":", objeto.price());
		}
		if((!Double.isInfinite(objeto.discount()) && !Double.isNaN(objeto.discount()))){
			PrintWriterUtils.print(_pw, ",\"discount\":", objeto.discount());
		}
		if((!Double.isInfinite(objeto.oldPrice()) && !Double.isNaN(objeto.oldPrice()))){
			PrintWriterUtils.print(_pw, ",\"oldPrice\":", objeto.oldPrice());
		}
		PrintWriterUtils.printJsonProp(_pw, false, "\"id\":", objeto.id());
		PrintWriterUtils.printJsonProp(_pw, false, "\"name\":", objeto.name());
		PrintWriterUtils.printJsonProp(_pw, false, "\"description\":", objeto.description());
		dev.jcrystal.crystalfash.entities.Categories val6 = objeto.category();
		if(val6 != null){
			PrintWriterUtils.print(_pw, ",\"category\":", val6.id);
		}
		dev.jcrystal.crystalfash.entities.Color val7 = objeto.color();
		if(val7 != null){
			PrintWriterUtils.print(_pw, ",\"color\":", val7.id);
		}
		dev.jcrystal.crystalfash.entities.Size val8 = objeto.size();
		if(val8 != null){
			PrintWriterUtils.print(_pw, ",\"size\":", val8.id);
		}
		PrintWriterUtils.printJsonProp(_pw, false, "\"image\":", objeto.image());
		_pw.print("}");
	}
	public static void toJsonDetailProduct(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Product>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonDetailProduct(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Product> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonDetailProduct(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Product> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonDetail(_pw, valor, rol));
	}
	public static void toJsonFull(java.io.PrintWriter _pw, Product objeto, long rol){
		_pw.print("{");
		if((!Double.isInfinite(objeto.price()) && !Double.isNaN(objeto.price()))){
			PrintWriterUtils.print(_pw, "\"price\":", objeto.price());
		}
		if((!Double.isInfinite(objeto.discount()) && !Double.isNaN(objeto.discount()))){
			PrintWriterUtils.print(_pw, ",\"discount\":", objeto.discount());
		}
		if((!Double.isInfinite(objeto.oldPrice()) && !Double.isNaN(objeto.oldPrice()))){
			PrintWriterUtils.print(_pw, ",\"oldPrice\":", objeto.oldPrice());
		}
		PrintWriterUtils.printJsonProp(_pw, false, "\"id\":", objeto.id());
		PrintWriterUtils.printJsonProp(_pw, false, "\"name\":", objeto.name());
		PrintWriterUtils.printJsonProp(_pw, false, "\"description\":", objeto.description());
		dev.jcrystal.crystalfash.entities.Categories val6 = objeto.category();
		if(val6 != null){
			PrintWriterUtils.print(_pw, ",\"category\":", val6.id);
		}
		dev.jcrystal.crystalfash.entities.Color val7 = objeto.color();
		if(val7 != null){
			PrintWriterUtils.print(_pw, ",\"color\":", val7.id);
		}
		dev.jcrystal.crystalfash.entities.Size val8 = objeto.size();
		if(val8 != null){
			PrintWriterUtils.print(_pw, ",\"size\":", val8.id);
		}
		PrintWriterUtils.printJsonProp(_pw, false, "\"image\":", objeto.image());
		_pw.print("}");
	}
	public static void toJsonFullProduct(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Product>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonFull(_pw, valor, rol));
	}
	public static void toJsonFullProduct(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Product> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonFull(_pw, valor, rol));
	}
	public static void toJsonFullProduct(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Product> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonFull(_pw, valor, rol));
	}
	public static void toJsonTostring(java.io.PrintWriter _pw, Product objeto, long rol){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"id\":", objeto.id());
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"tostring\":", objeto.toString());
		_pw.print("}");
	}
	public static void toJsonTostringProduct(java.io.PrintWriter _pw, long rol, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Product>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonTostring(_pw, valor, rol));
	}
	public static void toJsonTostringProduct(java.io.PrintWriter _pw, long rol, java.lang.Iterable<Product> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJsonTostring(_pw, valor, rol));
	}
	public static void toJsonTostringProduct(java.io.PrintWriter _pw, long rol, java.util.Map<Long, Product> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJsonTostring(_pw, valor, rol));
	}
}
