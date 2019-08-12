package day06;

public class Test02 {		//Employee 클래스 힙영역으로 띄워서 사용하기. private 이전

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		//System.out.println(emp1.age+" : "+emp1.name+" : "+emp1.dept);
		//얘는 무슨 베리어블 같은데... null이 뜨네
		
		Employee emp2 = new Employee();
			//emp2.age = 201901;
			//emp2.name = "홍길동";
			//emp2.dept = "인사부";
		//System.out.println(emp2.age+" : "+emp2.name+" : "+emp2.dept);
			
		Employee emp3 = new Employee() ;
			//emp3.age = 71017202;
			//emp3.name = "신은석";
			//emp3.dept = "본부소대";
			//System.out.println(emp3.age+" : "+emp3.name+" : "+emp3.dept);

	}

}
