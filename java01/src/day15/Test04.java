package day15;

public class Test04 {
	public static void main(String[] args) {
/*
		DeleteCommand cmd = new DeleteCommand();
		cmd.exec();
		// DeleteCommand 타입이기 때문에 DeleteCommand 내 메소드만 수행
*/
		Command cmd = new DeleteCommand();
		//우항에 어떤 객체가 바인딩 되어있냐에 따라 결과값이 달라짐
		cmd.exec();
		 
		cmd = new UpdateCommand();
		cmd.exec();
		
	}
}
