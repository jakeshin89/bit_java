package Xercise;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonEx {

	public static void main(String[] args) {

		JFrame f = new JFrame("Button Test");
		
		JPanel p = new JPanel();
		
		JButton b1 = new JButton();
		JButton b2 = new JButton("출력");
		JButton b3 = new JButton("정렬");
		JButton b4 = new JButton("순위");

		b1.setLabel("입력");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		f.add(p);
		
		f.setLocation(200, 200);
		f.setSize(300, 100);
		f.setVisible(true);
		
	}

}
