package day13;

//얘의 있을때와 없을 때 차이점 알아보기
abstract class Shape{	//기반코드 제공하는 것과 안 하는 것의 차이, 편안함	
	abstract double area();
}

interface Drawable{
	public abstract void draw();
}

public class Circle extends Shape implements Drawable{
/*	
	public  double circleArea(double radius) {
		double circle = radius*radius*Math.PI;
		return circle;
	}
*/
	
	Point p ;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		result = prime * result + r;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (r != other.r)
			return false;
		return true;
	}
	public Circle(Point p, int r) {
	super();
	this.p = p;
	this.r = r;
}
	int r;
	@Override
	double area() {
		return r*r*Math.PI;
	}
	@Override
	public void draw() {
		System.out.println(getClass().getName()+" 그리기");
		
	}
	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
	
} 