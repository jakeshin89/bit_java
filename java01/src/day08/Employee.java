package day08;

/**	Document 위한 주석
 * 
 * @author jake
 *	@since	2019.07.16.
 *	@version 1.0
 */

public class Employee {

		static String cName="BIT";	//static한 멤버변수 처리
		private String name;
		private String dept;
		private boolean single;

		public Employee() {	// 얘는 디폴트(기본) 생성자 함수로, 항상 호출되기 때문에 초기화 작업을 주로 함. 생성 안했더니 알아서 만들어짐. 얘 지우면 난리남
			//System.out.println("Employee() call");
			//this.name = "사원이름";
			//this.dept = "000부서";
			//this.single = true;
			this("사원이름", "000부서", true); //나의 또다른 생성자함수 호출문, first statement에만 와야 함. 다녀와서 추가로 기술하지만, 갔다 온 다음 다음꺼 실행해야 해.
		}
		//어떻게 emp1.~ 이렇게 다 일일이 입력할까... 이걸 줄이기 위해 밑에 기본 생성자함수(); 여기 괄호 안 빈칸에 파라미터 이용해 직접 값 입력
		
		public Employee(String name, String dept) {	//생성자함수에선 return 안함
			//System.out.printf("Employee(%s, %s) call%n", name, dept);
//			this.name = name;
//			this.dept = dept;			
			this(name, dept, false);
		}	//파라미터 2개짜리 생성자

		public Employee(String name, String dept, boolean single) {	//입력받으면 밑에 나오게 처리
			//System.out.printf("Employee(%s, %s, %s) call%n", name, dept, single);
			this.name = name; //이렇게 하면 원하는 값 안나와... 그러니 this 처리
			this.dept = dept;
			this.single = single;
		}

		/*	
		public Employee(String name, String dept) {
			System.out.printf("Employee(%s, %s, %s) call%n", name);
			this.name = name; //이렇게 하면 원하는 값 안나와... 그러니 this 처리
			this.dept = dept;
		}
		
*/			
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public boolean isSingle() {
			return single;
		}
		
		/**
		 * 
		 * @param single이 true이면 미혼, false면 기혼.
		 */
		
		public void setSingle(boolean single) {
			single = single;
		}

		/**
		 * 		Employee 정보 출력	
		 */
		
		public void print() {					//여기에 static 붙이면 안돼. 인스턴스니까...
			//System.out.println("회사명 : "+cName);
			System.out.printf("[사원명 : %s, 근무부서 : %s, 결혼여부: %b]%n", this.name, getDept(), single);
		}
		
		
}
