package beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the persona_direccion database table.
 * 
 */
@Embeddable
public class PersonaDireccionPK implements Serializable {
	private static final long serialVersionUID = -1178427109150016182L;

	@Column(name="persona_id", insertable=false, updatable=false)
	private Long personaId;

	@Column(name="direccion_id", insertable=false, updatable=false)
	private Long direccionId;

	public PersonaDireccionPK() {
	}
	public Long getPersonaId() {
		return this.personaId;
	}
	public void setPersonaId(Long personaId) {
		this.personaId = personaId;
	}
	public Long getDireccionId() {
		return this.direccionId;
	}
	public void setDireccionId(Long direccionId) {
		this.direccionId = direccionId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PersonaDireccionPK)) {
			return false;
		}
		PersonaDireccionPK castOther = (PersonaDireccionPK)other;
		return 
			this.personaId.equals(castOther.personaId)
			&& this.direccionId.equals(castOther.direccionId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.personaId.hashCode();
		hash = hash * prime + this.direccionId.hashCode();
		
		return hash;
	}
}