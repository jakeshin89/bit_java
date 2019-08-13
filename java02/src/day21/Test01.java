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

public class Test01 {
	public static void main(String[] args) {
		
		new UI_1();

	}
}

class UI_1 {
	
	Frame f1; //멤버변수
	Button red, blue, exit;
	Panel p1;
	
	public UI_1() {
		f1 = new Frame("awt UI Test");
		p1 = new Panel();
		
		p1.add(red = new Button("Red"));
		p1.add(blue = new Button("Blue"));
		p1.add(exit = new Button("Exit"));
		//f1.add(p1);
			
		f1.add(p1, BorderLayout.SOUTH);
		f1.setSize(300, 300);
		f1.setVisible(true);
		
		red.addActionListener(new ActionListener(){//이벤트 종류에 따라 감시자가 달라짐, actionlistener는 딱히 listener가 필요없음	
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
				f1.setVisible(false); //이거 2개를 왜 꼭 써줘야 하지
				f1.dispose(); 
				System.exit(0);
			}
				
		});
		
		//f1.addWindowListener(new WindowEventP());
		//f1반응해야 할 인은 ()에 있어
		//왜 여긴 adapter라고 하지?
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f1.setVisible(false); //일단 안보이게 바꿔버려
				f1.dispose(); // ui 파괴시키는 작업
				System.exit(0);
			}	//이너클래스 -> anonymous
		});	
	}

}

class WindowEventP extends WindowAdapter{
	
	@Override //창 종료버튼
	public void windowClosing(WindowEvent e) {
		//f1.setVisible(false); //일단 안보이게 바꿔버려
		//f1.dispose(); // ui 파괴시키는 작업
		System.exit(0);
	}	
}