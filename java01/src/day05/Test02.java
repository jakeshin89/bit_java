package day05;				// 배열 확장. 확장 전 배열을 확장된 배열로 복사

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {

		int[] scores = {100, 99, 95, 100, 98};
		int[] sc = new int[scores.length*2];		// 2배만큼의 공간 넣기. scores sc 기억공간 다름. 만들었으니 scores를 sc로 카피
																		//원본(scores)를 목적지(sc)로 복사. 배열 내 위치 자유롭게 선정 가능.		
		System.arraycopy(scores, 0, sc, 0, scores.length);

		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(sc));
		
		//System.arraycopy(scores, 0, sc, 0, scores.length);
					 //method     매개변수(input parameter, 정보를 주면 그 정보를 가지고 알아서 처리. 마치 은행에서 통장, 돈 주면 아 입금하는구나..라고 생각하는 것 처럼)
					 //기능수행 위해 반드시 필요한 정보 줘야
					 //(object;주소 자료, 어느 위치부터 카피할래? 포지션, 목적지, 목적지 어디 포지션으로?, 몇 개?
					 //마치 엑셀 함수처럼 method API 보면서 이해해야행

		String[] names = {"루피", "조로", "상디", "나미", "우솝"};
		String[] luppy = new String[names.length*2];
		// string은 레퍼런스 타입이라 아무것도 설정 안해놨으면 기본값 null 이네 ㅇㅅㅇ
	
		System.arraycopy(names, 0, luppy, 0, names.length);		//names에서 luppy로 카피
		// 헐 식으로? luppy.length-names.length 헐;;
		
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(luppy));

	}

}
