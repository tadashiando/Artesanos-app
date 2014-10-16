package beans;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-10-06T23:09:56.583-0300")
@StaticMetamodel(Persona.class)
public class Persona_ {
	public static volatile SingularAttribute<Persona, Long> id;
	public static volatile SingularAttribute<Persona, String> nombre;
	public static volatile SingularAttribute<Persona, String> numeroDeTelefono;
	public static volatile SingularAttribute<Persona, String> documentoIdentidad;
	public static volatile SingularAttribute<Persona, Direccion> direccion;
}
