package day11;

public class Test01 { //is a 관계, downcasting

	public static void main(String[] args) {
		
		Person s = new Student("홍길동", 20, 2012001);
		Person t = new Teacher("이순신", 30, "JAVA");
		Person e = new Employee("유관순", 40, "교무과"); //이렇게 하면 person 생성자함수 지정된데로 뜨는데, 밑에 downcasting해서 문제없음
		// is a
		Person p = s; //만약 Student p = s; 이렇게 하면 부모자식간 관계가 바뀌어서 ㅇㅅㅇ 이건 성립이 안된다 그래서 에러
		//p.printA();
		
		//down casting
		((Student)p).printS();
		
		p=t;
		//p.printA();
		((Teacher)p).printT();
		
	}
}

	class Person extends Object{
		
		private String name;
		private int age;
		
		public Person() {
			super();
		}
		
		public Person(String name, int age) {
			super();
			this.name = name;
			this.setAge(age);
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
		
		public void printA() { //하위 클래스 코드중복으로 부모클래스에 중복 박아버리기
			System.out.printf("이름 : %s, 나이 : %2d ", this.getName(), this.getAge());
	}
}
	class Student extends Person{

		private int id;

		public Student() {}
		public Student(String name, int age, int id) {
			super(name, age);
			//super.setName(name);
			//super.setAge(age); //this 뒤져서 없으면 super영역으로 간당
			this.id = id;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
		public void printS() {
			//System.out.printf("이름 : %s, 나이 : %2d ", this.getName(), this.getAge());
			super.printA(); //중복코드 부모클래스에 박아버리기
			System.out.printf("학번 : %s %n", id);
		}
		
	}
	
	class Teacher extends Person{
		
		private String subject;

		public Teacher() {
			super();
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
			
		public void printT() {
			super.printA();
			System.out.printf("담당과목 : %s %n", subject);	
		}
}
	class Employee extends Person{
		
		private String dept;
		
		public Employee() {
			super();
		}

		public Employee(String name, int age) {
			//super(name, age);
			this(name, age, null);	//여기에서 null을 밑에 생성자함수로 넘기기
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

		public void printE() {
			super.printA();
			System.out.printf("부서 : %s %n", dept);
		}
}

