package util;			//오버로딩

public class MyUtil {
			// method 오버로딩
			public static long add(int a, int b) {		//public 해야 다른 패키지에서도 사용 가능
					return a+b;							
			}
			
			public static double add(double a, double b) {
				return a+b;	
			}
			
			public static double add(double a, double b, double c) {		//프로모션 발생하니까
				return a+b+c;	
			}
			//이름은 동일한데 자료형이 다르면 가능

			public static double add(double ... nums) {							//가변형으로 데이터가 얼마나 들어올지 모르니 ... 처리 이건 배열[]처리 nums는 배열
			//public static double add(double ...nums, double d)			//가변인자는 꼭 마지막에 와줘야 함. 몇 개 올지 모르는데 ㅇㅅㅇ

					double sum=0; //로컬베리어블은 초기화 시켜야 해. 근데 로컬 베리어블이 뭔데?
					
					for(double data:nums) {
						sum += data;
					}
				
				return sum;
			}

/*			public static double add(double[] a) {				//위에 double형 배열 있기 때문에 안됨. 위에랑 차이점은, 얘는 배열 넘겨줘. 근데 mymathtest에서는 배열이 아님. 꼭 배열로 호출해줘야함.
			double sum=0; //로컬베리어블은 초기화 시켜야 해
					
					for(double data:nums) {
						sum += data;
					}
				
				return sum;
*/			
					
			
/*
			public static double add(double d, double e, int i, double f) {
				// TODO Auto-generated method stub
				return null;
			}
*/			


public static String rightpad(String str, int size, char padChar) { //static으로 올릴 

	if (str.length() > size) {
		return str;				
	}

	int count = size-str.length();			//str.length 변하지 않도록 변수 생성
	for (int i = 0; i < count; i++) {				
		str = str + padChar;					//for루프 첫번째 돌고 두번째 루프에서 str length 사이즈가 4로 변함				
	}														//string에서 +연산 쓰는거 좋지 않음
			
	return str;
	
}

public static String leftpad(String str, int size, char padChar) {
		if (str.length() > size) {
			return str;				
		}

		int count = size-str.length();			//str.length 변하지 않도록 변수 생성
		for (int i = 0; i < count; i++) {				
			str = padChar + str;					//for루프 첫번째 돌고 두번째 루프에서 str length 사이즈가 4로 변함				
		}
				
		return str;
}

public static int max(int ... a) { 
	int max = Integer.MIN_VALUE;	//이거 왜 했지? 초기화. 어떤 값을 넣어도 이것보단 클테니.. 이거 한 이유는, 정수에는 -도 있는데 0을 넣으면 이를 무시할 수 있어서
	//max = a>=b? a : b ;	이렇게 했지만 2개만 비교하는게 아님. 많은 수가 들어가야 하기 때문에... 77줄 수정
	for(int data :  a) {	//a 배열 데이터 순서대로 돌리기
		if(max < data) 
			max = data;
	}	
	return max;

}



}

//method overloading 하나의 클래스 안에 여러개 동일함수 존재
//9째줄, 매개변수 다르면 변수값 다르게 설정해도 가능.
//정수든 실수든 add하면 다 처리해줬으면 좋겠엉
//파라미터 다양하게 올건데... (들어올 값, 예를 들어 1+2+3+4+5+6+...) 그러면 계속 오버로딩...
//오버로딩은 매개변수가 달라야 가능

