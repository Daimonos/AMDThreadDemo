package gaming.controller;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import gaming.ui.MainFrame;

public class ViewController {

	private static ViewController instance;
	private MainFrame mf;
	private JPanel mainPanel;

	private ViewController() {
	};

	public static ViewController getInstance() {
		if (instance == null) {
			instance = new ViewController();
		}
		return instance;
	}

	public void setMainFrame(MainFrame mf) {
		this.mf = mf;
	}

	public MainFrame getMainFrame() {
		return mf;
	}

	public void setMainPanel(JPanel p) {
		if(mainPanel != null)
			mf.remove(mainPanel);
		this.mainPanel = p;
		mf.add(mainPanel, BorderLayout.CENTER);
		mf.revalidate();
		mf.repaint();
	}

}
