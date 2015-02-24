package beans;

import static javax.persistence.CascadeType.ALL;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import annotation.CrudExtras;
import enterpriseapp.hibernate.annotation.CrudField;
import enterpriseapp.hibernate.dto.Dto;

@Entity(name = "productos")
public class Productos extends Dto implements Serializable{
	private static final long serialVersionUID = -150009621453090102L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@CrudExtras(showField=false)
	@CrudField(showInTable=false)
	private Long id;
	private String codigo;
	private String nombre;
	@CrudExtras(name = "Cantidad (Gr.)")
	private Integer cantidadGr;
	
	@OneToMany(cascade=ALL, orphanRemoval=true)
	@CrudField(embedded=true, forceRequired=true, showInTable=false)
	@CrudExtras(name = "Fórmula")
	private Set<MaterialProducto> materialProducto; 

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Object id) {
		this.id = (Long) id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidadGr() {
		return cantidadGr;
	}

	public void setCantidadGr(Integer cantidadGr) {
		this.cantidadGr = cantidadGr;
	}
	
	public Set<MaterialProducto> getMaterialProducto() {
		return materialProducto;
	}

	public void setMaterialProducto(Set<MaterialProducto> materialProducto) {
		this.materialProducto = materialProducto;
	}
}
