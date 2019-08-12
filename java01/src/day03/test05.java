package day03; // for

public class test05 {
	public static void main(String[] args) {

		// 1 ~ 100 합 구하기 1+2+3+4+5+...+100
		
		int sum = 0;
		int sum4 = 0;

		for (int i = 1; i <= 100; i++) {			
			sum += i; // sum = sum+i
			if (i%4==0) {
			sum4 += i;
			}
		}
		
		System.out.println("정수 1~100까지의 합계 : "+sum);
		System.out.println("100까지의 4의 배수들 합계 : "+sum4);
		
	}

}
