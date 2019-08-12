package day14;

import java.util.Arrays;

public class Test02 { //객체 카피

	public static void main(String[] args) throws CloneNotSupportedException {
		int[] num = {11, 22, 33, 44, 55};
		//int[] num2 = num; //같은 주소를 참조		
		int[] num2 = num.clone(); //이건 배열 복제, num에 영향 전혀 주지 않음
		num2[2] = 0;
		System.out.println(num);
		System.out.println(num2);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		System.out.println();
		
		Point p = new Point(5, 5);
		//Point p2 = p; //얘도 역시 객체복사
		Point p2= p.clone();		//위와 같은 방법으로 복제 하려 했는데 안되네. point 클래스 가자
		System.out.println(p);
		System.out.println(p2);
		
		Object obj;
		p.setX(0);
		System.out.println(p);
		System.out.println(p2);
		
	}
}