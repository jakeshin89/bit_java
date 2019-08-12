package day23;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class BookMgr {

	List<Book> list = null;
	String filename;
	
	BookMgr(){
		this("book.dat");
	}
	
	BookMgr(String filename) {
		this.filename = filename;
		list = (List<Book>) MyFile.load(filename);
		if(list == null) list = new ArrayList<Book>();
		Thread t1 = new Autosave();
		t1.start();
	}

	//CURD
	
	public void add(Book data) {
		list.add(data);
	}
	
	public List<Book> getBookList() {
		return list;
	} 
	
	public void save() {
		MyFile.save(filename, list);
	}
	
	class Autosave extends Thread {
		
		public void run() {
			while (true) {
				save();
				System.out.println("AutoSave");
				try {
					Thread.sleep(1000*60*2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
