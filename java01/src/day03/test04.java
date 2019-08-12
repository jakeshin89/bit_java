package day03;

public class test04 {
	public static void main(String[] args) {

	  //for (초기값 ;몇 번 돌릴건지 조건식 ;증감식)
		for (int i = 1; i<20; i++) { //for 루프 안에서 i 진행, 빠져나오려면 나와서 		
		System.out.println("Hello Java "+i);
		// 헐 코드중복 극혐. 원하는 갯수 만큼 반복.
		}
		int i;
		for (i = 1; i<10; i++) {
			System.out.println("Hello Java"+i);
			
		}
		System.out.println(i);
		
		int j = 10;
		while(j>0) {
			System.out.println("while "+j);
			j--;
		}
		boolean flag = true;
		while (flag) {
			j++;
			System.out.println("~~~"+j);
			if(j==i) flag = !flag;
			
		System.out.println("j : "+j);
		
		while(j<5) {
			 System.out.println("do while:"); //조건에 맞지 않이잠 한 한 번 써주x
			 //while문은 조건 압고 바로 없애버림	 
		}
		System.out.println("do while:"); //조건에 맞지 않이잠 한 한 번 써주x
		do {
			System.out.println("do while");
			
		} while(j<5);
	}
	
}
	

}
