package day08;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee(); //'()'기본생성자 이용해서 함수 호출하겠습니다.
//			emp1.setName("홍길동");
//			emp1.setDept("인사부");
//			emp1.setSingle(false);
			emp1.print();
			System.out.println();
			//와 근데 어떻게 이렇게다 해...? 너무 반복적인데	
			
		Employee emp2 = new Employee("고길동", "영업부");
		emp2.print();
		System.out.println();
		
		Employee emp3 = new Employee("김길동", "영업부", true);
		emp3.print();
		System.out.println();
		
		Employee emp4 = new Employee("최길동", "기술부", false);
		emp4.print();
		System.out.println();
		
	}

}
