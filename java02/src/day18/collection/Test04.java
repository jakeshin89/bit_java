package day18.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test04 {
	public static void main(String[] args) {
		
		Set<Employee> set = new HashSet<Employee>(); // Set 자식에 hashset, set은 주머니같음
		//hashset은 중복불가
			boolean flag = set.add(new Employee(20190730, "홍은비", "영업부"));
			if(flag) System.out.println("등록되었습니다.");
			
			flag = set.add(new Employee(20190730, "홍은비", "영업부"));
			if(!flag) System.out.println("이미 존재하는 데이터입니다.");

			set.add(new Employee(20190730, "송은비", "영업부"));
			set.add(new Employee(20190732, "김은비", "마케팅부"));
			set.add(new Employee(20190730, "홍은비", "영업부"));
			//어? ID가 같네? equals 메소드 수정
		
		//사원목록	
		Iterator<Employee> it = set.iterator(); //iterator는 collection interface에서 제공
		//얘는 위치인덱스가 읎데
		while (it.hasNext()) {
			Employee data = it.next();
			System.out.println(data); //왜 주소찍히지? 아 오버라이딩!
			//그냥 to.string해서 ctrl+click 들어가면 주소나옴
			//set구조는 들어간데로 나오지 않음, 중복해결이 되지 않음
			//set은 중복이 되지 않지만, 여기서 그렇게 나오는건 주소가 다르기 때문
			//이건 equals 오버라이딩 해야 함			
		}
			
		//20190730 사번의 사원 검색 출력하세요
		System.out.println();
		it = set.iterator();
		System.out.println("20190730 검색결과입니다.");
		while (it.hasNext()) {
			Employee data = it.next();
			if(data.number == 20190730) {
				System.out.println(data);
			}
		}				
	}
}

class Employee implements Comparable<Employee>{
	
	int number;
	String name;
	String dept;
	
	public Employee() {	}
	public Employee(int number, String name, String dept) {
		super();
		this.number = number;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name + ", dept=" + dept + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}
	
	@Override //number만 생성
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (number != other.number)
			return false;
		return true;
	}
	@Override
	public int compareTo(Employee o) {
		return number - o.number;
	}

	
	
}
