package day06;

public class Test03 {		//get set 활용해서 data 입력하기

	public static void main(String[] args) {

			Employee emp1 = new Employee(); 	//class 정의가 없어서 에러. 해당 패키지에 클래스 생성하니 에러 사라짐. emp1을 오브젝트라고 함
				emp1.display();
				System.out.println();
			
			Employee emp2 = new Employee();
				emp2.setAge(33);
				emp2.setName("홍길동");
				emp2.setDept("인사부");
				emp2.display();
				System.out.println();
				
			Employee emp3 = new Employee() ;
				emp3.setAge(27);
				emp3.setName("김길동");
				emp3.setDept("홍보부");
				emp3.setSingle(true);
				emp3.display();
	}

}

//메인도 없어서 싫애 안돼. 새로운 datatype 만드는 것.
//.jar -> 클래스 모아서 압축한 라이브러리. .war 웹애플리케이션 구동