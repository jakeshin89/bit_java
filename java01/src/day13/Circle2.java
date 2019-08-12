package day13;

public class Circle2 extends Shape implements Drawable {
	//원의 중점 표현하기 위해 변수 설정, 근데 xy 표현한 클래스 있네?
	//Circle은 Point이다(is a) 관계가 아닌, Circle은 Point의 점을 가지고 있다(has a)
	//int x;
	//int y;
	//얘 부모는 둘이 될 수 있
	
	int r;
	
	Point p;  //has a 관계

	public Circle2() {
		p = new Point(0, 0);
	}
	
	public Circle2(Point p, int r) {
		super();
		this.p = p;
		this.r = r;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Circle2 [p=" + p + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
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
		Circle2 other = (Circle2) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		return true;
	}

	@Override
	public void draw() {
		System.out.println(getClass().getName()+"Draw");		
	}

	@Override
	double area() {
		return 0;
	}
	
}
