package day17;

public class DiceTest {

	public static void main(String[] args) throws Exception{

		DiceGame game = new DiceGame();
	
		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를 던져서 같은 눈이 나온 횟수 : "+result1);		

		int result2 = game.countSameEye(-10);
		System.out.println("면의 개수가 8개인 주사위 2개를 던져서 같은 눈이 나온 횟수 : "+result2);		
		
	}

	
	
}
