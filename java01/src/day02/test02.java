package day02;

public class test02 {			//여기에서 테스트
	public static void main(String[] args) {
		double d = 1/2.;
		// 여기에서 num(위에선 d)은 local variable (main 안에서 생성한게 로컬 베리어블인가? 인스턴트는 힙에서? 아 몰랑)
		System.out.println(d);
		
		String name = "홍길동";
		System.out.println(name.charAt(0)+"**");
		
		String address = new String("비트교육센터");		// new 쓸 수 있고 안쓸 수 있고, 안쓰면 메모리 절약. address값 비트교육센터
		System.out.println(address+" : "+address.length());	
		
		long number = 9999999999999999L; // 기본적으로 정수는 int로 나옴 (맞나?)
		System.out.println(number);
		
		System.out.println('A'+":"+(int)'A');
		System.out.println('a'+":"+(int)'a');
		System.out.println('0'+":"+(int)'0');
		System.out.println('Z'+":"+(int)'Z');
		System.out.println('a'+":"+(int)'a');
		// 아스키코드값
	}
}
