package day25_back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

public class Test03 { //Network Stream

	public static void main(String[] args) {

		String address = "https://www.naver.com/index.html";
		String line = null;
		//Text문서 한 줄씩 읽고싶어
		
		URL url = null;

		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			url = new URL(address);
			br = new BufferedReader(new InputStreamReader(url.openStream())); 
				//URL생성자 파라미터에 넣은 String Address 주소와 물꼬를 틀고,
				//byte type이니 char 타입으로 바꿔주려면 InputStreamReader 해주고, 
				//InputStreamReader Creates an InputStreamReader that uses the default charset.
				//이거를 BufferedReader 해줌
			bw = new BufferedWriter(new FileWriter("naver.html"));
			//버퍼한거를 파일로 내보내기
			while((line = br.readLine()) != null) {
				System.out.println(line);
				bw.write(line+"\n");
				//마치 System.in 같음. 네이버에서 데이터 들어올것임
				//byte단위가 char로 바뀜
			}
			bw.flush();
			//즉각즉각 나가는건 flush 처리, 만약 넣으면 손실...?
			//버퍼가 차면 자동으로 flush 한다 하면 while루프 나와서
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
			if(br != null) br.close();
			if(bw != null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
}