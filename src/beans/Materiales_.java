package beans;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-10-06T23:29:20.736-0300")
@StaticMetamodel(Materiales.class)
public class Materiales_ {
	public static volatile SingularAttribute<Materiales, Long> id;
	public static volatile SingularAttribute<Materiales, String> material;
	public static volatile SingularAttribute<Materiales, Integer> cantidadGr;
	public static volatile SingularAttribute<Materiales, BigDecimal> precio;
}
