package day11;

public class Test02 {	//test01 배열러 솎아보기
	public static void main(String[] args) {
	
		Person[] p = {new Student("홍길동", 20, 2012001),
								new Student("최순실", 30, 2015784),
								new Teacher("이순신", 30, "JAVA"),
								new Employee("유관순", 40, "교무과"),
								// Object로 바꾸면 스트링형태도 가능. Object 클래스는 무조건 다운캐스팅 준비해야 해. 최상단이니까 
		};
	 
		for (Person data :p) { //부모영역에서 접근함
			data.printA(); //부모Person() 영역의 자원을 접근할 땐 바로 접근 가능
			System.out.println();
		}
		System.out.println("==================");
/*		
		for (Person data : p) {
			//자식 영역의 자원을 접근할 땐, 다운캐스팅 필요
			//반드시 하단부에 어떤 객체가 바인딩 되어있는지 타입체크 필요
			if(data instanceof Student)((Student)data).printS();
			//if(data instanceof Teacher)((Teacher)data).printT();
			//if(data instanceof Employee)((Employee)data).printE();
		}
*/	 
	}
	
	
}
