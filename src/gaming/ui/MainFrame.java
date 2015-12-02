package gaming.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MainMenu menu = new MainMenu();

	public MainFrame() {
		super();
		initialize();
	}
	
	public void initialize() {
		this.setTitle("STAR GAMES");
		this.setLayout(new BorderLayout());
		this.add(menu, BorderLayout.NORTH);
		
		this.setPreferredSize(new Dimension(500,500));
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
