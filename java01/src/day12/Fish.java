package day12;

public class Fish extends Animal {

	String name;
	
	public Fish() {
		super("물고기");
	}

	public Fish(String name) {
		super("물고기");
		this.name = name;
	}
	
	public Fish(String kind, String name) {
		super(kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void breath() {
		System.out.println(super.kind+" => 아가미로 숨쉰다.");	
	}

	@Override
	public String toString() {
		return "Fish [name=" + name + "]";
	}
	
}
