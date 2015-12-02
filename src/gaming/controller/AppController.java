package gaming.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gaming.ui.CharacterPanel;
import gaming.ui.HomePanel;
import gaming.utils.MusicUtils;

public class AppController implements ActionListener{

	private static AppController instance;
	private ViewController vc = ViewController.getInstance();
	private MusicUtils mu = MusicUtils.getInstance();
	
	private AppController() {}
	
	public static AppController getInstance() {
		if(instance == null) {
			instance = new AppController();
		}
		return instance;
	}
	
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
			
		case "quit":
			vc.getMainFrame().dispose();
			break;
		case "home":
			mu.setMusic("imperial_march.wav");
			System.out.println("Setting Home View");
			vc.setMainPanel(new HomePanel());
			break;
		case "character":
			mu.setMusic("starwars.wav");
			vc.setMainPanel(new CharacterPanel());
			break;
		default:
			break;
		}
		
	}

}
