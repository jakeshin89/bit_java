package day20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import day19.Employee;

public class Test01 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		//ArrayList, LinkedList 어떻게 다를까?
			list.add(5);
			list.add(10);
			list.add(15);
			list.add(20);
		
		list.forEach(i -> System.out.print(i+"  "));
		System.out.println();
		list.removeIf(i -> i%2 == 0);	//조건이 되면 지워줘
		list.forEach(i -> System.out.print(i+"  "));
		
		List<Employee> emp = new ArrayList<Employee>();
			emp.add(new Employee(71017202, "SES", "본부소대"));
			emp.add(new Employee(71017203, "JYP", "1소대"));
			emp.add(new Employee(71017204, "YG", "2소대"));
			emp.add(new Employee(71017205, "TOP", "3소대"));
		
		System.out.println(emp.stream().filter(i->i.getNumber() > 71017200).count());
		emp.stream()
		.filter(i->i.getNumber()>71017200)
		.forEach(i->System.out.println(i));
		
		Employee[] e = {
				new Employee(71017202, "SES", "본부소대"),
				new Employee(71017203, "JYP", "1소대"),
				new Employee(71017204, "YG", "2소대"),
				new Employee(71017205, "TOP", "3소대")
		};
		System.out.println("=== Array Stream 처리===");
		Stream.of(e)
		.filter(i -> i.getDept().equals("본부소대"))
		.forEach(i -> System.out.println(i));
		//배열을 stream으로 바꾼 후 본부소대원원만 추출하여 출력
		System.out.println();
		Stream.of(e).sorted().forEach(i -> System.out.println(i));
		
		Stream.of(e).sorted(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		}).forEach(i->System.out.println(i));
		
		Stream.of(e) //배열을 for루프 없이 쉽게 접근하기 위해 stream으로 컨버팅
		.sorted((o1. o2) -> o1.getName().compareTo(o2.getName())) //name 기준으로 소트하고
		.forEach(i->System.out.println(i));
	
	}
}