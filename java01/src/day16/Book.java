package day16;

import day17.PriceException;

public class Book {

	private String title;
	private int price;
	
	public Book() {	}											 // 여기서 예외 발생할 수 있다
	public Book(String title, int price) throws PriceException { //생성자에 걸려있는 예외처리, 생성자를 부른 곳에서 try catch 해주라는 얘기
		super();												 // 이렇게 하면 불편하긴 하지만 내가 원하는 곳 가서 에러메세지 출력할 수 있어서 생성자에서 try catch 해주는게 좋음
		this.title = title;									   	 // 예로, 회원가입시 예외상황을 클라이언츠가 봐야 하니, application(booktest)에서 해야.
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
	public void setPrice(int price) throws PriceException{	//밑에서 thorw 한걸 메소드 선언문에서 throws를 받아줌
		//if(price >0) 기존에는 이렇게 처리. throws exception 이름만 보면 무슨 예외인지 모름 그리고 Exception 이름을 맘대로 정의할 수 있음. 그러면 클래스 하나 만들어야 함.
		if(price<0) throw new PriceException("음수는 안돼"); //예외 누군가 던지고, 그랬으니 받아줘야 해
		this.price = price;
		//이 메소드는 예외가 발생(throws)할 수 있다. 언제? price가 음수라면.
		
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
}
