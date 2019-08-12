package day03;

public class test01 {
	public static void main(String[] args) {

		int num1 = 99;
		int num2 = 99;
		
		String name1 = "홍길동";
		String name2 = "홍길동"; //string은 semi-type. 하지만 참조형이니 .equals()
		
		String msg1 = new String("Hello");
		String msg2 = new String("Hello");
		
		System.out.println("num1==num2 => "+(num1==num2));
		System.out.println("name1==name2 => "+(name1.equals(name2))); //괄호 안해줘도 된다는데 왜지 ㅇㅅㅇ
		System.out.println("msg1==msg2 => "+(msg1.equals(msg2)));
		// 괄호 설정해줘야 함. 이유는.. data type이 달라서
	}
}