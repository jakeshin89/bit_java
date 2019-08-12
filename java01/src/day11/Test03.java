package day11;

public class Test03 {	//상속 심화과정(?) Object 그는 과연..?

	public static void main(String[] args) {
		
		Person p = new Person("박영희", 20); //new에 띄운 메모리를 저장하기 위해 주소지정(p)
		Person s = new Student("김철수", 20, 2019001);
		//같은 타입이지만 가리키는 주소가 다름(p, s)
		//p는 다운캐스팅 불가능, s는 가능
		
		Employee e = new Employee("안소희", 25, "행정과");
		Object o = new Teacher("이명박", 60, "Java");
		Object msg = new String("Hello World");
		
	}

}
