package day10;

public class Teacher extends Person{

	String subject;

	public Teacher() {	}

	public Teacher(String subject) {
		super();
		this.subject = subject;
	}
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print() {
		super.printA();
		System.out.printf("담당과목 : %s %n", subject);
	}
	
}
