package dev.jcrystal.crystalfash.entities;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
public class MetaCart{
	public static enum M{
		subtotal,
		total,
	}
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Order{
		public M[] value() default {};
	}
}
