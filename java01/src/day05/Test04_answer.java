package day05;		//시험문제 헐 손코딩..

import java.util.Arrays;

public class Test04_answer {
	public static void main(String[] args) {

		int[] num = null;
		num = new int[6];
		
		for (int i=0 ; i<num.length ; i++) {
			num[i] = (int)(Math.random()*45)+1;
			for (int j=0 ; j<i ; j++) {
				if(num[j] == num[i]) {
					i--;
					break;
				}				
			}
		}
		
		System.out.println(Arrays.toString(num));
		System.out.println("= = = = = 정렬 = = = = =");
		
		int count = 0;
		
		for (int i=0 ; i<num.length ; i++) {
			int min = i;
			for (int j = i+1 ; j<num.length ; j++) {
				if (num[min] > num[j]) {
					min = j;
				}
			}
			if (i != min) {
				int temp = num[i];
				num[i] = num[min];
				num[min] = temp;
				count++;
			}
		}
		System.out.println(count);
		System.out.println(Arrays.toString(num));
		
	}
	
}