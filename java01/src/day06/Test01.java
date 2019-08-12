package day06;

public class Test01 {
	public static void main(String[] args) {

		int[] num = {2, 4, 6, 8};
		
		int[] num2;												//배열선언. 배열은 무조건 힙영역.
		num2 = new int[] {1, 2, 3, 4, 5, 6, 7}; 	//배열생성
		
		for(int data : num) {
				//System.out.println(num); 이건 주소가져오는거
				System.out.println(data);
		}
		
		for(int data : num2) {
				//System.out.println(num2);
				System.out.print(data);
		}		
	}
}
//다른 패키지에서 가져오려 하는데,