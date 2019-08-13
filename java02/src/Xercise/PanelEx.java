package Xercise;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelEx {

	public PanelEx() {
		
		JFrame f = new JFrame("Panel Test");
		JPanel p = new JPanel();
	
		p.setBackground(Color.red);
		f.add(p);
		
		f.setSize(200, 200);
		f.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		new PanelEx();

	}

}
