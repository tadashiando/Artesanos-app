package beans;

import static javax.persistence.CascadeType.ALL;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import enterpriseapp.hibernate.annotation.CrudField;
import enterpriseapp.hibernate.annotation.CrudName;
import enterpriseapp.hibernate.annotation.CrudTable;
import enterpriseapp.hibernate.dto.Dto;

@Entity(name = "persona")
@CrudTable(filteringPropertyName="nombre")
public class Persona extends Dto implements Serializable{
	private static final long serialVersionUID = -3097781467409038393L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@CrudField(showInTable=false)
	private Long id;
	
	@Column(nullable=false)
	private String nombre;
	
	@CrudField(showInTable=false)
	private String documentoIdentidad;
	
	private String numeroDeTelefono;
	
	@CrudField(isEmail=true)
	private String email;
	
	@CrudName(name = "Dirección")
	@OneToMany(cascade=ALL, orphanRemoval=true)
	@CrudField(embedded=true, forceRequired=true)
	private Set<Direccion> direccion; 

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Direccion> getDireccion() {
		return direccion;
	}

	public void setDireccion(Set<Direccion> direccion) {
		this.direccion = direccion;
	}
}