package day15_ex;

import util.*;
import static util.MyUtil.rightpad;

public class Test01 {

	public static void main(String[] args) {
		
		MyUtil u = new MyUtil();
		String s = u.leftpad("ejb", 15, '^'); // instance method
		System.out.println(s);
		
		System.out.println(MyUtil.rightpad("Java", 10, '#')); //static method
		//지금 rightpad가 static해서(static method) 따로 객체생성 안해도 가능
		//static 안했다면 객체생성(instance method) 해야함.
		System.out.println(rightpad("Java", 4, '$')); //static method
		System.out.println(MyUtil.add(4, 5, 6, 7, 8));
	}

}
