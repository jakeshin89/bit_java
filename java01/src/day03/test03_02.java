package day03;

import java.util.Scanner;

public class test03_02 {

	public static void main(String[] args) {

		int jumsu;
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		jumsu = Integer.parseInt(input.nextLine());
				
		input.close();
		input = null;
		
		String res = jumsu > 80 ? "Pass" : "No Pass";
		System.out.println("점수는 "+jumsu+"점, 따라서 "+res+"입니다.");
		
		// A, B, C, D, E 등급처리 삼항연산자로
		
		String result = jumsu >= 90 ? "A" : (jumsu >= 80 ? "B" : (jumsu >= 70 ? "C" :(jumsu >= 60? "D" : (jumsu >=50? "E" : "F"))));
		System.out.println(jumsu+"은(는) "+result+"등급 입니다.");
	
	return;	
	}

}
