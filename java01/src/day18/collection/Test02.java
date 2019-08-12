package day18.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		
		Student[] s = new Student[10];
		
		List<Student> list = new ArrayList<Student>();
		//내부에 Student[] 만들어서 관리
		//ArrayList 부모가 List?
			list.add(new Student("최순실", 88, 99));
			//list에 Student 객체를 생성해야 하니 안에다가 생성
			list.add(new Student("박근해", 78, 59));
			list.add(new Student("정우라", 58, 69));			

		//System.out.println(list);	확인차 sysout 쓴거, 성적관리 어떻게 함? iterator로 하자
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			//이미 next해서 썼기 때문에 다시 처음부터 읽으려고 
			Student data = it.next();
			if(data.getAvg() >= 90) System.out.println(data);
		}
		
		System.out.println(list.contains(new Student("박근해", 78, 59)));
		//내부적으로 equals 메소드 없어서 비교 못함
		//equals()가 @Override 되어있어야 제대로 비교할 수 있음
		
		//C Update Read(search) Delete 기반으로 해야
		//홍길동 90 90 등록
		//list.add(new Student("홍길동", 90, 90));
		Student s1 = new Student("홍길동", 90, 90);
		boolean flag = list.add(s1);
		
		if(flag) System.out.println(s1+" 등록되었습니다.");
		else System.out.println(s1+" 등록되었습니다.");
		
		//홍길동 100 100으로 수정
		it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
				if(data.name.equals("홍길동")) {
				data.kor = 100;
				data.math = 100;
				data.setAvg();
				System.out.println(data+"수정되었습니다.");
				}
		}
		//근데 학생 이름이 같은 경우는 어떡함? 서로 구분할 key값(primary key) 있어야
		
		//삭제처리
		System.out.println("**** 학생 "+s1+" 정보삭제 ****");
		it = list.iterator();
		while(it.hasNext()) {
			Student data = it.next();
			if(data.equals(s1)) {
				it.remove();
				System.out.println(s1+" 삭제되었습니다.");
			}
		}
	
		//Sort
		
		Collections.sort(list);
		//목록 출력
		System.out.println("**** 학생 List 정보 출력****");
		it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			System.out.println(data);
		}
		
	}
}


class Student extends Object implements Comparable<Student>{ //필요한 기능 오버라이딩 할거여서 상속받음
	
	String name;
	int kor;
	int math;
	double avg;

	public Student() { 
		super();
	}

	public Student(String name, int kor, int math) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		setAvg();
		
	} //멤버변수가 항상 들어가는건 아니야, avg는 계산해서 나와야 하기 때문에 여기 있을 필요 눠눠

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() { //어디에서 들어와서 하는게 아니라, 안에 있는걸로 자체계산하기 때문에 파라미터 없어야
		this.avg = (kor+math)/2.; //쩜 해줘야 소수점도 계산
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", math=" + math + ", avg=" + avg + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + kor;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
			return false;
		if (kor != other.kor)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		//return kor - o.kor; //국어점수 - 비교대상 국어점수
		//return (int)(o.avg-avg);
		//0보다 크면 오름차순, 작으면 내림차순
		//return name - o.name; String끼리 어떻게 빼? 이미 String끼리는 비교 메소드 가지고 있음
		return name.compareTo(o.name);
	}
	
}
