package day04;								//배열 : 같은 data type으로 방 여러개 만들어야 하는데.. 이를 핸들링하는 방법

import java.util.Arrays;

public class test04 {
		public static void main(String[] args) {
			// Array [] ← 이걸 적은 순간 레퍼런스.. 참조형이 된다. int[] scores, int scores[] 순서 상관 ㄴㄴ
	
				int[] scores;						// 배열 선언
				scores = new int[5];		// 배열 갯수 생성, new 영역이기 때문에 아무것도 안적으면 초기설정값으로 출력함
				
					for (int i=0; i<5 ; i++) {		
						System.out.print(scores[i]+"     ");			
					}		

					System.out.println();
					
				String[] names = new String[5];
			
					for (int i = 0; i < 5; i++) {
						System.out.print(names[i]+"  ");		
					}	
			
		System.out.println("\n============================");
		
		scores[0] = 99;
		scores[1] = 100;
		scores[2] = 69;
		scores[3] = 79;
		scores[4] = 89;
		
		names[0] = "홍길동";
		names[1] = "이길동";
		names[2] = "한길동";
		names[3] = "방길동";		
		names[4] = "고길동";
		
		double avg = 0.0;	// local 변수 초기화 설정 반드시
		double sum = 0;

		for (int i = 0; i <scores.length; i++) {
			sum += scores[i];			
		}

		avg = sum/scores.length;
		
		System.out.println(Arrays.toString(scores));					// array는 배열을 관리하는 class. 배열에 어떤 값이 있는지 알고싶. 배열주소 알려주면 다 꺼내주기
		System.out.println(Arrays.toString(names));


		// 홍** 99 평균이상
		
		for (int i=0 ; i<names.length ; i++) {
			System.out.println(names[i].charAt(0)+"**  "+scores[i]+
				(scores[i] >= avg ? "  평균이상" : "  평균미달")	);
		}
		
	}

}
