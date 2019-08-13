package day17;

import day16.Book;

public class BookTest {

	public static void main(String[] args) {

		Book b1 = new Book();
		b1.setTitle("Java");
		
		try {
			b1.setPrice(-9000);
		} catch (PriceException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.err.println(e.getMessage());
			//메세지 따로 적지 않으면 북앱에서 설정한걸로 나옴 
		} // throw 걸려있으니 try&catch 해줘야 함
		System.out.println(b1);
		System.out.println("- - - - - - - - -");
		
		Book b2 = null;
		
		try {
			b2 = new Book("Python", -25000);
		} catch (PriceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(b2);

	}

}
