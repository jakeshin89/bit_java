package day06;

public class Test04 {
	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.setAge(27);
		emp.setName("신은석");					//emp.name하면, 직접 주소 불러오는거 불가능하니 set해야함
		emp.setDept("본부소대");					//왜? private 하잖아
		emp.setSingle(false);
		
		Employee emp2 = new Employee();

		emp2.setAge(26);
		emp2.setName("한기완");			// 적으면 this.name이 받아 set하고 내려와
		emp2.setDept("본부소대");
		emp2.setSingle(true);
		
		Employee emp3= new Employee();

		emp3.setAge(24);
		emp3.setName("김지훈");
		emp3.setDept("본부소대");
		emp3.setSingle(true);
		
		Employee emp4 = new Employee();	//Employee클래스 new영역에 올리는걸 object화, instance화 라고 함. 하위 setage..같은 걸 

		emp4.setAge(23);
		emp4.setName("원재연");
		emp4.setDept("본부소대");
		emp4.setSingle(true);
		
		Employee[] emps = {emp, emp2, emp3, emp4};
		
		System.out.println("==영업부에 근무하는 사원 목록==");
		
		double sum = 0;
		int count = 0;
		
		for (Employee data : emps) {				//배열에 이용되는 새로운 for 구문
				//System.out.println(data.getDept());
				if(data.getDept() != null && data.getDept().equals("영업부"))		// string이니 dot 쓸 수있음.
						sum += data.getAge();
						count++;
						data.display();
		}
		System.out.printf("영업부 평균 급여 = %.2f %n", sum/count);
				
		System.out.println("== single인 사원 목록 ==");
		for(int i=0;i<emps.length;i++) {
			//System.out.println(emp[i].isSingle());
			if(!(emps[i].isSingle())) {					// string 아니니 dot 못씀. 이래서 함수 선언이 중요.
			emps[i].display();
			}
		}
				
		
	}

}
