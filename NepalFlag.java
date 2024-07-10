package graphics;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NepalFlag extends Frame{
	NepalFlag(){
		setSize(500,500);
		setVisible(true);
	}
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawLine(50, 500, 50, 100);//straight line
		g.drawLine(50, 100, 280,260);//top slanted
		g.drawLine(120, 260, 280, 260);//ani first join gareko adhi line
		g.drawLine(120, 260, 300,400);//arko slanted line
		g.drawLine(50, 400, 300, 400);//last straight line
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
	}
	
		public static void main(String[] args) {
			new  NepalFlag();
		}
	}


