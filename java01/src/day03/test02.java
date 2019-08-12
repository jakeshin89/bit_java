package day03;

import java.util.Scanner;

public class test02 { //입력값이 양수, 0, 음수인지 삼항연산자로 처리

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		
		//System.out.println(num>0 ? "양수" :(num==0 ? "0" : "음수"));
		//비교해야 하니 ==. 얘는 조건연산자(논리)이기 때문.

		String result = num>0? "양수" : (num==0 ? "0" : "음수");
		System.out.println("입력하신 숫자 "+num+"은 "+result+"입니다.");
		
	}

}
