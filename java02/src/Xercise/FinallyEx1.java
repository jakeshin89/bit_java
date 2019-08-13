package Xercise;

public class FinallyEx1 {
	public static void main(String[] args) {
	
		int[] var = {10, 200, 30};
		for (int i=0 ; i<=var.length ; i++) {

			try {
				System.out.println((i+1)+"번째");
				System.out.println("var["+i+"] : "+var[i]);
				System.out.println("~~~~");
			} catch (ArrayIndexOutOfBoundsException e) {	
				System.out.println("배열을 넘었습니다.");
				return;	//return이 있어도 꼭 finally를 수행한다.
			}finally {
				System.out.println(" : : : : Finally : : : : \n");
			}

		}

		System.out.println("프로그램 끝!");

	}
		
}

// 예외처리 안했으면 그냥 끝나버릴 프로그램이, 예외처리를 해줌으로 진행되종료되지 않았다.
// 반복문 수행 중 예외가 발생하면 수행 못하니 바로 catch로 넘어간다.