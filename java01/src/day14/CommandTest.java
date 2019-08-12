package day14;

import javax.swing.JOptionPane;

public class CommandTest {

	public static void main(String[] args) {

		Command cmd = new ListCommand();

		String key = JOptionPane.showInputDialog("list/delete/insert/update");
		
		switch (key) {
		case "list":
			cmd = new ListCommand();
			break;
		case "delete":
			cmd = new DeleteCommand();
			break;
		case "update":
			cmd = new UpdateCommand();
			break;
		default:
			break;
		}
		
		cmd.exec(); //메소드는 하나인데 입력값에 따라 동작이 다르게 
		cmd.check(); //interface에는 디폴트함수 쓸 수 있음
		
	}

}
