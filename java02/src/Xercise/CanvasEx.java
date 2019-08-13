package Xercise;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class CanvasEx {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Canvas Test");
		MyCanvas c = new MyCanvas();
		
		c.setBackground(Color.yellow);
		
		f.add(c);
		
		f.setLocation(200, 200);
		f.setSize(200, 200);
		f.setVisible(true);
		
	}

}

class MyCanvas extends Canvas{
	
	 public void paint(Graphics g) {
	        g.setColor(Color.red);
	        g.drawRect(20, 20, 100, 100);
	    }
	
}
