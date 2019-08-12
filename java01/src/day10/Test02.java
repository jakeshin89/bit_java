package day10;

import java.util.Arrays;

public class Test02 {	//항변환, 아까 질문..

	public static void main(String[] args) {

		char[] c = "ABCDEF".toCharArray();		//String을 char타입으로 Array(배열)해줘
		int count = 4;			// 빼고싶은 길이자리
		int d = 3; // d는 6을 가질 수 없어.
		
		System.out.println(Arrays.toString(c));
		System.out.println();

		System.arraycopy(c, d+1, c, d, count-d-1);
		c[--count]=' '; //연산 전에 미리 위치시ㅋㅣ고 공백문자 넣겠다
		
		System.out.println(Arrays.toString(c));
		
		
	}

}
