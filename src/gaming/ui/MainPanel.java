package gaming.ui;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3652511447092543759L;
	private JLabel label;
	
	public MainPanel() {
		super(new BorderLayout());
		initialize();
	}
	
	private void initialize() {
		label = new JLabel("Choose File -> Home to get started! File->Character to do some character stuff");
		this.add(label, BorderLayout.CENTER);
	}
}
