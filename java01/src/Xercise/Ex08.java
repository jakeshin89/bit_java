package Xercise;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex08 {

	public static void main(String[] args) {
	
		String name = " 홍길동 / 이순신/김유신 /박철 ";
		String[] data = name.split("/");
		System.out.println(Arrays.toString(data));

		for(String d: data) {		//names에 있는 data 하나씩 꺼내본다.
			System.out.print(d.charAt(d.length()-3)+"**"+" "); 		// 다 꺼내 볼건데, 각 데이터.(그 속 데이터 글짜수-1)번째 글짜수 이건 다시 물어보기
		}
		
		/*
		
		String rename = " ";

		for (int i = 0; i < data.length; i++) {	
			rename += data[i].trim()+" ";		
		}
		
		System.out.println(rename);
		
		for (int i = 0; i < data.length; i++) {
			
	}
	}
	*/
	}
}
