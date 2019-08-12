package day03; // 다시 한 번 해보기. 입력, if, else, return

import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
		
		int score;
		
		Scanner input = new Scanner(System.in); //out은 콘솔창, in은 입력받기
		System.out.println("점수를 입력하세요.");
		
		score = Integer.parseInt(input.nextLine()); //nextline이란?
		// int = string, 스트링 바꾸는 마법 
		
		input.close();
		input = null; // 닫아버리기
		
		if(!(score>=0 && score<=100)) {
			System.out.println("유효하지 않은 점수입니다.");
		return; //점수 범위 유효성 검사, 유효하지 않다면 잘가~
		}
		
		System.out.println("점수 : "+score);
		
		if(score>=80) {
			System.out.println("Pass");
		} else {
			System.out.println("No Pass");
		}
		
		String result = score>=80 ? "Pass" : "No Pass";
		System.out.println("당신의 점수는 "+score+"점이므로 "+result+"입니다.");
		return;
	}
}
// 도스에서 실행하기