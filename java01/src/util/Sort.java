package util; //이게 문제로 나왔;;

import java.util.Arrays;

public class Sort {

	public static int[] sort(int[] nums) { //배열 원본은 변경이 되지 않도록 하고, 오름차순으로 정렬된 int[]를 리턴.		
																//1.카피 2.정렬	
		int[] copy = new int[nums.length];									//공간 만들기 주소가 다르네?
		System.arraycopy(nums,0, copy, 0, nums.length);		//데이터 넣기
		
		int[] num = copy;			//copy를 num으로
		
		for (int i = 0; i < num.length-1 ; i++) {
			int min = i;				 
			for (int j = i+1 ; j < num.length ; j++) {
			 	if (num[min] > num[j]) {
			 		min = j; //자리이동
					}
			}
			 	
				if(i != min) {
			 		int temp = num[i];
					num[i] = num[min];
					num[min] = temp;
					//num++;				 				
				}			 	
		}
				
		return copy;	//return null 에서 return copy
		
	}
}