package day10;

public class Person {

	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age; //this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printA(){ //하위클래스와의 코드중복이 있으니 부모클래스에 중복되는 부분 박아버리기
  		System.out.printf("[이 름 : %s, 나 이 : %2d, ", this.getName(), this.getAge());
  }
	
}
