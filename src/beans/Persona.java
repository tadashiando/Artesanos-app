package beans;

import java.io.Serializable;
import static javax.persistence.CascadeType.ALL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import enterpriseapp.hibernate.dto.Dto;

@Entity(name = "persona")
public class Persona extends Dto implements Serializable{
	private static final long serialVersionUID = -3097781467409038393L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String nombre;
	
	private String documentoIdentidad;
	
	private String numeroDeTelefono;
	
	@OneToOne(cascade = ALL)
	private Direccion direccion; 

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Object id) {
		this.id = (Long) id;
	}
   
	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumentoIdentidad() {
		return documentoIdentidad;
	}

	public void setDocumentoIdentidad(String documentoIdentidad) {
		this.documentoIdentidad = documentoIdentidad;
	}

	public String getNumeroDeTelefono() {
		return numeroDeTelefono;
	}

	public void setNumeroDeTelefono(String numeroDeTelefono) {
		this.numeroDeTelefono = numeroDeTelefono;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
}