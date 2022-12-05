package tp2;

import javax.swing.*;
import java.awt.*;

public class Work{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(300, 400);

        JPanel panel = new JPanel() {
            private static final long serialVersionUID = 1L;

			@Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int y = 0; y < 100; y = y+10) {
                	for (int x = 0; x < 300; x=x+10) {
                		Runnable r = new Boule(x, y, g);
                		new Thread(r).start();
                	}
                	}
            }
        };
        frame.add(panel);

        // Graphics g = panel.getGraphics();
        // g.setColor(Color.BLUE);
        // g.fillRect(0, 0, 100, 100);

        frame.validate(); // because you added panel after setVisible was called
        frame.repaint(); // because you added panel after setVisible was called
    }
}