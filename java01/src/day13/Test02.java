package day13;

public class Test02 {
	public static void main(String[] args) {
	
		Point p = new Point(3, 3);
		System.out.println(p);	//toString 만들었기 때문에 아웃풋 다음과 같이 나옴. 원래 p 찍으면
		
		Circle2 c1 = new Circle2();	//기본생성자로 했더니 null
		c1.setP(p);								//아까 만든 p 넘기면
		System.out.println(c1); 
		
		Circle2 c2 = new Circle2(new Point(7, 7), 5);
		System.out.println(c2);
	}
}
