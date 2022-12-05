package tp2;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Boule extends JPanel implements Runnable{
	
	int x, y;
	Graphics g;
	
	public Boule(int x,int y,Graphics g) {
		this.x = x;
		this.y = y;
		this.g = g;
	}
	
	public synchronized void run() {
		//super.paintComponent(g);
		this.g.fillOval(this.x, this.y, 10, 10);
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
