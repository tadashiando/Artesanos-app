package beans;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import enterpriseapp.hibernate.annotation.CrudTable;
import enterpriseapp.hibernate.dto.Dto;

@Entity(name = "materiales")
@CrudTable(filteringPropertyName="material")
public class Materiales extends Dto implements Serializable{
	private static final long serialVersionUID = -3648663256291840590L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String material;
	private Integer cantidadGr;
	private BigDecimal precio;
	
	@Override
	public String toString() {
		return material;
	}
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Object id) {
		this.id = (Long) id;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Integer getCantidadGr() {
		return cantidadGr;
	}

	public void setCantidadGr(Integer cantidadGr) {
		this.cantidadGr = cantidadGr;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
}
