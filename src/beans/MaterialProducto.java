package beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import annotation.CrudExtras;
import enterpriseapp.hibernate.annotation.CrudTable;
import enterpriseapp.hibernate.dto.Dto;

@Entity(name = "materialProducto")
@CrudTable(filteringPropertyName="material")
public class MaterialProducto extends Dto implements Serializable {
	private static final long serialVersionUID = -7802414842060633708L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@CrudExtras(showField=false)
	private Long id;
	
	@ManyToOne
	@JoinColumn(nullable=false)
	private Materiales materiales;

	private Integer cantidadGr;
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Object id) {
		this.id = (Long) id;
	}

	public Integer getCantidadGr() {
		return cantidadGr;
	}

	public void setCantidadGr(Integer cantidadGr) {
		this.cantidadGr = cantidadGr;
	}
	
	public Materiales getMateriales() {
		return materiales;
	}

	public void setMateriales(Materiales materiales) {
		this.materiales = materiales;
	}
}
