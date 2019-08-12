package day09;

public class BookMgr_a {

	private Book[] booklist;
	
	public BookMgr_a( ) {	//기본(default)생성자함수 >_<
		//booklist = new Book[10];
		this(10);	//밑에 똑같은게 있음
	}	
	public BookMgr_a(int size) {
		booklist = new Book[size];
	}
	
/* addBook때문에 굳이 필요없.
	public Book[] getBooklist() {
		return booklist;
	}
*/
	public void setBooklist(Book[] booklist) {
		this.booklist = booklist;
	}
	
	int count = 0; //책을 채우기 기다리고 있음 index 주소
	
	public void addBook(Book book) {
		if(count == booklist.length) {
			Book[] copy = new Book[booklist.length*2];
			System.arraycopy(booklist, 0, copy, 0, booklist.length);
			booklist = copy;			
		}
		booklist[count] = book;	//배열은 위치인덱스 중요. 어디 위치에 책을 넣을껀지 넣을 변수가 count
		count++;
	}
	
	public void deleteBook(String title) {	//타이틀만 넘겨주면 삭제하겠다
		for (int i=0 ; i<count ; i++) {				//count는 진짜 갯수 세는거
			if (booklist[i].getTitle().equals(title)) {
				System.arraycopy(booklist, i+1, booklist, i, count-i-1);	 //length 이해노노
				count--;	//도서 하나 삭제했으니까 
				System.out.println(title+" 도서가 삭제되었습니다.");
				return;
			}
		}
		System.out.println(title+" 도서가 없습니다.");
	}
	
	public void searchTitleBook(String title) {
		System.out.println(title+" 검색");
		for (Book data : booklist) {
			if(data==null) return;	//null 안들어가게 설계 해야함
			if(/*data != null && */data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				data.print();
			}
		}
		
		System.out.println(title+"---------------");
	}
	
	public void printBooklist() {
		System.out.println("==== Book List ====");
		for (int i=0 ;  i<count ; i++) {
				booklist[i].print();
		}
		System.out.println("총 "+count+" 권");
		System.out.println("===============");
	}
	
	public int printTotalPrice() {
		int sum = 0;
		for(int i=0 ; i<count ; i++) {
			sum += booklist[i].getPrice();
		}
		return sum;
	}
	
}
