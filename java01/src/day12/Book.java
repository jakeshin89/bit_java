package day12;

public class Book extends Object {

	private String title;
	private int price;
	
	public Book() {	}
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public Book(int price, String title) {
		super();
		this.title = title;
		this.price = price;
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
		this.price = price;
	}
	
	//컨트롤+스페이스 눌러서 오버라이드 가능한 메소드 보기
	@Override
	public String toString() {
		//스트링 빌더로 바꾸기
		StringBuilder sb = new StringBuilder();
		sb.append("Book 정보 [ title : ");
		sb.append(title);
		sb.append(", 가격 : ");
		sb.append(price);
		sb.append(" ]");
		
		//return new String(sb);
		return sb.toString();		
		//return "title : "+title+" / "+"가격 : "+price ;
	}
/*
	@Override //
	public boolean equals(Object obj) { //object 본 순간, 다운 준비해줘야해
		//b1.equals(Object obj) 이건 book과 object 클래스 비교하는거
		
		boolean result = false;

		Book b1 = (Book) obj;
		
		if (title.equals(b1.title) && price == b1.price) {
			result = true;
		} else {
			result = false;
		}
		return result;
		
	}
*/
	//ctrl 눌러서 부모 메소드 가져오기
	//비교대상 클래스 맞춰주기 (obj 클래스 맞추기)

	@Override
	public boolean equals(Object obj) {
		
		boolean flag = false;
		
		if(obj == null || !(obj instanceof Book)) {
			return false;
		}	//아닐 조건 걸어주기
		
		Book data = (Book) obj; //obj 다운캐스팅 해주기
		
		if(data.price == price && title.equals(data.title)) { //int타입 비교, string타입 비교
			flag = true;
		}
		
        return flag;
    }
	
	@Override
	protected void finalize() throws Throwable{
	//객체가 소멸되기 직전에 호출되는 메소드
	//하지만 자바에서는 사용 안하고 별도의 자원반납 기능을 만들어서 사용한다 ex) close()
		System.out.println("자원 반납 코드");
}
	
	public void close() {
		System.out.println("close() 자원반납코드");
	}
	
}