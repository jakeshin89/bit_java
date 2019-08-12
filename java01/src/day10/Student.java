package day10;

public class Student extends Person {

	private int id;

	public Student() {}

	public Student(int id) {
		super();
		this.id = id;
	}

	public Student(String supername, int superage, int id) {
		super(supername, superage);
		this.id = id;
	}
/*public Student(String name, int age, int id){
 * 		super(name, age);
 * 		this.id = id;
 * }	
 */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void printStudent() {
		System.out.printf("[이 름 : %s, 나 이 : %d, 학      번 : %d]\n", super.getName(), super.getAge(), this.id);
	}
	
/*public void print(){
 * 		super.printA(); 중복코드 부모클래스에 박은거 소환!
 * 		System.out.printf("학번 : %s %n", id);
 * 		}
 */
	
}
