package day02;

import java.util.Scanner;

public class test05 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("학생 이름을 입력하세요:");
		String name = input.nextLine();
		
		System.out.println("학생 점수를 입력하세요:ex)90");
		int score = input.nextInt();
		
		System.out.printf("이름 : %s, 점수 : %d %n",name,score);
		
		input.close();
		input = null;
		// 왜쓰는거지... 참조형 null 하면 .연산자 불가능
	}
}
