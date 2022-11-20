package tp1;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HG extends JLabel{
	
	private int s=0;

	public void GUI() {
//		this.setHorizontalAlignment(JLabel.CENTER);
//		Font font = this.getFont();
//		this.setFont(new Font(font.getName(),font.getStyle(),30));
//		Runnable afficheur = new Afficheur();
//		Thread thread_ = new Thread(afficheur);
//		thread_.start();
		
		
		Runnable aff = new Show();
		Thread thread = new Thread(aff);
		this.setHorizontalAlignment(JLabel.CENTER);
		Font font = this.getFont();
		this.setFont(new Font(font.getName(),font.getStyle(),30));
		thread.start();
		

	}
	
	public static void main(String[] args) {
//		JFrame frame = new JFrame("Horloge Graphique");
//		frame.setSize(200, 200);
//		HG HH = new HG();
//		
//		frame.setContentPanel(HH);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setVisible(true);
		HG H = new HG();
		
		H.GUI();
		
	}

}