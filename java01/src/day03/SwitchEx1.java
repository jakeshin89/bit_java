package day03;

import java.util.Scanner;

public class SwitchEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 월을 숫자(1~12)로 입력하세요.");
		
		int month = scan.nextInt(); //nextint()로 숫자 입력 받으려고 함,
		//int를 string으로 바꿀 수 있어. 여기를 어떻게 처리하냐..? 뒤 nextint를 nextLine하고, 입력값이 '글자'니 입력값 좌우를 ""로 처리
		String res;

		switch(month) { //엄청 많은 int가 들어갈 수 있으니... case를 두겠다.	
			case 1:
				// res = "31"; 
				// break; break까지 하고 빠져나오기 
				// 이건 1월은 31일까지 있어! 라고 하는거야.
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
					res = "31"; break; //브레이크 없다면 원하는 값 찾아 내려가다가 최종값 뽑아냄
			case 4:
			case 6:
			case 9:
			case 11:
					res = "30"; break;
			case 2:
					res = "28"; break;
			default :
				res = "몰라";
		}
	System.out.println(month+"월은 "+res+"일까지 입니다.");
	}

}
