package beans;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import enterpriseapp.hibernate.dto.Dto;

@Entity(name = "materiales")
public class Materiales extends Dto implements Serializable{
	private static final long serialVersionUID = -3648663256291840590L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String material;
	private Integer cantidadGr;
	private BigDecimal precio;
	
	@Override
	public Object getId() {
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
