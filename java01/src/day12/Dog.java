package day12;

public class Dog extends Animal{
	//상속만 받았는데 에러. abstract 메소드 물려받아서. 그래서 꼭 오버라이딩 해야 함
	//꼭 구현해야 할 Animal 메소드 구현 안해서 에러가 뜸

	String kind;
	String name;
	
	public Dog() {  
		super("강아지");
	}

	public Dog(String kind, String name) {
		super("강아지"); //이게 무슨역할이지? 
		this.kind = kind;
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void breath() {
		System.out.println(super.kind+" => 폐로 숨쉰다.");	
	}

	@Override
	public String toString() {
		return "Dog [kind=" + kind + ", name=" + name + "]";
	}
	
}