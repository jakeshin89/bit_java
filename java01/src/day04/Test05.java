package day04;

import java.util.Arrays;

public class Test05 {

	public static void main(String[] args) {
		// 배열 선언, 생성, 초기화 한번에!
		int[] scores = {100, 19, 78, 66, 51, 78, 94};		//length는 갯수 얘기하네..
		String[] names = {"루피", "조로", "상디","나미","우솝","로빈","프랑키"};
		
			System.out.println(Arrays.toString(scores));
			System.out.println(Arrays.toString(names));
			System.out.println();
		
		if(names.length>7) System.out.println(names[7]); 			//  죽어버릴 수 있으니 판단 써주기, 이건 잘 모르겠다 아직...
		
		for(String data: names) {		//names에 있는 data 하나씩 꺼내본다.
			System.out.print("**"+data.charAt(data.length()-1)+"    "); 		// 다 꺼내 볼건데, 각 데이터.(그 속 데이터 글짜수-1)번째 글짜수 이건 다시 물어보기
		}
		
		System.out.println();

		double sum = 0;
		for(int data:scores) {
			sum += data;
		}
		System.out.printf("평균 = %.2f %n", sum/scores.length);
		
	}

}

// 변수.length로 array 갯수 확인 가능
// :names names배열에서 데이터 하나 꺼내줘. 마지막글자 뽑아줘