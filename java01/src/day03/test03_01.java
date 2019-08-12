package day03;

import java.util.Scanner; // 왜 여기에다 부르지 ㅇㅅㅇ 저절로 불려지네

public class test03_01 {
	
	public static void main(String[] args) {

		int jumsu ;
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		jumsu = Integer.parseInt(input.nextLine());
	
		input.close();
		input = null;
		
		String result = jumsu >= 80 ? "Pass" : "No Pass"; //변수 넣을꺼면 string 이용
		System.out.println("점수는 "+jumsu+"점 "+"이므로 "+result+"입니다.");
		
		// A, B, C, D, E, F 등급처리
		
		/*
		if (jumsu>=90) {
			System.out.println("등급"+" : "+"A");
		} else if(jumsu>=80) {
			System.out.println("등급"+" : "+"B");
		} else if(jumsu>=70) {
			System.out.println("등급"+" : "+"C");
		} else if(jumsu>=60) {
			System.out.println("등급"+" : "+"D");
		} else if(jumsu>=50) {
			System.out.println("등급"+" : "+"E");
		} else {
			System.out.println("등급"+" : "+"F");
		} 
		*/ //너무 반복적이야
		
		String grade = "F";
			if(jumsu >= 90) {
				grade = "A";		//여기서 걸러지면 바로 밑 sysout으로 이 공간 {}를 블락이라 함.이 블락에서 선언된 명령은 여기서만 쓰임. scope가 결정됨. 문장 1개라면 블락 제거				
			} else if(jumsu >= 80) {
				grade = "B";
			} else if(jumsu >= 70) {
				grade = "C";
			} else if(jumsu >= 60) {
				grade = "D";
			}
			System.out.printf("점수 : %s → %s %n%s등급 %n%n", jumsu, result, grade);
		
			//삼항연산자 처리 (과제)
			
			//등급처리를 switch구문으로
			
			char c;
			//char c = ' '; 둘 다 됨
					
			switch (jumsu/10) {
			case 10 :
			case 9 :
				c = 'A'; break;
			case 8 :
				c = 'B'; break;
			case 7 :
				c = 'C'; break;
			case 6 :
				c = 'D'; break;
			case 5 :
				c = 'E'; break;
			default:
				c = 'F';
			}
			
			System.out.println("당신의 등급은 "+"'"+c+"'"+"입니다.");
			
	return;
	
	}

}
