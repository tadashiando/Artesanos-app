package ui.menus;

import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.Window;

import dao.Registros;

public class MainMenu {
	
	public MenuBar mainMenu(Window ventanaPrinc){
		Registros registros = new Registros(ventanaPrinc);

		MenuBar barmenu = new MenuBar();
		MenuItem menu = barmenu.addItem("Ventas", null, null);

		MenuItem clientes = menu.addItem("Clientes", null, null);
		clientes.addItem("Registro de Personas",
		    new ThemeResource("icons/tea-16px.png"), registros.registroPersona());
		clientes.addItem("Registro de Empresas",
		    new ThemeResource("icons/coffee-16px.png"), registros.registroEmpresa());

		MenuItem productos = menu.addItem("Productos", null, null);
		productos.addItem("Formulas de Productos",
			    new ThemeResource("icons/tea-16px.png"), registros.registroProductos());
		productos.addItem("Formulas de Materiales",
			    new ThemeResource("icons/tea-16px.png"), registros.registroMateriales());

		menu.addSeparator();
		menu.addItem("Quit Drinking", null, null);
		        
		MenuItem snacks = barmenu.addItem("Snacks", null, null);
		snacks.addItem("Weisswurst", null, null);
		snacks.addItem("Bratwurst",  null, null);
		snacks.addItem("Currywurst", null, null);
		        
		MenuItem servs = barmenu.addItem("Services", null, null);
		servs.addItem("Car Service", null, null);
		return barmenu;    
	}
}
