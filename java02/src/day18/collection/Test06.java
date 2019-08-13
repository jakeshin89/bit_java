package day18.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test06 {
	public static void main(String[] args) {
		
		Set<Employee> set = new TreeSet<Employee>(); //Tree가 들어가면 sort
	
			boolean flag = set.add(new Employee(20190730, "홍은비", "영업부"));
			if(flag) System.out.println("등록되었습니다.");
			
			flag = set.add(new Employee(20190730, "홍은비", "영업부"));
			if(!flag) System.out.println("이미 존재하는 데이터입니다.");

			set.add(new Employee(20190730, "송은비", "영업부"));
			set.add(new Employee(20190732, "김은비", "마케팅부"));
			set.add(new Employee(20190730, "홍은비", "영업부"));
			
		Iterator<Employee> it = set.iterator();
		
		while (it.hasNext()) {
			Employee data = it.next();
			System.out.println(data); 
		}
				
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
