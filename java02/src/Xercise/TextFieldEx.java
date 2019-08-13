package Xercise;

import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldEx {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("텍스트필드 테스트");
		JPanel p = new JPanel();
		
		JTextField tf1 = new JTextField("아이디 입력", 12);
		JPasswordField tf2 = new JPasswordField("암호 입력", 10);
		
		tf1.selectAll();
		tf2.selectAll();
		//selectAll은 해당 탭 첫 실행시 전체선택을 하게 해준다. 무엇을 입력해야 할지 문자열을 미리 위에서 넣어두었기 때문에, 이를 편하게 하려면..
				
		tf2.setEchoChar('*');
		
		p.add(tf1);
		p.add(tf2);
		
		
		f.add(p);
		f.setSize(300, 100);
		f.setVisible(true);
	}

}
