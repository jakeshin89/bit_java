package day15;

import day14.Circle;
import day14.Point;

public class Test01{
	public static void main(String[] args) throws Exception{	//Point에 있는거 갖다쓰니까 예외 복붙
		
		Point p1 = new Point(5, 5);
		Point p2 = p1.clone();
		
		Point p3 = p2;
		
		p2.setX(0);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("= = = = = = = = ");
		
		Circle c1 = new Circle(new Point(7, 7), 2);
		Circle c2 = c1.clone();
		c2.r = 0;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(); //r은 Circle 자체값이라 바로 변경.
		
		c2.p.setX(0);	//복제된 듯 하지만 point의  x는 같이 바뀌어서... 제대로 안되었다
		System.out.println(c1);
		System.out.println(c2);
		//Circle 클래스 가서 조작 deep copy
		System.out.println(c1);
		System.out.println(c2);
		

	}
}
