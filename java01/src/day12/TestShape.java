package day12;

public class TestShape {

	public static void main(String[] args) {
		Shape[] shape = new Shape[2];		//이건 객체생성 절대 ㄴㄴ 객체생성은 () ←이거 있어야. 이건 배열 2개 생성이지;;
		
		shape[0] = new Circle("원", 10);		//하나는 슈퍼영역, 하나는 radius영역 크으..
		shape[1] = new Rectangular("직사각형", 10, 20);
		
		for (int i=0 ; i < shape.length; i++) {
			shape[i].calculationArea();
			shape[i].print();
		}
		
	}

}
