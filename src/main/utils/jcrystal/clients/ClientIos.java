package jcrystal.clients;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface ClientIos{
	public String id() default "ios";
}
