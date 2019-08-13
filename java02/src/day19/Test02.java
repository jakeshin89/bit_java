package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test02 {

	public static void main(String[] args) {
		//자식 이상(자식, 애비.... 조상) = 자식
		Map<String, String> map = new HashMap<String, String>();
		// hash는 무정렬, tree는 정렬
		// Hash를 띄우고, map의 기능 사용
		
		map.put("java01", "1234"); // id, pw
		map.put("java02", "1234");
		map.put("admin", "admin");
		map.put("test01", "test");

		for(int i=0 ; i<30 ; i++) {
			map.put("test"+i, (int)(Math.random()*3)+"aa");
		} //비번 앞자리 0, 1, 2
		
		//System.out.println(map);
		// id = 비번		
		System.out.println("admin => pw ? "+map.get("admin"));
		System.out.println("java01 => pw ? "+map.get("java01"));
		System.out.println("java09 => pw ? "+map.get("java09"));
		System.out.println("test1 => pw ? "+map.get("test1"));
		//아이디 자체가 없음, 회원 아니야
		//map.get(key값 입력) => return 해당하는 key값의 value	 
		System.out.println("= = = = = = = = = = = = = =");
		
		//key 뽑아서 set구조로, 이거는 출력용임
		Set<String> keynames = map.keySet(); // Map 인터페이스에서 제공하는 keyset은, map.put으로 입력한 모든 key값을 출력해줌
		System.out.println(keynames);
		
		//순회해보자 iterator는 무조건 while
		Iterator<String> it = keynames.iterator();
		while (it.hasNext()) {
			String key = it.next();	//이건 뭐지
			System.out.println("ID : "+key+", PW : "+map.get(key));
		}
		
	}
}
