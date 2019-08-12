package day08;

import util.MyUtil;

public class Test01 {

	public static void main(String[] args) {

		System.out.println(MyUtil.max(-10, -20)); //static이니 [클라스명.~~]이렇게 소환
		System.out.println(MyUtil.max(50));
		System.out.println(MyUtil.max(new int[]  {10, 20, 30, 4, 5})); //배열은 이렇게
		
		
		
	}

}
