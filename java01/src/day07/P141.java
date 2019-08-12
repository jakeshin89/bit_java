package day07;

import java.util.Arrays;

public class P141 {
	
	public void increase(int[] n) {				//instance메소드, 얘를 메ㅗㅁ리에 올려야 주소 부여받음
			for (int i = 0; i < n.length; i++) {
					n[i]++;
			}
	}
	
	public static void main(String[] args) {

		int[] data = {10, 100, 1000};
		System.out.println(Arrays.toString(data));
		P141 p = new P141();											// 객체생성하고 호출
		p.increase(data);													
		System.out.println(Arrays.toString(data));
		
	}

}
//data 실행했더니 얘는 n이라는 공간에 오는게 아닌, 기존 data 참조해서 data 값이 바뀜