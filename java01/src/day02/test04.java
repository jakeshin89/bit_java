package day02;

public class test04 {

	public static void main(String[] args) {
	
		System.out.println("byte type max value => "+Byte.MAX_VALUE);
		System.out.println("int type max value => "+Integer.MAX_VALUE);
		System.out.println("long type max value => "+Long.MAX_VALUE);
		// 이미 기본형 class가 있다는 것. 기본형을 객채화 하기 위해 class 첫글자를 capital!
		// Byte .주소 기본 api 존재
		
		System.out.println(Math.PI); // PI는 바뀌면 안돼니 불변상수. ALL CAPITAL!
		//final 변수는 https://froginpot.tistory.com/13
		
		char c = 's';
		System.out.println(c + "숫자니? "+Character.isDigit(c));
		//
		
		String ss = "1"+"1"; // string class 찾아보기..
		System.out.println(ss);
		
		int s1 = Integer.parseInt("1")+Integer.parseInt("1");
		// parseInt() 문자열을 수로 바꿔주는 함수
		// integer.parseint 호출해서 "1"을 넘겨줘서 return! -> 1
		System.out.println(s1);
		
		double s2 = Double.parseDouble("1.6")+Double.parseDouble("1.7");
		System.out.println(s2);
	}

}
