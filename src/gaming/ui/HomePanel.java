package gaming.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel tLabel;
	private ScreenPanel panel;
	public HomePanel() {
		super();
		this.setLayout(new BorderLayout());
		intialize();
	}
	
	private void intialize() {
		panel = new ScreenPanel();
		tLabel = new JLabel("Welcome to The Games!");
		tLabel.setSize(new Dimension(300, 400));
		tLabel.setForeground(Color.RED);
		this.add(tLabel, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
	}
}
