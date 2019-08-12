package day15;

import javax.swing.JOptionPane; //람다식

public class Test06 { //anonymous 클래스 디자인
	public static void main(String[] args) {

		String msg = JOptionPane.showInputDialog("1.List 2.Update 3.Delete 4.Insert q.Quit");
	
		Command list = () -> System.out.println(" *** List *** ");	
		
		Command update = () -> System.out.println(" *** Update *** ");
		Command delete = () ->System.out.println(" *** Delete *** ");	
		Command insert = () -> System.out.println(" *** Insert *** ");
		
		//람다식 : 변수에 함수를 등록하여 사용하는 기능
		//왼쪽이 커맨드이기 때문에 우항 커맨드일거라 생각하고 지우기.... (같은거 다 지우기)
		//람다식 하면 코드 읽기 어려움
		
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
