package day06;				// 클래스 만들기, 캡슐화 이해

public class Employee {

	private String name;
	private String dept;
	private int age;
	private boolean single;

	public void display() {
		System.out.printf("[사원명 : %4s, 부서명 : %s, 나이 : %d, 미혼: %b]%n", 
											this.name, dept, getAge(), single);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if(!(age>0 && age<=120)) {
			System.out.println("Age(나이) 정보가 올바르지 않습니다. 다시 입력하세요.");
			return;
		}		
		this.age = age;
	}

	public boolean isSingle() {
		return single;
	}

	public void setSingle(boolean single) {
		this.single = single;
	}
}

//새로운 data type 만들기. 접근지정자 확인