package beans;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-01-23T13:38:24.676-0200")
@StaticMetamodel(MaterialProducto.class)
public class MaterialProducto_ {
	public static volatile SingularAttribute<MaterialProducto, Long> id;
	public static volatile SingularAttribute<MaterialProducto, Materiales> materiales;
	public static volatile SingularAttribute<MaterialProducto, Integer> cantidadGr;
}