package day19;

public class Book extends Object implements Comparable<Book>{

	private int isbn;
	private String title;
	private int price;

	public Book() { }		
	public Book(int isbn, String title, int price) {
		this.isbn = isbn;
		this.title = title;
		setPrice(price);
	}

	public int getIsbn() {
		return isbn;
	}
	
	public void setIsbn(int isbn) {
		this.isbn = isbn;
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
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + isbn;
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
		if (isbn != other.isbn)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title); //isbn - o.isbn;
	}

}
