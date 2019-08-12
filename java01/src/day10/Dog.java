package day10;

public class Dog extends Animal{

/*	Animal이 이미 가지고 있ㄴㅔ? 상속받을래. 만들 필요 없다.
	String kind;
	breath(){}
*/	
	//이건 추가로 필요해
	private String kind = "강아지 종류";
	private String name = "강아지 이름";
	
	public Dog() {
		super();		// 마치 생성자함수 같은 역할?
	}
	
	public Dog(String kind, String name) {
		super("강아지 종류"); // <=ㅇㅒ를 Animal에서 정의 안했잖아 그래서 여기서 해줘서 적용하게끔 해줘야해. 얘가 생성자함수 같은게, string 2개 넣으면 마치 animal 것처럼 안돼 ㅇㅅㅇ
		this.kind = kind;
		this.name = name;
	}
	
	public Dog(String superkind, String kind, String name) {
		super(superkind);
		//super.kind = superkind;
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
	
	public void dogPrint() {
		System.out.printf("[%s, %s, %s]%n", super.kind, this.kind, this.name);
	}
	
	public String getSuperkind() {
		return super.kind;
	}
	
	@Override
	public void print() {
		//super.print(); //부모가 가진 메소드에 밑에껄 추가
		//System.out.printf("%s : %s %n", kind, name);
		this.dogPrint();
	}
	
}
