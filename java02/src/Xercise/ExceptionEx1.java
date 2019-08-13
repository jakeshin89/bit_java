package Xercise;

public class ExceptionEx1 {
	public static void main(String[] args) {
	
		int[] var = {10, 200, 30};
		for (int i=0 ; i<=var.length ; i++) {
			
			try {
				System.out.println((i+1)+"번째");
				System.out.println("var["+i+"] : "+var[i]);			//예외(에러)가 발생 가능한 문장들
				System.out.println("~~~~\n");
			} catch (ArrayIndexOutOfBoundsException e) {		//예상되는 예외객체 변수명(예외문)
				System.out.println("배열을 넘었습니다.");					//상기 예외가 발생했을 때 수행할 문장
			}
			
		}

		System.out.println("프로그램 끝!");

	}
		
}

// 예외처리 안했으면 그냥 끝나버릴 프로그램이, 예외처리를 해줌으로 진행되종료되지 않았다.
// 반복문 수행 중 예외가 발생하면 수행 못하니 바로 catch로 넘어간다.