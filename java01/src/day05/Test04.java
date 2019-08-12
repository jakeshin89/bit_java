package day05;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		
		//System.out.println((int)(Math.random()));
		//난수발생. 무슨 수가 나올지 몰라. 얘는 double형. 얘는 0과1 사이
		//double형인데 int로 하면 0만 나옴;; 근데 *10 하면 소수점 뗀 정수값만 나옴
		
		//int[] nums = new int[6];		//data type때문에 정수가 들어와야 해
		
		//String[] args = {};
		//String[] args = {"5"};
		
		if(args.length == 0) {
			System.out.println("배열의 사이즈 정보를 실행매개변수로 넘겨주세요."); //configurations->argument
			System.out.println("실행 예) java day05.Test04 5.");
			return;
		}
		
		int[] nums = new int[Integer.parseInt(args[0])]; //이해안돼. 실행해야 배열의 사이즈 결정하는.
		
		for (int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random()*45)+1;		//읭? 숫자가 1~45 나와야 하는데, 0~0.9999에 45 곱해도 45가 안되니, 정수만 뽑아내려면 +1 해야해. 0이 나올 수 있고 아닐 수 있으.
		}
		
		System.out.println(Arrays.toString(nums));
		// 정렬 sort
		System.out.println("-----------------------");
		
		// 정렬 내림차순
		int count = 0;
		for(int i=0 ; i < nums.length-1 ; i++) {
			
				for(int j=i+1 ;  j<nums.length ; j++) {
					if(nums[i] < nums[j]) {
						int temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
						count++;
					}
				}
				System.out.println(Arrays.toString(nums));
		}
		
		System.out.println("count => "+count);
		System.out.println("--------- 정렬 ---------");

		}	
		
		
	}

