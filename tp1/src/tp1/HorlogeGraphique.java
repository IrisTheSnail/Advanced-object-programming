package tp1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HorlogeGraphique extends JLabel implements Runnable{
	// A compléter
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Horloge Graphique");
		frame.setSize(200, 200);
		frame.setContentPane(new HorlogeGraphique());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}