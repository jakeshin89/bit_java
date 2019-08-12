package day11;

public class Test04 {
	public static void main(String[] args) {
		
		String msg1 = "Hello";
		String msg2 = "Hello";
		System.out.println(msg1); //toString으로 자동컨버팅
		System.out.println(msg2);
		
		Book b1 = new Book("Java", 700);
		Book b2 = new Book("Java", 700);
		System.out.println(b1.toString()); 
		//여기도 역시 쓰지 않아도 자동컨버팅. 근데 그냥 썼어. 
		System.out.println(b2);
		
	}
}


class Book extends Object{
	
	String title;
	int price;

	public Book() { }

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	@Override //주소형태가 나와서 문제가 되는 부모의 객체에서 메소드를 호출해서 오버라이딩. 자식이 잘못했으면 부모를 소환한다. 이게 세상의 이치잖아?
	public String toString() {
		return "[제목 : "+title+" / 가격 : "+price+"]";
	}
	
	
}	