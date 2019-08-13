package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("c://lib//sample.txt");) {		//열만 자원반납 꼭 해줘야 하나보다. 근데 try() 안에 넣으면 자동으로 클로징 해주나보네
			System.out.println("File 처리");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {		}
		System.out.println(" - - - - - - -");
		
		try (Scanner scan = new Scanner(new File("c://lib//sample.txt"))){
			while(scan.hasNextLine()) { //읽을 라인 있는 동안 계속 읽어
				String[] data = scan.nextLine().replace('_', '/').split("/");
				System.out.println(Arrays.toString(data));
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
				
		System.out.println("End");
		
	}

}