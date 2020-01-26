package dev.jcrystal.crystalfash.entities;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
public class MetaProduct{
	public static enum M{
		name,
		description,
		category,
		price,
		discount,
		oldPrice,
		color,
		size,
		image,
	}
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Order{
		public M[] value() default {};
	}
}
