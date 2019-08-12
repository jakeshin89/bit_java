package day15;

public class Test07 { //모든 타입 다  anonymous 가능하다

	public static void main(String[] args) {

		AAA a = new AAA() { //anonymous, extends가 생략			
			@Override
			void exec() {	}
		};
		
		//미완성의 객체이기 때문에 객체 생성해야 해 얜 인터페이스니 implements, 위는 클래스니 extends
		III i = new III() {		
			@Override
			public void exec() {	}
		};

		CCC c = new CCC() {
			void exec() {}; //일반 클래스이고, 오버라이딩을 강제로 하지 않아도 돼. 추상, 인터페이스는 강제로 해야 미완성의 메소드를 완성으로
		};
		//anonymous는 디운캐스ㅇ팅 불가
		
	}

}



abstract class AAA{
	abstract void exec();
}

interface III{
	void exec();
}

class CCC{
	void exec() {}
}