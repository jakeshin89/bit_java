package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import day17.PriceException;

public class BookTest {

	public static void main(String[] args) {

			Scanner scan = null;
			try {
				scan = new Scanner(new File("c://lib//sample.txt"));
				while(scan.hasNextLine()) { //읽을 라인 있는 동안 계속 읽어
					String[] data = scan.nextLine().replace('_', '/').split("/");
					//System.out.println(Arrays.toString(data));
					Book book = null;
					try {
						book = new Book(data[0], Integer.parseInt(data[1]));
						System.out.println(book);
					} catch (PriceException e) {
						System.out.println(e.getMessage());
					}
					System.out.println(book);
				}	
				
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				if(scan != null) scan.close();
				scan=null;
				System.out.println("자원반납수행");
			}
/*			
			Book book = new Book("Java", -90000); //음수가 들어갔어도 죽지 않아 왜? try catch 했으니
			System.out.println(book);
*/	
		System.out.println("End");
		
	}

}
// 예외는 예외고, 나머지 밑에 부분도 처리하고 싶으면 try 안에 try