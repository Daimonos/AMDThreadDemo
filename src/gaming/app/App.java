package gaming.app;

import gaming.controller.ViewController;
import gaming.ui.MainFrame;
import gaming.ui.MainPanel;

public class App {

	private MainFrame mf;
	private ViewController vc;
	
	public App() {

	}
	
	public void go() {
		mf = new MainFrame();
		vc = ViewController.getInstance();
		vc.setMainFrame(mf);
		vc.setMainPanel(new MainPanel());
	}
	
	
}
