package beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the persona_direccion database table.
 * 
 */
@Entity
@Table(name="persona_direccion")
@NamedQuery(name="PersonaDireccion.findAll", query="SELECT p FROM PersonaDireccion p")
public class PersonaDireccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PersonaDireccionPK id;

	public PersonaDireccion() {
	}

	public PersonaDireccionPK getId() {
		return this.id;
	}

	public void setId(PersonaDireccionPK id) {
		this.id = id;
	}

}