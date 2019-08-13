package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner scan = null;
		
		try {
			scan = new Scanner(new File("c://lib//sample.txt"));
			while(scan.hasNextLine()) { //읽을 라인 있는 동안 계속 읽어
				String[] data = scan.nextLine().replace('_', '/').split("/");
				System.out.println(Arrays.toString(data));
			}
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(scan != null) scan.close();
			scan=null;
			System.out.println("자원반납수행");
			//scan.close(); //throws block 없기 때문에 굳이 에워쌀 필요 없음
		}
		
		System.out.println("Main End");
	}
}
