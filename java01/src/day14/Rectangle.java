package day14;

public class Rectangle extends Shape{

	Point p;
	int width;
	int height;
	
	public Rectangle() {
		super();
	}

	public Rectangle(Point p, int width, int height) {
		super();
		this.p = p;
		this.width = width;
		this.height = height;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() { //자꾸 주소가 찍힌다, 그러면 toString이 제대로 오버라이딩 안되었음.
		return "Rectangle [p=" + p + ", width=" + width + ", height=" + height + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		result = prime * result + width;
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
		Rectangle other = (Rectangle) obj;
		if (height != other.height)
			return false;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	@Override
	public void move(int m) {
		p.setX(p.getX()+m); //이게 이해가 잘 안갑니다만...
		p.setY(p.getY()+m);
	}

	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}

	@Override
	double area() {
		return width*height;
	}
	
}