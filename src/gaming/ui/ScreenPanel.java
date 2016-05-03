package gaming.ui;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import gaming.utils.MusicUtils;

public class ScreenPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 718804132857186865L;

	public ScreenPanel() {
		super();
		this.setLayout(new BorderLayout());
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("SOURCE BUTTON: "+e.getButton());
				switch(e.getButton()) {
				case MouseEvent.BUTTON1:
					MusicUtils.getInstance().playSoundEffect("blaster_fire.wav");
					break;
				case MouseEvent.BUTTON3:
					
					break;
				default:
				break;
				}
				System.out.println("CLICK: x:"+e.getX()+" y:"+e.getY());
				
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
}
