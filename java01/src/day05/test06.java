package day05;

public class test06 {
	public static void main(String[] args) {
		
		int[][] t1 = new int[4][]; //행은 결정, 열은 결정 ㄴㄴ
		t1[0] = new int[4];
		System.out.println(t1[0]);			// 주소가 들어갔
		System.out.println(t1[0][0]);		// 0은 디폴트, 초기화가 이루어짐
	
		int[][] t2 = {
					{1, 2, 3, 4, 5}, 
					{44, 66, 77, 99, 99, 55, 66}, 
					{11, 22}
					};
		
		for (int i = 0; i < t2.length ; i++) {
				for (int j = 0; j < t2[i].length; j++) {
						System.out.print(t2[i][j]+" ");
			}
			System.out.println();
		}
		
		char[][] s = {
				{'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'},		
				{'x', 'x', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x'},		
				{'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'x', 'x'},		
		};
		
		for (int i=0 ; i < s.length; i++) {
			  for (int j = 0 ; j<s[i].length; j++) {
				  if(s[i][j] == 'o') {
				  System.out.printf("[%2d행 %2d열]%n", i, j);
				  }
			  }	
		}
		
	}

}
