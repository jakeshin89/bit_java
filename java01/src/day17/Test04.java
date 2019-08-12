package day17;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
			list.add("hello");
			list.add("Java");
			//list.add(new Date());	String 타입이 아니라 걸림
			
			for (String data : list) {
				System.out.println(data.toUpperCase());
			}
		
		
	}
	
	
}
