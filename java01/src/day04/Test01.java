package day04;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		System.out.println("알파벳 아스키 코드값 확인");
		
		char a = 'a', b = 'A';

		for (int i = 0; i<26; i++) {			//몇 번 반복할건지 수행
			System.out.println(a + " : " + (int)a++ + ",  " + b + " : " + (int)b++);		
		}
		System.out.println("================");
		System.out.println();
		
		/* 변수 che에 저장된 문자가 대문자인 경우에만
		       소문자로 변경하는 코드를 완성합니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		String msg = scan.nextLine();

		for (int i = 0; i<msg.length() ; i++) {			// 몇 번 반복할까
		char che = msg.charAt(i);
		char s = (che>='A' && che<='Z') ? (char)(che+32) : che; 

		//che프로모션으로 정수+정수, 하지만 결국 char타입이라 맞춰줌
		//System.out.println(che +" => "+s);

		System.out.println(s);
		
		// 숫자인지 대문자인지 소문자인지
		// 소문자 => 대문자
		// 대문자 => 소문자		
		}	
	}
}