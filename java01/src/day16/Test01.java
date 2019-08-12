package day16;

public class Test01 { //예외처리

	public static void main(String[] args) {
		System.out.println("    main start    ");

		int a = 10, b = 0; 
	/*	
		try {
			System.out.println(1);
			System.out.println(a/b); 	//이 문장에서 에러를 야기, ArithmeticException 예외 발생
			System.out.println(2);
		} catch (ArithmeticException e){
			System.out.println("예외 발생 : "+e.getMessage());
			e.printStackTrace(); // e.getMessage보다 어디서 뭐가 틀렸는지 자세히 설명
			System.out.println(3);
			//catch block은 예외가 발생했을 경우에 항상 수행, finally은 줴다
		} finally {
			System.out.println("finally{  항 상 수 행   }");
		}
*/		
		
		System.out.println("- - - - - - - - - - - - - -");
		
		if(b != 0) System.out.println(a/b);
		
		System.out.println("    main end    ");

	}

}
