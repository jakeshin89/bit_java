package day12;

public abstract class Shape { //abstract 붙이면 객체생성 불가

	protected double area;
	private String name;
	
	public Shape() {
		super();
		//this(); 이거 써도 돼. 밑에 네임 찍고 슈퍼로 감
	}
	
	public Shape(String name) {
		super();
		this.name = name;
	}

	public Shape(String name, double area) {
		super();
		this.area = area;
		this.name = name;
	}

	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void calculationArea();
	
	public void print() {
		System.out.println(name+"의 면적은 "+area);
	}
	
}
