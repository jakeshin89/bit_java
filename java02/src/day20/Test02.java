package day20;

import java.util.Iterator;
import java.util.Properties;

public class Test02 {
	public static void main(String[] args) {
		
		Properties p = new Properties();
		//중복 안 되게 관리해야
		//얘는 도대체 왜 쓰는거야...
			p.setProperty("java01","1234");
			p.setProperty("java02","1244");
			p.setProperty("java03","1734");
			p.setProperty("java07","7234");
		System.out.println(p.getProperty("java01")); // 입력된 key 값을 가지고 해당 value값을 찾아서 출력
		
		Iterator it = p.keySet().iterator(); //iterate 뜻은 반복하다 iterator는 인터페이스
		//			= Properties p에 있는 키값을 다 돌려서 key값 찾을거야
		//System.out.println(p.keySet());
		while (it.hasNext()) { //뒤에 element가 있다면 반복, 없으면 종료
			String key = (String)it.next();
			System.out.println(key+" : "+p.getProperty(key));
		}
	}

}
