package Xercise;

import java.util.Arrays;

public class Name {

	public static void main(String[] args) {

		String s = " 홍길동 _ 이순신_김유신 / 박철".replace("_","/");
		String[] n = s.split("/");
		System.out.println(Arrays.toString(n));
		
		for (int i=0 ; i < n.length; i++) {
			System.out.print(n[i].trim().charAt(0));			// 배열에서 트림 해줘야
			for (int j=0 ; j<n[i].trim().length()-1 ; j++) {	//위에게 그대로 내려온게 아님; 또 작업 해줘야 함
				System.out.print("*");
			}
			System.out.print(" ");
		}		
	}
}