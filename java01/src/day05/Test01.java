package day05;				// 배열 단순 백업

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		int num1 = 99;
		int num2 = num1;
		System.out.println("num1 = "+num1+", num2 ="+num2);
		num1 = 77; 
		System.out.println("num1 = "+num1+", num2 ="+num2+"\n");
		// call by value
		
		int[] n1 = {11, 22, 33, 44, 55, 66};
		int[] n2 = n1;

		int[] n3 = new int[n1.length];			// n1 백업? 갯수 직접 넣으면 n1에 대응 못하니 길이만큼. int타입으로 n1사이즈만큼 형성해. 얘는 아얘 new로 새로운 영역으로 만들었으니
		for (int i = 0; i < n1.length; i++) {
			n3[i] = n1[i];
		}	//배열 내용 카피 (자릿수까지). 공간 만들었으니 for 돌리는 값 차례로 넣어라
		// 배열 카피는 1.배열사이즈, 2.내용
		
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println(Arrays.toString(n3));
		System.out.println();
		
		n1[2] = 0; //바꾸었다. 바꾸었다 해서 n3은 영향 안받음.
		
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println(Arrays.toString(n3));
		// call by reference
		
	}

}
