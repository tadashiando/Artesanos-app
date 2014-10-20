package beans;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-10-20T13:07:46.280-0200")
@StaticMetamodel(Persona.class)
public class Persona_ {
	public static volatile SingularAttribute<Persona, Long> id;
	public static volatile SingularAttribute<Persona, String> nombre;
	public static volatile SingularAttribute<Persona, String> documentoIdentidad;
	public static volatile SingularAttribute<Persona, String> numeroDeTelefono;
	public static volatile SingularAttribute<Persona, Direccion> direccion;
}
