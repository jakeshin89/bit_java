package day21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test04 {
	public static void main(String[] args) {
		
		new UI_4();
	}
}

class UI_4 extends JFrame implements ActionListener{
	
	JButton red, blue, exit;
	Panel p1;
	
	public UI_4() {
		
		super("AWT UI Test");
		p1 = new Panel();
		p1.add(red = new JButton("Red"));
		p1.add(blue = new JButton("Blue"));
		p1.add(exit = new JButton("종료"));
		add(p1, BorderLayout.SOUTH);
	
		setSize(300, 300);
		setVisible(true);
		
		red.addActionListener(this);
		blue.addActionListener(this);
		exit.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//윈도우창 버튼 설정
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