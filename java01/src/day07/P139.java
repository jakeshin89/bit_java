package day07;

public class P139 {

	public static int increase(int n) {
			++n;
			return n;
	}	
	
	public static void main(String[] args) {
			int var1 = 100;												//call by value, 그냥 카피
			int var2 = P139.increase(var1);					//원본(var1)은 전혀 영향받지 않음
			System.out.println(var1+" "+var2);
	}

}

// ValueParameter String은 같은 class에 있지만 올라오는 메모리 영역은 다름
// 그래서 static 처리해주면 호출하는 방법이 달라짐
// static은 new 이용 안해도 클래스명. 이렇게 해도 됨
// var2는, var1에서 받은 100을 n 저장공간에 넣어서