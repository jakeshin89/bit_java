package day07;

public class CalcTest {
	public static void main(String[] args) {
/*
		Calc c1 = new Calc();									//instance method, 꼭 이렇게 new 처리 해야했음.
		Calc c2 = new Calc();
		Calc c3 = new Calc();
		Calc c4 = new Calc();
		
		System.out.println(c1.add(11, 89));			//return 받아 왔는데, 확인출력자겅ㅂ 해야
		System.out.println(c2.add(11, 89));	
		System.out.println(c3.add(11, 89));	
		System.out.println(c4.add(11, 89));	
		//똑같은 메모리 받아서 일 하니 static 처리해도 될 듯
*/
		
		Calc c1 = new Calc();
		System.out.println(c1.add(11, 77));					//얘는... 이제 객체생성이 필요함. instance method이니까

		System.out.println(Calc.sub(11, 77));
		System.out.println(Calc.multi(11, 77));
		System.out.println(Calc.divide(11, 77));

		
		
	}

}
