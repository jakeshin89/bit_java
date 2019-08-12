package day12;

public abstract class Animal { //추상클래스

	protected String kind = "동물의 종류";

	public Animal() { }
	
	public Animal(String kind) {
		super();
		this.kind = kind;
	} 

	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}

	public abstract void breath() ; // 선언부만 있고 구현부는 없는 추상 메소드. 바디 없는 미완성의 코드
	
	public void print() {
		System.out.printf("Animal kind : %s", kind);	
	}
	
}