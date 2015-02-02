package beans;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-02-02T17:08:57.341-0200")
@StaticMetamodel(Direccion.class)
public class Direccion_ {
	public static volatile SingularAttribute<Direccion, Long> id;
	public static volatile SingularAttribute<Direccion, String> calle;
	public static volatile SingularAttribute<Direccion, Integer> numeroCasa;
	public static volatile SingularAttribute<Direccion, String> complemento;
	public static volatile SingularAttribute<Direccion, String> codigoPostal;
}
