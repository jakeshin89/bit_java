package Xercise;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {		
		String[] str = new String[5];		
			str[0] = "가나다";
			str[1] = "라마바";
			str[2] = "사아자";
			str[3] = "차카타";
			str[4] = "파하가";
			//str[5] = "나다라";
			//str[6] = "마바사";
		
		System.out.println(Arrays.toString(str));

		ArrayList<String> al = new ArrayList<String>();
			al.add("가나다");
			al.add("라마바");
			al.add("사아자");
			al.add("차카타");
			al.add("파하가");
			al.add("나다라");
			al.add("마바사");

		for (int i=0 ; i < al.size() ; i++) {
			String var = al.get(i);
			System.out.println(var);
		}	
		
		
	}

}
