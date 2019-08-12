package day13;

public class Test03 {

	public static void main(String[] args) {
		Shape c1 = new Circle(new Point(5, 5), 3);
		System.out.println(c1);
		System.out.println(c1.area());
		((Drawable)c1).draw();

	}

}
// tostring을 overriding 안해서 .... 그래서 주소가 떴던 것. 어젠가 그러지 않았나? 