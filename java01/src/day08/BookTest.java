package day08;

import java.util.Arrays;

import day09.Book;
import day09.BookMgr_a;

public class BookTest {

	public static void main(String[] args) {
		BookMgr_a mgr = new BookMgr_a(5);	//기본형, 10개짜리 배열 관리하는 mgr. 숫자 5 넣으면 5개 관리. 왜? 생성자 함수에서 기본형으로 했잖아~

		mgr.addBook(new Book("Java", 29000));	//배열이니, new로 해서. 위에 mgr로 정의했으니 mgr로 호출
		mgr.addBook(new Book("DB", 27000));
		mgr.addBook(new Book("SQL", 25000));
		mgr.addBook(new Book("Html5", 24000));
		mgr.addBook(new Book("JSP", 30000));

		mgr.addBook(new Book("Spring", 29000));  //5권까지만 담을 수 있거든 그래서 배열 확장해 줌
		
		//System.out.println(Arrays.toString(mgr.getBooklist()));
/*		이거 실행했더니 null을 찍을 수 없어서... getbooklist는 쓸 일이 없으니 아웃
 * 
		Book[] b = mgr.getBooklist();
		for (int i=0; i<b.length; i++) {
			b[i].print();
		}
*/				
		mgr.printBooklist();
		System.out.println("총합계 : "+ mgr.printTotalPrice());
		
		}
}