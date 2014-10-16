package ui;

import ui.menus.MainMenu;

import com.vaadin.ui.MenuBar;
import com.vaadin.ui.Window;

import enterpriseapp.EnterpriseApplication;

public class ArtesanosApp extends EnterpriseApplication {
	private static final long serialVersionUID = -7249549263445232080L;

	@Override
	public void init() {
		super.init();

		Window mainWindow = new Window("Artesanos del Vallecito");
		mainWindow.setSizeFull();
		MenuBar menuBar = new MainMenu().mainMenu(mainWindow);
		mainWindow.addComponent(menuBar);
		setMainWindow(mainWindow);
	}	
	
	
}