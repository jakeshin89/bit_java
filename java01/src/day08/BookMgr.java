package day08;

import day09.Book;

public class BookMgr {
	
	Book[] booklist = {
			
			new Book("Java Program", 26000),
			new Book("JSP Program", 28000),
			new Book("SQL Fundamentals", 30000),
			new Book("JDBC Program", 24000),
			new Book("EJB Program", 27000),
			
	};
	
	public void printBookList() {
		System.out.println("=== 책 목록 ===");
		for (int i = 0; i < booklist.length; i++) {
			System.out.println(booklist[i].getTitle()); 
		}
		System.out.println();
	}
	
	public void printTotalPrice() {
		int sum = 0;	//초기값 설정해야 여기서부터 더해감
		System.out.println("=== 책 가격의 총합 ===");
		for (int i = 0; i < booklist.length; i++) {
			sum += booklist[i].getPrice();
		}
		System.out.println("전체 책 가격의 합 : "+sum);
	}

	/*	
	public addBook() {
			
	}
*/	

	public static void main(String[] args) {
		
		BookMgr a = new BookMgr();
		
		a.printBookList();
		a.printTotalPrice();
			
	}
	
}