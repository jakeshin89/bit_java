package day02;

public class test06 { //비교연산자
	
	public static void main(String[] args) {
		
		int num = 100;	
		System.out.println(++num); // ++ 앞뒤로 값이 달라짐
		System.out.println(num);
		System.out.println(6%4);
		
		int x = 100 , y = 100;
		System.out.println(x!=y);
		
		int score = 99;
		boolean result = 0<=score && score<=100; //2개짜리로
		System.out.println("score 유효성 검증 결과 : "+result);
		
		System.out.println(3&4);
		//비트연산함
		
		//shift 연산자
		System.out.println(4<<2); // 0000100 -> 0010000
		// 2진수로 표현한 걸 오른쪽 0 2개 
		System.out.println(16>>2); // 0010000 -> 000100
		
	}

}
