package day16;

import java.io.IOException;

public class Test04 {
	public static void main(String[] args) {
		
		System.out.println("Main Start");

		int jumsu = 90;	//이 변수는 block 안에 들어가서 쓰게 되면, 그 block 안에서만 작동하게 됨 얘를 전체 사용하고 싶다면 밖에서 써야 함. scope인식!
		//뭔 말이냐, 이거를 try scope 안에서 쓰면, 그 밑에 catch 뭐 이런데서 쓸 수 없단 말임
		
				//throw new RuntimeException(" An error occured "); 		//통과		Checked Exception
				//throw new IOException(" An error occured "); 					//미통과	Unchecked Exception => 반드시 try&catch 해줘야 함
				//예외객체가 생겨서 던졌는데, 아무도 받아주지 않아서 비정상종료함
				// IOException은 
				
				try {
					if(!(jumsu >= 0 && jumsu <=100))
						throw new IOException("jumsu가 유효하지 않습니다.");
				} catch (IOException e) {
					System.out.println(e.getMessage());		// 에러메세지 등록
				}	
				
				System.out.println("Main End");
		

	}

}
