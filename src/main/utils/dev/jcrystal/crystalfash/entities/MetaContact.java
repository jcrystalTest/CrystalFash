package dev.jcrystal.crystalfash.entities;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
public class MetaContact{
	public static enum M{
		name,
		email,
		message,
	}
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Order{
		public M[] value() default {};
	}
}
