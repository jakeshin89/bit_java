package day04; 		// for in for

public class Test02 {
	public static void main(String[] args) {

			for (int j = 0 ; j < 5 ; j++) {	//오른쪽으로, 2번째까지 조건 맞으면 동작			
				//System.out.println("j = "+j);

					for (int i = 0 ; i <= j ; i++) {					
						//System.out.print("i = "+i);	
						System.out.print('*'+" ");	
					}

			System.out.println();
			
			}

			System.out.println();			
			
			for (int j=5 ; j>0  ; j--) {	//오른쪽으로, 2번째까지 조건 맞으면 동작			

					for (int i = 0 ; i < j ; i++) {					
						System.out.print('*'+" ");	
					}
			System.out.println();

			}
						
	}

}
