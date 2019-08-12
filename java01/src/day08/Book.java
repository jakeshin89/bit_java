package day08;

public class Book {

	private String title;
	private int price;
/*	
	public Book() {
		System.out.println("Book() call");
		this.title = "책 제목";
		this.price = 0;		
	}
*/ //이게 기본생성자
	public Book() {		}		
	public Book(String title, int price) {
		this.title = title;
		//this.price = price;
		setPrice(price);		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) {
			System.out.println("가격값이 유효하지 않습니다.");
			return;
		}
		this.price = price;
	}
	
	public void print() {
		System.out.printf("Book[%-6s : %6d]%n", title, price);
	}
}
