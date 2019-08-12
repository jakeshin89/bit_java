package day15;

public class Test02 {

	public static void main(String[] args) {
		A a = new A();
		a.p();
		System.out.println();
		
		A.B b = new A().new B();
		//이너클래스 소환 공식		
		b.print();
		//이너클래스 내부에 있는 메소드 소환
		
		//A.C c = new A.C(); //A 안에 Static한 inner class C가 있는데, 
		//c.print();
		
		A.C.print();
		//얘는 static 자원이니 new 안띄워도(객체생성 없이) 접근 가능
		//inner 클래스만이 static 가능
		
	}
}

class A{	//method 앞에 static, class 앞에는 static 못붙임
	String name = "A"; //기본디폴트
	
	public A() { }
	public A(String name) {
		this.name = name;
	}

	void p() {
		System.out.println("A에서 호출");
		new B().print();
	}

	class B{
		String name = "B";
		void print() {
			System.out.println(this.name); //여기 name은 위에 자원 그대로 가져다 씀
			System.out.println(A.this.name); //여기 name은 위에 자원 그대로 가져다 씀
		}
	}
	
	static class C{ //애는 class의 멤버여서 static이 허용 가능함
		static void print() { //인스턴스 메소드래;; 뭐지
			System.out.println("~~");
		}		
	}
	
	class D{
		void p() {
			class E{
				
			}
		}
	}
	
	
}
	
/*
class B extends A{
	void print() {
		System.out.println("B"+name); 상속 안하꼬야!
	}
*/
/*
class B{
	A a; //has a
	void print() {
		System.out.println("B");
	}
*/
