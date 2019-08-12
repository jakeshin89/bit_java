package day14;

public class Point implements Cloneable{ //좌표 | implements Cloneable 이거는 복제능력스킬 찍어주기
	
	private int x;
	private int y;
	
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point (x=" + x + ", y=" + y + ")";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //클래스 네임 비교
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	//@Override	//Object 가서 오버라이딩 했다
/*	protected Point clone() throws CloneNotSupportedException{ //복제하다 문제 발생할 수 있어
		return (Point) super.clone();
	}
*/	@Override
	public Point clone() throws CloneNotSupportedException{ //복제하다 문제 발생할 수 있어
		return (Point) super.clone();
	}

}