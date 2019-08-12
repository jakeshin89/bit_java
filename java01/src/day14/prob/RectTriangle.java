package day14.prob;

public class RectTriangle extends Shape{

	private double width;
	private double height;
	
	public RectTriangle(double w, double h) {
		super(3); //기본생성자 찾아 들어가야하는데 없잖아? 없는거 이렇게 처리해주면 돼;;
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
		return (this.width*this.height)*1/2;
	}
	
}
