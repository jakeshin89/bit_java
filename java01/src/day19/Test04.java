package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test04 {

	public static void main(String[] args) {
		//HashMap구조를 이용하여 Employee객체 관리

		//객체생성
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();

		//데이터 입력
		Employee[] emp = {
			new Employee(2017002, "김씨", "마케팅부")
		};
		
		map.put(2017002, new Employee(2017002, "김씨", "마케팅부"));
		map.put(2017009, new Employee(2017009, "김씨", "마케팅부"));
		map.put(2017012, new Employee(2017012, "홍씨", "영업부"));
		map.put(2018002, new Employee(2018002, "박씨", "마케팅부"));
		map.put(2019002, new Employee(2019002, "김씨", "영업부"));
		
		//사원조회 2018002
		System.out.println("2018002사번의 사원 조회 내역");
		System.out.println(map.get(2018002));
		
		//마케팅부 근무하는 사원들 출력
		System.out.println("마케팅부 사원 목록 출력");
		//키값이 있어야 데이터값 뽑아낼 수 있음
		
		Iterator<Integer> it = map.keySet().iterator();
		
		while (it.hasNext()) {
			Integer num = it.next();
			Employee emp1 = map.get(num);
			if(emp1.dept.equals("마케팅부")){
				System.out.println(emp1);
			}
		} //에러가 나면 에러나온 부분 유심히 보기
			
		// 삭제 사번기준 삭제 2018002
		System.out.println("2018002사번의 사원 삭제 내역");
		System.out.println("삭제 정보 : "+map.remove(2018002));
		System.out.println("2018002 사원 정보 : "+map.get(2018002));
	}

}
