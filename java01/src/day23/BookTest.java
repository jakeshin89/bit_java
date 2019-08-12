package day23;

public class BookTest {

	public static void main(String[] args) {
		BookMgr bookmgr = new BookMgr();
		
		bookmgr.getBookList().forEach(i -> System.out.println(i));
				
		//bookmgr.add(new Book("~~~", 0));
		
		bookmgr.save();

	}

}
