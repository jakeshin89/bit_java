package day14;


interface Drawable{
	public abstract void draw();
}
interface Moveable{ //interface 안에는 인스턴스 메소드 들어갈 수 없음 
	void move(int m); //자동으로 public abstract 처리 됨
}
interface DrawNMove extends Drawable, Moveable{
}

abstract class Shape implements DrawNMove{
	abstract double area();
}

public class Circle extends Shape implements Cloneable{
	
	public Point p;
	public int r;
	
	
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
	
	@Override
	public void move(int m) {
		//p.x = p.x+m; 이렇게 구현해야 하는데, private한 자원이니 밑에처럼 접근해야
		p.setX(p.getX()+m); //이미 출력된 값(get)을 가져와서 써야(set) 하기 때문에 
		p.setY(p.getY()+m);
	}
	
	@Override
	public Circle clone() throws CloneNotSupportedException{ //복제하다 문제 발생할 수 있어
		Circle c = (Circle) super.clone();
		Point p = c.p.clone();	//c 안에 있는 p를 복제해주세요
		c.p = p;
		return c;
		//아... 너무 생각 없이 긁었어
	}
	
} 