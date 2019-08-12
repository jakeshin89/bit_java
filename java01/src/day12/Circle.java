package day12;

public class Circle extends Shape{

	private double radius;

	public Circle() {
		super();
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(String superkind, double radius) {
		super(superkind);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculationArea() {
		double a = this.radius*this.radius;
		super.area = a*Math.PI;
	}
	
}
