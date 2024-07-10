package graphics;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TrafficLight extends Frame {
	TrafficLight(){
		setSize(800,800);
		setVisible(true);
	}
	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(Color.BLACK);
		g.fillRect(100, 100, 150, 280);
		g.setColor(Color.RED);
		g.fillOval(135, 110, 80, 80);
		g.setColor(Color.YELLOW);
		g.fillOval(135, 200, 80, 80);
		g.setColor(Color.GREEN);
		g.fillOval(135, 290, 80, 80);
		g.setColor(Color.BLACK);
		g.fillRect(165, 380, 20,150 );
		
	
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		

}
	public static void main(String[] args) {
		new TrafficLight();
	}

}


