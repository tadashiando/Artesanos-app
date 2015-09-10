package dao;

import ui.crud.CrudBuilder;
import ui.crud.CrudComponent;
import beans.Ciudad;
import beans.Empresa;
import beans.Materiales;
import beans.Persona;
import beans.Productos;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.CloseEvent;

import fieldFactory.MaterialesFieldFactory;

public class Registros extends CustomComponent implements Window.CloseListener{
	private static final long serialVersionUID = -2134814601190871857L;
	protected Window ventanaPrincipal;
	protected Window mywindow;

	public Registros(Window ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	public MenuBar.Command registroPersona() {
		CrudComponent<Persona> crud = new CrudBuilder<Persona>(Persona.class).build();
		crud.setCaption("Registro de Persona");
		return commandMenu(crud);
	}

	public MenuBar.Command registroEmpresa() {
		CrudComponent<Empresa> crud = new CrudBuilder<Empresa>(Empresa.class).build();
		crud.setCaption("Registro de Empresa");
		return commandMenu(crud);
	}
	
	public MenuBar.Command registroCiudad() {
		CrudComponent<Ciudad> crud = new CrudBuilder<Ciudad>(Ciudad.class).build();
		crud.setCaption("Registro de Ciudad");
		return commandMenu(crud);
	}
	
	public MenuBar.Command registroProductos() {
		CrudComponent<Productos> crud = new CrudBuilder<Productos>(Productos.class).build();
		crud.setCaption("Registro de Productos y Fórmulas");
		return commandMenu(crud);
	}
	
	public MenuBar.Command registroMateriales() {
		CrudComponent<Materiales> crud = new CrudBuilder<Materiales>(Materiales.class)
		.setFieldFactory(new MaterialesFieldFactory())
		.build();
		return commandMenu(crud);
	}
	
	private MenuBar.Command commandMenu(final CrudComponent<?> crud) {
		MenuBar.Command mycommand = new MenuBar.Command() {
			private static final long serialVersionUID = 7400161727430459001L;

			public void menuSelected(MenuItem selectedItem) {
				
				crud.setSizeFull();
				subWindow(crud);
		    }  
		};
		return mycommand;
	}
	
	public void subWindow(CrudComponent<?> crud){
		mywindow = new Window(crud.getCaption());
		mywindow.setPositionX(200);
		mywindow.setPositionY(100);
		mywindow.setWidth("80%");
//		mywindow.setStyleName("stylesTadashi.css");
		ventanaPrincipal.addWindow(mywindow);
		mywindow.addListener(this);
		
		mywindow.addComponent(crud);
	}
	
	public void windowClose(CloseEvent e) {
	}

}
