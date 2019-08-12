package day08;

public class BookMgr_a {

	private Book[] booklist;
	
	int count = 0; //지금 관리하는 책 없어. 이건 나중에 만든거야.
	
	public BookMgr_a( ) {	//기본(default)생성자함수 >_<
		this(10);	//밑에 똑같은게 있음
		//booklist = new Book[10];
	}	
	public BookMgr_a(int size) {
		booklist = new Book[size];
	}
/*
	public Book[] getBooklist() {
		return booklist;
	}
*/
	public void setBooklist(Book[] booklist) {
		this.booklist = booklist;
	}
	
	public void addBook(Book book) {
		if(count == booklist.length) {
			Book[] copy = new Book[booklist.length*2];
			System.arraycopy(booklist, 0, copy, 0, booklist.length);
			booklist = copy;			
		}
		booklist[count] = book;	//배열은 위치인덱스 중요. 어디 위치에 책을 넣을껀지 넣을 변수가 count
		count++;
	}
	
	public void printBooklist() {
		for (int i=0 ;  i<count ; i++) {
				booklist[i].print();
		}
	}
	
	public int printTotalPrice() {
		int sum = 0;
		for(int i=0 ; i<count ; i++) {
			sum += booklist[i].getPrice();
		}
		return sum;
	}
	
}
