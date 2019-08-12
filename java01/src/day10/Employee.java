package day10;

public class Employee extends Person{

	String dept;
	
	public Employee() {	}

	public Employee(String name, int age) {
		this(name, age, null); //여기에 null 넣어서 생성자함수로 넘기기
	}
	
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		super.printA();
		System.out.printf("부      서 : %s]%n", dept);
	}
	
}
