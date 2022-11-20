package tp1;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Show extends JLabel implements Runnable{
	
	int s=0, m=0; String min="", sec="";

	JLabel label = new JLabel("blan");

	public Show() { //stuff to do once
		JFrame frame = new JFrame();		
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(label);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Horloge Graphique");
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e){
			return;
			}
			s++; if(s==60) { s=0; m++;}
			if(m==60) { m=0;}
			sec =(s<10 ? "0":"") + String.valueOf(s);
			min =(m<10 ? "0":"") + String.valueOf(m);
			label.setText(min +":"+sec);
		}
	}
}
