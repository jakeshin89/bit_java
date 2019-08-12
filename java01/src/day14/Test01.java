package day14;

public class Test01 {
	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(4, 4), 3);
/*		System.out.println(c1);
		//Circle 들어가서 보니, drawable, movable 하네?		
		c1.move(1);
		System.out.println(c1);
*/		//c1.draw();
		
		Rectangle r1 = new Rectangle(new Point(11, 11), 3, 7);
/*		System.out.println(r1);
		r1.move(3);
		System.out.println(r1);
		r1.draw();
*/
		//부모가 복잡하면 한 타입으로 묶기 가능하다
		Shape[] shapes = {c1, r1};
		for (Shape data : shapes) {
			System.out.println(data); //to.String 생략
			System.out.println(data.area()); //위에 넣은 r값 3이 area()메소드 들어가서 수행 후 여기서 호출했으니 여기로 돌아와서 값 돌려줌
			data.move(1); //보이드니 이렇게 소환
			data.draw();	//얘도 보이드
			System.out.println(data);
			System.out.println();
		}
	}
}