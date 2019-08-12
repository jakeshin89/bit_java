package day16;

public class Test05 {

	public static void main(String[] args) { //throws InterruptedException 메인에서 이 익셉션이 발생할 수 있어 
		System.out.println("Main Start");

		for (int i=0 ; i<10 ; i++) {
			System.out.println("Hello!"+i);
			
			try {
				Thread.sleep(1000);			// 메인에 걸어도 됨
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //위에 throws 걸어버리면 try&catch 안해도 됌. 테스트시 메인에 걸지만, 보통은 걸지 않음
			
		}
		
		System.out.println("Main End");

	}

}
