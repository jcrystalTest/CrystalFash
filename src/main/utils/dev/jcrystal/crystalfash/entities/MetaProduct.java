package dev.jcrystal.crystalfash.entities;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
public class MetaProduct{
	public static enum M{
		name,
		category,
		price,
		discount,
		oldPrice,
		color,
		size,
	}
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Order{
		public M[] value() default {};
	}
}
