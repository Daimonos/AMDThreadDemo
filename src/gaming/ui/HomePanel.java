package gaming.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gaming.controller.AppController;

public class HomePanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel tLabel;
	private JButton button;
	private AppController appController = AppController.getInstance();
	public HomePanel() {
		super();
		this.setLayout(new BorderLayout());
		intialize();
	}
	
	private void intialize() {
		tLabel = new JLabel("Welcome to The Games!");
		tLabel.setSize(new Dimension(300, 400));
		tLabel.setForeground(Color.RED);
		button = new JButton();
		button.setText("FIRE!");
		button.setActionCommand("blaster_fire");
		button.addActionListener(appController);
		this.add(tLabel, BorderLayout.NORTH);
		this.add(button, BorderLayout.CENTER);
	}
}
