package gaming.ui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CharacterPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GridBagConstraints c;
	private JLabel tLabel;
	private JTextField tField;
	private Dimension tFieldDimension = new Dimension(150, 20);
	public CharacterPanel() {
		super(new GridBagLayout());
		initialize();
	}
	
	private void initialize() {
		c = new GridBagConstraints();
		c.insets = new Insets(5,5,5,5);
		c.gridx = 0;
		c.gridy = 0;
		tLabel = new JLabel("Name");
		this.add(tLabel, c);
		c.gridx++;
		tField = new JTextField();
		tField.setName("name");
		tField.setPreferredSize(tFieldDimension);
		this.add(tField, c);
		
		tLabel = new JLabel("Gender");
		tField = new JTextField();
		tField.setPreferredSize(tFieldDimension);
		tField.setName("gender");
		c.gridx=0;
		c.gridy=1;
		this.add(tLabel, c);
		c.gridx++;
		this.add(tField, c);
		
	}
}
