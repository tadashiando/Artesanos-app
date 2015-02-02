package beans;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-02-02T17:08:57.404-0200")
@StaticMetamodel(Productos.class)
public class Productos_ {
	public static volatile SingularAttribute<Productos, Long> id;
	public static volatile SingularAttribute<Productos, String> codigo;
	public static volatile SingularAttribute<Productos, String> nombre;
	public static volatile SingularAttribute<Productos, Integer> cantidadGr;
	public static volatile SetAttribute<Productos, MaterialProducto> materialProducto;
}
