package day02.ex;

public class OperTest1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(++a); //11 ; 앞쪽에 ++ 붙으면 바로 1 추가

		System.out.println(++a + b++); // a=12, b=20 (이후 b=21)
	
		System.out.println((++a%3) + (a*++b)); // 13/3후 나머지 1+ 13*22
	}

}
