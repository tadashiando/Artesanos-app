package dao;

import beans.Empresa;
import beans.Persona;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.CloseEvent;

import enterpriseapp.ui.crud.CrudBuilder;
import enterpriseapp.ui.crud.CrudComponent;

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
		mywindow.setWidth("60%");
		ventanaPrincipal.addWindow(mywindow);
		mywindow.addListener(this);
		
		mywindow.addComponent(crud);
	}
	
	public void windowClose(CloseEvent e) {
	}

}
