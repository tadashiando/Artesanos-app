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
		MenuItem drinks = barmenu.addItem("Ventas", null, null);

		MenuItem hots = drinks.addItem("Clientes", null, null);
		hots.addItem("Registro de Personas",
		    new ThemeResource("icons/tea-16px.png"), registros.registroPersona());
		hots.addItem("Registro de Empresas",
		    new ThemeResource("icons/coffee-16px.png"), registros.registroEmpresa());

		MenuItem colds = drinks.addItem("Cold", null, null);
		colds.addItem("Milk",      null, null);
		colds.addItem("Weissbier", null, null);

		drinks.addSeparator();
		drinks.addItem("Quit Drinking", null, null);
		        
		MenuItem snacks = barmenu.addItem("Snacks", null, null);
		snacks.addItem("Weisswurst", null, null);
		snacks.addItem("Bratwurst",  null, null);
		snacks.addItem("Currywurst", null, null);
		        
		MenuItem servs = barmenu.addItem("Services", null, null);
		servs.addItem("Car Service", null, null);
		return barmenu;    
	}
}
