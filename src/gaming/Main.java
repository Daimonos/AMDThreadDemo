package gaming;

import javax.swing.SwingUtilities;

import gaming.app.App;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runProgram();
			}
		});
	}
	
	private static void runProgram() {
		App app = new App();
		app.go();
	}

}
