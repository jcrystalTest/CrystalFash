package dev.jcrystal.crystalfash.entities;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
public class MetaCartItem{
	public static enum M{
		quantity,
	}
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Order{
		public M[] value() default {};
	}
}
