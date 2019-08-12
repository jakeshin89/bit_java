package Xercise;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		
		
		int year = 2100;
		
		//(year % 400 == 0 || (year % 4 == 0 && (year%100)!=0))
		
		String s = " 홍길동 _ 이순신_김유신 / 박철".replace("_","/");
		String[] n = s.split("/");
		
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i].trim().charAt(0)); //n번째 글짜 트림하고 그 글짜 중 0번째글짜 나오기
			for (int j = 0; j <n[i].trim().length()-1; j++) { //나왔다면 n번째 글짜 트림하고, 그 글짜 길이-1만큼 * 채워줘야함
				System.out.print("*");
			}
		}
	}

}
