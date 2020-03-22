package dev.jcrystal.crystalfash.security;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
public class MetaToken{
	public static enum M{
		rol,
	}
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Order{
		public M[] value() default {};
	}
}
