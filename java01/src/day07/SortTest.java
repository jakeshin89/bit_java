package day07;

import java.util.Arrays;

import util.Sort;

public class SortTest {

	public static void main(String[] args) {

			int[] src = {5, 9, 3, 77, 1, 4, 6};			
			int[] result = Sort.sort(src);							//
			
			System.out.println(Arrays.toString(src));
			System.out.println(Arrays.toString(result));
			
			int[] src1 = {9, 7, 5, 2, 1};
			int[] result1 = Sort.sort(src1);
			
			System.out.println(Arrays.toString(result1));
			
	}

}
