package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Sets CRUD fields details. Use it in your Entities classes.
 * @author Eduardo Ando
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface CrudName {
	
	/**
	 * @return a String who represent the label of the field.
	 */
	String name() default "";
}
