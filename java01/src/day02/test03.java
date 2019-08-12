package day02;

public class test03 {
	public static void main(String[] args) {
		int x = 600, y = 700;		// ,(컴마)로 연속 가능
		System.out.println("x="+x+", y="+y);
		// string 연속으로 쓰는건 아주 별로임. 연산작업을 할 땐 string 버퍼 등 사용해야
		// ㅇㅒ는 immutable
		System.out.printf("x=%d, y=%d%n",x,y);
		// %d는 정수형, 앞에 숫자는 띄어쓰기 정렬용
		
		//swapping
		
		int temp = x;
		// 스왑하면 x가 사라지니, 이걸 미리 temp로 설정
		
		x=y;
		// 이제 난 x의 값을 y로 하겠다
		
		y=temp;
		// 그림을 가지고 설명, y가 가지고 있던 700이 x로 
		// 헉 사라졌네. temporary 기억공간에 넣고 걔를 넣어야.(스왑 알고리즘)
				
		System.out.printf("x=%d, y=%d%n",x,y);
		System.out.printf("--------------------%n");
		
		double d1 =99.15689, d2=77.34677;
		System.out.printf("d1=%f , d2=%f %n%n",d1,d2); // %f는 실수(무조건)

		System.out.printf("d1=%5.2f , d2=%5.2f %n",d1,d2);		//5.2가 의미하는게 뭔지
	
		double temp1 = d1;
		d1=d2;
		d2=temp1;
		
		System.out.printf("d1=%5.2f , d2=%5.2f%n", d1,d2);		
		
	}
}
