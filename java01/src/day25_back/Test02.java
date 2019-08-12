package day25_back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Test02 { //Network Stream

	public static void main(String[] args) {

		String address = "https://www.naver.com/index.html";
		String line = null;
		
		URL url = null;
		//Text문서 한 줄씩 읽고싶어
		BufferedReader br = null;
		
		try {
			url = new URL(address);
			br = new BufferedReader(new InputStreamReader(url.openStream())); 
			//마치 System.in 같음. 네이버에서 데이터 들어올것임
			//byte단위가 char로 바뀜
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
			if(br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
