package day08;

public class Test02 {

	public static void main(String[] args) {

		//Student[] s1 = new Student[100];
		Student[] stds = {
				
				new Student("홍길동", 20190701, -90, 99, 71),	
				new Student("최순실", 20190702, 70, 92, 71),
				new Student("정유라", 20190703, 80, 90, 71),
				new Student("이명박", 20190704, 60, 98, 71),	
				new Student("박원순", 20190705, 70, 91, 71)	

		};
		
		for(Student data : stds) {	//배열 for루프로 다 뽑아내기
			if (data.getGrade() == 'B') {	//필터하기
				data.print();	
			} 
			
		}
		
		//Student s1 = new Student("홍길동", 20190717, 96, 99, 97);		
		//s.setGradeProcess(); set get에서 벗어난 메소드이기 때문에 꼭 불러줘야 함. 그리고 private 설정하면 이거 못씀.
		//s1.print();

	}

}

class Student{

	private String name;
	private int number;
	private int kor;
	private int eng;
	private int math;
	private char grade;
	
	//생성자 함수, 파라미터만 다르면 계속 만들 수 있음. 입력값은 여기로 나오고, 제조했으니 한 번 더 갔다 놔야 함.
	public Student() { }
	public Student(String name, int number, int kor, int eng, int math) {
			this.name= name;
			this.number = number;
			//this.kor = kor;
			setKor(kor);
			this.eng = eng;
			setEng(eng);
			this.math = math;
			setMath(math);
			//this.setGradeProcess(); get grade 했으니 그러니 이거 생성 안해도 돼
			//점수 마이너스 넣으면 이게 적용이 안됌... 왜? 생성자 함수에서 적용해줘야 함.
	}
	public Student(String data) {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if(!(valid(kor))) return;
		this.kor = kor;		
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if(!(valid(eng))) return;
		this.eng = eng;

	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(!(valid(math))) return;
		this.math = math;
		
/*		아까는 이렇게 했었음
		if(!(math>=0 && math<100)) {
			System.out.println(math+" => 점수가 유효하지 않습니다.");
			return;
		}
*/
	}	

	public char getGrade() { //근데 이건 오픈이어서 이걸 원할 수 있을텐데, 
		this.setGradeProcess(); //안에서 쓸 수 있으니 먹여줌
		return grade;
	}

	private void setGradeProcess() {	//이 안에서만 동작하게 private 처리. 외부에선 쩜해도 안보여. 내부에서만 처리 
		double avg = (kor+eng+math)/3.;
		this.grade = avg>=90 ? 'A' : (avg>=80 ? 'B' : (avg>=70 ? 'C' : (avg>=60 ? 'D' : 'F')));
		
	}
/*
	private boolean valid(int num) {
		if(!(num>=0 && num<100)) {
			System.out.println(num+" => 점수가 유효하지 않습니다.");
			return false;
		} else {
			return true;
		}
	}
*/
	private boolean valid(int num) {

		boolean flag = true;

		if(!(num>=0 && num<100)) {
			System.out.println(num+" => 점수가 유효하지 않습니다.");
			flag = false;
		} 
		return true;
	}
	
	
	public void print() {
		System.out.printf("이름 : %s, 평균 : %.2f, 등급 : %s%n", name, (kor+eng+math)/3., getGrade()); //소수점 2째자리까지 출력
	} //grade는 계산 안되어서 공백나옴. 그래서 get grade로 나오게 해야 함
}