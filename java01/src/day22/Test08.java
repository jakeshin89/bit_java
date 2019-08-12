package day22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class Test08 {

	public static void main(String[] args) {
		
		Properties prop = new Properties(); //Key, Value로 자원 관리
		
		FileReader fr = null;
		
		try {		
			fr = new FileReader("C:\\Users\\user\\Desktop\\lib\\dbinfo.txt");
			prop.load(fr);
			//다 처리 가능
			
			String id = prop.getProperty("user");
			String pw = prop.getProperty("pw");
		
			System.out.println("로그인 시도 "+id+" / "+pw);
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			
		}
	}
}