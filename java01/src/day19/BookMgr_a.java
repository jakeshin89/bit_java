package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookMgr_a {

	List<Book> list = null;
	//book의 배열을 관리할게요, 제너릭으로
	
	public BookMgr_a( ) {
		list = new ArrayList<Book>();
	}	//기본생성자 하면 얘가 만들어짐 arraylist list / linkedlist, list의 자식이니 가능
	
	public BookMgr_a(List<Book> list) {
		super();
		this.list = list;
	}

	int count = 0; //책을 채우기 기다리고 있음 index 주소
	
	public void addBook(Book book) {
		list.add(book);
	}
	
	public void deleteBook(String title) {
		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if(data.getTitle().equals(title))
				System.out.println(data+" => 삭제됩니다.");
				it.remove();
		}		
	}
	
	public void searchTitleBook(String title) {
		System.out.println(title+" 검색");
		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book data = it.next();
		if(data.getTitle().toUpperCase().contains(title.toUpperCase())) {
			System.out.println(data);			}
		}
	}
	
	public void printBooklist() {
		System.out.println("==== Book List ====");
		list.forEach(i -> System.out.println(i));
		System.out.println("총 "+count+" 권");
		System.out.println("===============");
	}
	
}
