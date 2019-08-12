package day03;

import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("****** 명령 선택 ******");
		System.out.println("1. Insert (등록)");
		System.out.println("2. Delete (삭제)");
		System.out.println("3. Update (수정)");	
		System.out.println("4. Quit (종료)");	
		System.out.println("***********************\n");
		
		System.out.println("수행할 명령을 선택하세요!");
		System.out.println("1 2 3 4 중 하나를 선택하세요..");
		
		int num = scan.nextInt();

		String res = "";
		
		switch (num) {
		case 1: 
			res = "등록"; break;
		case 2: 
			res = "삭제"; break;
		case 3: 
			res = "수정"; break;
		case 4: 
			res = "종료"; break;
		default:
			res = "";
		}
	 System.out.println(res+" 작업을 수행 합니다.");
	}

}
