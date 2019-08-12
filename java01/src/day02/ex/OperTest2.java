package day02.ex;

public class OperTest2 {

	public static void main(String[] args) {
		int a, b; // 변수선언하고 공간 만들어줌. 각각 4byte 씩
		a = b = 10; // 오른쪽부터 수행
		
		boolean c = ++a > b++ || a++ >= ++b; 
		// 11>10 연산자 때문에 연속 ㄴㄴ 앞에 true이기 때문에 앞만 연산하고 뒤에 보지도 않음.
		// | 이거 하나면 값이 달라짐 꾸에ㅐㅇ
		
		System.out.println(a+", "+b); // 무튼 둘의 값은 11임
		System.out.println("변수 c의 값 : "+c); //위 연산자 때문에 둘 중 하나만 맞아도 값은 true
	}

}
