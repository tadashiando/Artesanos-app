package beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import enterpriseapp.hibernate.dto.Dto;

@Entity(name = "empresa")
public class Empresa extends Dto implements Serializable{
	private static final long serialVersionUID = -467779113086637591L;

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long id;
		
		@Column(nullable=false)
		private String nombre;
		
		private String numeroDeTelefono;

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

		public String getNumeroDeTelefono() {
			return numeroDeTelefono;
		}

		public void setNumeroDeTelefono(String numeroDeTelefono) {
			this.numeroDeTelefono = numeroDeTelefono;
		}
	}
