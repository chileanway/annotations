package cl.sum.chileanway.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Anotación para indicar código eliminable, posterior a ser declarado
 * Deprecated @author mauronunez @category
 *
 */
@Retention(RetentionPolicy.SOURCE)
public @interface RIP {

	public String value();

}
