package day21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookMgr_a {
	
	List<Book> list = null;
	
	public BookMgr_a( ) {
		list = new ArrayList<Book>();
	}
	
	public BookMgr_a(List<Book> list) {
		super();
		this.list = list;
	}

	int count = 0;
	
	public boolean addBook(Book book) {
		return list.add(book);
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
	
	public List<Book> searchTitleBook(String title) {
		List<Book> slist = new ArrayList<Book>();
		Iterator<Book> it = slist.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if(data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				slist.add(data);
			}
		}
		return slist;
	}
	
	public List<Book> booklist() {
		//list.forEach(i -> System.out.println(i));
		return list;
	}
	
	public void saveBook(){
		
		String filename = "BookManagement.txt";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(filename);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(new Book());
			oos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	class Autosave extends Thread {
		
		public void run() {
	        while (true) {
	        	saveBook();
	        	System.out.println("AutoSave");
	        	
	        }
	    }
	}
	
}
