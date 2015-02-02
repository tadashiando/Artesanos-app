package beans;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-02-02T17:08:57.399-0200")
@StaticMetamodel(Persona.class)
public class Persona_ {
	public static volatile SingularAttribute<Persona, Long> id;
	public static volatile SingularAttribute<Persona, String> nombre;
	public static volatile SingularAttribute<Persona, String> documentoIdentidad;
	public static volatile SingularAttribute<Persona, String> numeroDeTelefono;
	public static volatile SingularAttribute<Persona, String> email;
	public static volatile SetAttribute<Persona, Direccion> direccion;
}
