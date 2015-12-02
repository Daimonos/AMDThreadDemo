package gaming.ui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import gaming.controller.AppController;

public class MainMenu extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenu file;
	private JMenuItem home, character, quit;
	
	public MainMenu() {
		super();
		initialize();
	}
	
	private void initialize() {
		file = new JMenu("FILE");
		quit = new JMenuItem("QUIT");
		home = new JMenuItem("HOME");
		character = new JMenuItem("CHARACTER");
		
		file.add(home);
		file.add(character);
		file.add(quit);
		
		home.setActionCommand("home");
		character.setActionCommand("character");
		quit.setActionCommand("quit");
		
		home.addActionListener(AppController.getInstance());
		character.addActionListener(AppController.getInstance());
		quit.addActionListener(AppController.getInstance());
		this.add(file);
	}
}
