package day19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class BookMgr_a2 { //map구조<key, value>

	Map<Integer, Book> map = null;
	
	public BookMgr_a2( ) {
		map = new HashMap<Integer, Book>();
	}

	int count = 0;
	
	public void addBook(Book book) {
		map.put(book.getIsbn(), book);
	}
	
	public void deleteBook(String title) {
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer isbn = it.next();
			Book data = map.get(isbn);
			if(data.getTitle().equals(title)) {
				System.out.println(data+"삭제됩니다.");
				//map.remove(isbn);
				it.remove();
			}
		}
	}
	
	public void searchTitleBook(String title) {
		System.out.println(title+" 검색");
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer isbn = it.next();
			Book data = map.get(isbn);
			if(data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				System.out.println("검색결과 "+data);
			}
		}
	}
	
	public void printBooklist() {
		System.out.println("==== foreach 기반 Book List ====");
		//map.forEach(i -> System.out.println(i));
//		map.forEach(new BiConsumer<Integer, Book>() {
//			public void accept(Integer key, Book value) {
//				System.out.println(key+" : "+value);
//			}
//		});
		
		map.forEach((k, v) -> System.out.println(k+" : "+v));
		
		System.out.println("총 "+count+" 권");
		System.out.println("===============");
	}
	
}
