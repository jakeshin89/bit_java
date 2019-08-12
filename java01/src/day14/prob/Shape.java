package day14.prob;

public abstract class Shape {

	private int numSides;

	public Shape(int numSides) {
		this.numSides = numSides;
	}

	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	
	public abstract double getArea();
	
}
