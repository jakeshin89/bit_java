package day07;

public class Calc {
	
			// class variable, 왜? 클래스 네임으로 접근하니까
			static int data = 0;										//이 데이터를 사용하고 싶다면, 이 변수를 static으로 지정해 주면 됨
	
			// static method를 class method
			public long add (int a, int b) {					//void 쓰면 에러			//instance method. 꼭 new에 올려야 사용 가능한 
				System.out.println(Calc.data);				//data 접근하고 싶다고? 그냥 data 하면 안돼. 왜? static은 다른 메모리에 있으니까. static 빼면 접근 가능.
				//System.out.println(Math.random());							
				return a+b;												//a와 b의 값을 가지고 가야 하니까 return
			}																	//static은 공유개념? 	static 자원은 앞에 클래스명이 생략.
																				//heap 영역에 있지만 주소를 가져왔으니 static 지워도 문제없이 작동 되네
			public static long sub (int a, int b) {			// static method
				return a-b;				
			}
			
			public static long multi (int a, int b) {
				return a*b;				
			}
	
			public static double divide (int a, int b) {
				if(b==0) return 0;
				return a/b;				
			}
	
}// 객체생성 할 필요 없이 static 하면 import만 하면 돼