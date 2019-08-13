package Xercise;

import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextAreaEx {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("TextArea Test");
		JPanel p = new JPanel();
		
		TextArea ta1 = new TextArea("Default", 5, 30);
		TextArea ta2 = new TextArea("Vertical Scroll", 10, 25, TextArea.SCROLLBARS_VERTICAL_ONLY);

		ta1.selectAll();
		ta2.selectAll();
		
		p.add(ta1);
		p.add(ta2);
		
		f.add(p);
		
		f.setSize(300, 300);
		f.setVisible(true);
		
	}

}
