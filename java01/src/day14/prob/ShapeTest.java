package day14.prob;

public class ShapeTest {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(5, 6);
		RectTriangle rt1 = new RectTriangle(6, 2);
		
		Shape[] shapes = {r1, rt1}; // 하위클래스 resizable 상속여부
/*
		for (int i = 1; i < shapes.length; i++) {
			System.out.println("area : "+shapes[0].getArea());
			r1.resize(0.5);
			System.out.println("area : "+shapes[1].getArea());
*/
		for (Shape data : shapes) {
			System.out.println("area : "+data.getArea());
			if(data instanceof Resizable) { //사용형식 :  <검사>'자녀객체(객체)+instnaceof+<예상>부모타입(객체타입)', 
				((Resizable) data).resize(0.5);
				System.out.println("new area : "+data.getArea());
			}
			System.out.println();
		}
		//생성된 객체가 resizable하다면 data객체는 resizable 객체입니까? 라고 물어보는 것
		//instanceof : (연산자) 형변환이 가능한지 해당 여부를 true/false로 알려주는 것.
							//부모객체인지 자식 객체인지 확인하는데 쓴다.
	}
}
