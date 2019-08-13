package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Test07_foreach {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
			//list는 중복ㅎㅓ용 합니다.
			list.add(new Employee(20190732, "김은비", "마케팅부"));
			list.add(new Employee(20190730, "홍은비", "기술부"));
			list.add(new Employee(20180730, "이은비", "전산부"));
			list.add(new Employee(20170731, "박은비", "기술부"));
			list.add(new Employee(20130730, "신은비", "영업부"));
			list.add(new Employee(20150734, "한은비", "기술부"));
			list.add(new Employee(20190730, "홍은비", "기술부"));

/*			
		//iterator기반 목록출력
		System.out.println("* * * * Iterator기반 목록출력 * * * *");
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			Employee data = it.next();
			System.out.println(data);
		}
		System.out.println();
		
		//foreach기반 목록출력
		System.out.println("* * * * foreach기반 목록출력 * * * *");
		list.forEach(new Consumer<Employee>) { //Consumer를 implements한 anonymous 
			@Override							//Consumer는 FunctionalInterface
			public void accept(Employee t) {
				System.out.println
				(t);
				
			}
		});
		
		System.out.println();
		//foreach 람다로 출력
		System.out.println("* * * * foreach기반 람다출력 1* * * *");
		list.forEach(
			(Employee t) -> {
				System.out.println(t);
			}
		);
		
		System.out.println();
		System.out.println("* * * * foreach기반 람다출력 2* * * *");
		list.forEach(t -> System.out.println(t));
*/		
		list.forEach(t -> System.out.println(t));
		//list.forEach(i -> System.out.println(i));		
		//list.forEach(System.out::println);
}
}
