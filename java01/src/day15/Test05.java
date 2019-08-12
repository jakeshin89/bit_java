package day15;

import javax.swing.JOptionPane;

public class Test05 { //anonymous 클래스 디자인
	public static void main(String[] args) {

		String msg = JOptionPane.showInputDialog("1.List 2.Update 3.Delete 4.Insert q.Quit");
		
		//우항에서 클래스 만들고 선언
		Command list = new  Command() {
			@Override
			public void exec() {
				System.out.println(" *** List *** ");				
			}			
		};		
		//커맨드 클래스 implements한 이름 없는 클래스를 정의한다
		//그러면 커맨드 클래스가 가진 메소드 오버라이딩 해야 하니 
		//어떤 주소가 들어갈건데, 그건 커맨드를 implemets(생략됨)한 이름 없는 클래스.
		//클래스니 () 이게 있고, 클래스 내용은 {}
		//bin 가보니 이름 없이 숫자만 꺼어꺼꺼억
		
		list.exec();
		
		Command update = new Command() {
			@Override
			public void exec() {
				System.out.println(" *** Update *** ");
			}		
		};
		
		//update.exec();
		
		Command delete = new Command() {
			@Override
			public void exec() {
				System.out.println(" *** Delete *** ");				
			}			
		};
		
		//delete.exec();
		
		Command insert = new Command() {
			@Override
			public void exec() {
				System.out.println(" *** Insert *** ");
			}			
		};
		
		//insert.exec();
		
		switch (msg) {
		case "1":
			list.exec();
			break;
		case "2":
			update.exec();
			break;
		case "3":
			delete.exec();
			break;
		case "4":
			insert.exec();
			break;
		default: 
			break;
		}
		
	}

}
