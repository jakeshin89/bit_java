package Xercise;

import java.util.ArrayList;

public class Pitches {

	public static void main(String[] args) {
		
		//배열과 비슷하지만 배열보다 편한 자료형 List
		ArrayList<Integer> pitches = new ArrayList<Integer>();
		//ArrayList<list타입지정>
			pitches.add(138);
			pitches.add(129);
			pitches.add(142);
			pitches.add(0, 123);
			pitches.add(2, 142);
			
		System.out.println(pitches);
		System.out.println(pitches.get(0)); //ArrayList 위치 확인
		System.out.println(pitches.size()); //ArrayList 사이즈 확인
		System.out.println(pitches.contains(143)); //ArrayList 리스트 안에 항목값이 있는지 판별(boolean)
		System.out.println(pitches.remove(0));
		
	}

}
