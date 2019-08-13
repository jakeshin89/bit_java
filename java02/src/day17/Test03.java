package day17;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class Test03 {

	public static void main(String[] args) {
		
		//List list = new ArrayList(); //이렇게 아무렇게나 다 들어가니 이건 Object 배열이다. 다 Object[]로 관리
		//내부적으로 위치 가지고 있음
		List list = new Vector(); 

		list.add("hello");
			list.add("java");
			list.add(200);
			list.add(new Date());
			list.add(new Book("Spring",5000));
		
		System.out.println(list);
		
		for(int i=0 ; i<list.size() ; i++) {
		System.out.println(list.get(i)); //점 찍어서 확인. 다 object
		}

	}

}
