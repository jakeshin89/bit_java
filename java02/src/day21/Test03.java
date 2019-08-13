package day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test03 {
	public static void main(String[] args) {
		
		new UI_3();
	}
}

class UI_3 extends Frame implements ActionListener{
//ActionListener를 implements함
	
	Button red, blue, exit;
	Panel p1;
	
	
	public UI_3() {
		
		//f1 = new Frame("awt UI Test");
		super("AWT UI Test");
		p1 = new Panel();
		p1.add(red = new Button("Red"));
		p1.add(blue = new Button("Blue"));
		p1.add(exit = new Button("종료"));

		add(p1, BorderLayout.SOUTH);
		setSize(300, 300);
		setVisible(true);
		
		red.addActionListener(this);
		blue.addActionListener(this);
		exit.addActionListener(this);
		//객체 끌어왔으니 굳이 override 안해도 됨
		
		//얘만 다르니 따로 입력
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false); 
				dispose(); 
				System.exit(0);
			}	
		});	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()){
		case "Red":
			p1.setBackground(Color.red);
			break;
		case "Blue":
			p1.setBackground(Color.BLUE);
			break;
		case "종료":
			System.exit(0);
		default:
			break;
		}
	}			
}