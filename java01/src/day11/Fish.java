package day11;

import day10.Animal;

public class Fish extends Animal{

	private String name;
	
	public Fish() {
		super("물고기");
	}

	public Fish(String name) {
		super("물고기");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void fishPrint() {
		System.out.printf("[%s : %s]%n", super.kind, this.name);
	}
	
	//메소드 오버라이딩 : 부모로부터 물려받은 기능을 상황에 알맞게 재정립하는 것.
	@Override // @override 이건 오버라이드가 잘 되는지 체크하는 an annotation
	//부모 클래스 뒤져봐서 같은게 있으면 적용, 없으면 에러
	public void breath() { //1.부모의 메소드 선언부 그대로 가져오기
		System.out.println(kind+" : 아가미로 숨쉰다."); //바꿀내용
	}

	@Override
	public void print() {
		//super.print(); //부모가 가진 메소드에 밑에껄 추가
		//System.out.printf("%s : %s", kind, name);
		this.print();
			}
	}	

