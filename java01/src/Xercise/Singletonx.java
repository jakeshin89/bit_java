package Xercise;

public class Singletonx {

	public static void main(String[] args) {
/*
		//싱글톤패턴을 적용하지 않은 경우
		Singleton singleton1 = new Singleton();
		Singleton singleton2 = new Singleton();

		System.out.println(singleton1);
		System.out.println(singleton2);
		//객체 아이디 비교, 새롭게 생긴 각자 다른 객체
*/
		Singleton singleton1 = Singleton;
		
		System.out.println(singleton1);
		System.out.println(singleton2);
		
	}
}

public class Singleton{
	
}

