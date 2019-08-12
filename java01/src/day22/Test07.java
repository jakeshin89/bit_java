package day22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Test07 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader("C:\\Users\\user\\Desktop\\lib\\dbinfo.txt");
			br = new BufferedReader(fr);
			
			String id = null;
			String pw = null;
			
			String read = null;
			
			while((read = br.readLine()) != null) {
				String[] data = read.split("=");
				System.out.println(Arrays.toString(data));
				if(data[0].contentEquals("user")) id = data[1];
				if(data[0].contentEquals("pw")) pw = data[1];				
			}
			
			System.out.println("로그인 시도 "+id+"/"+pw);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) {
					fr.close();
					fr = null;
				}
				if(br != null) {
					br.close();
					br = null;
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
			
		}
		

	}

}
