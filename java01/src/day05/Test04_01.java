package day05;

import java.util.Arrays;

public class Test04_01 {
	public static void main(String[] args) {
	
		if(args.length == 0) {
			System.out.println("배열의 사이즈 정보를 실행매개변수로 넘겨주세요.");
			System.out.println("실행예시) java day05.Test04_01 6");
			return;
		}
		
		int[] nums  = new int[Integer.parseInt(args[0])];

		for (int i=0 ; i<nums.length ; i++) {
				nums[i] = (int)(Math.random()*45)+1;

		//중복제거 (오늘은 초복)
				for (int j=0 ; j<i ; j++) {
					if(nums[i] == nums[j]) {
						i--;
						break;
						}
				}
		}
		
		System.out.println(Arrays.toString(nums));
		System.out.println("=======================");
		
		//내림차순 정렬
		
		int count = 0;															//초기값 설정
		for (int i=0 ; i<nums.length ; i++) {						//6번 반복할건데
				for (int j=i+1 ; j<nums.length ; j++) {			//i번과 i+1번 비교
						if (nums[i]<nums[j]) {
								int temp = nums[i];
								nums[i] = nums[j];
								nums[j] = temp;	
								count++;
						}	
				}
				System.out.println(Arrays.toString(nums));
		}
		 System.out.println("count => "+count);
	}
	
}
