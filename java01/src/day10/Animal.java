package day10;

public class Animal {

	protected String kind = "동물의 종류";	//접근지정자 디폴트->protected->디폴트 해봄

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

	public void breath() {
		System.out.println(kind + " : 폐로 숨쉰다.");
	}

	public void print() {
		System.out.printf("Animal kind : %s", kind);
		
	}
	
}