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
import java.awt.event.WindowListener;

public class Test02 {
	public static void main(String[] args) {
		
		new UI_2();

	}

}

class UI_2 extends Frame { //내가 frame이다
	
	//Frame f1; 멤버변수
	Button red, blue, exit;
	Panel p1;
	
	
	public UI_2() {
		//f1 = new Frame("awt UI Test");
		super("AWT UI Test"); //Frame 기본생성자 제목
		p1 = new Panel();
			p1.add(red = new Button("Red"));
			p1.add(blue = new Button("Blue"));
			p1.add(exit = new Button("Exit"));
			
			add(p1, BorderLayout.SOUTH);
			setSize(300, 300);
			setVisible(true);
		
		red.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				p1.setBackground(Color.red);	
			}
		});
		
		blue.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				p1.setBackground(Color.blue);	
			}
		});
		
		exit.addActionListener(new ActionListener(){	
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
				dispose(); 
				System.exit(0);
			}
		});
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false); 
				dispose(); 
				System.exit(0);
			}	
		});	
		
	}

}