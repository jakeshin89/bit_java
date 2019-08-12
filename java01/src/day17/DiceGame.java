package day17;

public class DiceGame {

	public int countSameEye(int n) throws Exception {

		if(n<0) throw new Exception("음수안됨");
		//예외 자체적으로 발생시키기. 여기에서 예외가 발생했는데, 이 메소드 호출한 곳에서 try catch로 잡아
		//1.예외 발생시킬 메소드 2.예외조건 걸기 3.조건에서 throw로 예외 발생 4.메소드에서 throws로 예외 내보내기
		
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);	
		
		int count = 0;
		for (int i=0 ; i<n ; i++) {
			//int p1 = d1.play();
			//int p2 = d2.play();
			//System.out.println(p1);
			//System.out.println(p2);
			if(d1.play() == d2.play())
			count++;
		}
		
		//while (n > 0) {
			//if(d1.play() == d2.play()) count++;
			//n--;
		//}		
	return count;	
	
	}
}
