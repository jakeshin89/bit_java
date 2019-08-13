package day21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test05 {
	public static void main(String[] args) {
		
		new UI_5().createUI();
		//사용자정의 method니 직접 호출해야 함
	}
}

class UI_5 extends JFrame implements ActionListener{
	
	JButton red, blue, exit;
	TextField msg;
	TextArea output;
	
	Panel p1, p2;
	
	void createUI() {
	//아깐 생성자함수, 지금은 사용자정의 메소드
		
		super.setTitle("AWT UI Test");
		p1 = new Panel();
			p1.add(red = new JButton("Red"));
			p1.add(blue = new JButton("Blue"));
			p1.add(exit = new JButton("종료"));
			add(p1, BorderLayout.SOUTH);

		p2 = new Panel();
		//p2.setLayout(new GridLayout(1, 2, 20, 20));
		p2.add(new JLabel("메세지창"));
		//p2.add(msg = new TextField("input message"));
		p2.add(msg = new TextField(20)); //너비지정
		add(p2, BorderLayout.NORTH);
		
		add(output = new TextArea(15, 40));
		output.setFont(new Font(null, 1, 20));
		
		
		setSize(300, 300);
		setVisible(true);
		
		red.addActionListener(this);
		blue.addActionListener(this);
		exit.addActionListener(this);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		msg.addActionListener(new ActionListener() {		//메세지 너의 역할은
			public void actionPerformed(ActionEvent e) {
				output.append(msg.getText()+"\n");			//아웃풋창에 메세지에서 적은걸 get하고 한 줄 내려
				msg.setText("");							//그리고 msg창에 아무것도 띄우지 마
			}//메세지 읽어와서 밑으로 내리기
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