package jcrystal.mobile.entities.enums;
public enum Size{
	XS(1000),
	S(2000),
	M(3000),
	L(4000),
	XL(5000),
	;
	public final int id;
	Size(int id){
		this.id = id;
	}
	public String rawName(){
		switch(this){
			case XS : return "XS";
			case S : return "S";
			case M : return "M";
			case L : return "L";
			case XL : return "XL";
		}
		return null;
	}
	public static Size fromId(int id){
		switch(id){
			case 1000: return XS;
			case 2000: return S;
			case 3000: return M;
			case 4000: return L;
			case 5000: return XL;
		}
		return null;
	}
	public static <T> T[] mapped(Class<T> clase, jcrystal.mobile.net.utils.Function<Size, T> mapper){
		@SuppressWarnings("unchecked")
		Size[] vals = values();
		final T[] a = (T[]) java.lang.reflect.Array.newInstance(clase, vals.length);
		for(int e = 0; e < a.length; e++){
			a[e] = mapper.eval(vals[e]);
		}
		return a;
	}
	public static <T> T[] mapped(Class<T> clase, jcrystal.mobile.net.utils.Predicate<Size> p, jcrystal.mobile.net.utils.Function<Size, T> mapper){
		@SuppressWarnings("unchecked")
		Size[] vals = values();
		int size = 0;
		for(int e = 0; e < vals.length; e++){
			if(p.eval(vals[e]))size++;
		}
		final T[] a = (T[]) java.lang.reflect.Array.newInstance(clase, size);
		for(int e = 0, i = 0; e < vals.length; e++){
			if(p.eval(vals[e])){
				a[i++] = mapper.eval(vals[e]);
			}
		}
		return a;
	}
}
