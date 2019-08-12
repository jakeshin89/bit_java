package day07;

import java.util.Arrays;

import util.MyMath;

public class MyMathTest {
	public static void main(String[] args) {
		System.out.println(MyMath.add(33, 99));
		System.out.println(MyMath.add(33.3, 99.4));
		System.out.println(MyMath.add(33.3, 99.4, 90));
		System.out.println(MyMath.add(33.3, 99.4, 90, 55.4));
		System.out.println(MyMath.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));									//가변인자쓰
		System.out.println(MyMath.add(new double[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})); 			//배열로 가려면 

		double[] d = new double[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(Arrays.toString(d)); 				// Arrays. 여기 쩜 찍을 때 창 많이 나오는거, 이름은 하나지만 다양한 타입의 기능 실행할 수 있는거. 이게 바로 오버로딩
																						// 리턴타입은 해당 안됨. 
		
		//오토박싱 언박싱 ; 기본형과 레퍼를 자유롭게 왔다갔다 하는거
		int i = 100;													//기본형
		//Integer ii = new Integer(100);				//꼭 이렇게 뉴를?
		Integer ii = i;												//기본형, 레퍼클래스는 그냥 타입이 왔다갔다
		i = ii;															//알아서 동작
		System.out.println(i+" "+ii);
		
	}

}
