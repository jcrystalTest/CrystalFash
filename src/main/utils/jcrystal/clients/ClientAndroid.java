package jcrystal.clients;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface ClientAndroid{
	public String id() default "android";
}
