package day04;	//구구단 만들기

public class test03 {
	public static void main(String[] args) {

		for (int i=1 ; i<10 ; i++) {		//out 문구
				
				for (int h=2 ; h<10 ; h++) {
					// break 설명(빠져나와 끝내버림), continue 설명(해당 숫자 처리 안하고 다음 숫자로 건너띔)
					System.out.printf("%d*%d=%2d  |", h, i, i*h);		//d 앞에 2는 자릿수 칸 확보										
				}
				
				System.out.println();	//각 단 1~9까지 돌렸다면 한 줄 내려가서 작성해줘
				
			}
		
	}

}
