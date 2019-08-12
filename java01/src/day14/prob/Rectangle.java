package day14.prob;

public class Rectangle extends Shape implements Resizable{

	private double width;
	private double height;
	
	public Rectangle(double w, double h) {
		super(4); // Shape쪽 기본생성자 문제 처리
		this.width = w;
		this.height = h;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {		
		return this.width*this.height;
	}

	@Override
	public void resize(double s) {
		//System.out.println("new area : "+(this.width*s)*(this.height*s));
		this.width = width*s;
		this.height = height*s;
	}
	
}
