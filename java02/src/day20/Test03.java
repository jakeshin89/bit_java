package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test03 {

	public static void main(String[] args) {
		
		Properties p = new Properties();
		
		try {
			p.load(new FileInputStream("C:\\Users\\user\\Desktop\\lib\\dbinfo.txt"));
			//properties : 파일()을 읽어서() 하면 map 구조로 바꿔주는게 properties
			//특수문자로 구분자 읽을 수 있도록 해야 함
			//위 파일의 경로는 java02, 안맞아. 그래서 구체적인 경로 설정해줘서 찾게금 해야
			
			String url = p.getProperty("url"); // =을 기준으로, 왼쪽 key값을 입력하면 = 오른쪽껄 출력해줌
			System.out.println(url);
			
			String driver = p.getProperty("driver");
			System.out.println(driver);
			
			String user = p.getProperty("user");
			System.out.println(user);
			
			String pw = p.getProperty("pw");
			System.out.println(pw);
			
			//String pww = p.getProperty("pww");
			//System.out.println(pww);
			//없는걸 불러오면 null발생
			
			p.setProperty("jdkver", "1.8")
			;
			p.setProperty("oraclever", "11g");
			p.setProperty("tomcatver", "9");
			
			//xml로 저장
			p.storeToXML(new FileOutputStream("data.xml"), "DB Info");
			//p에 있는 모든 내용을 data.xml을 만들어서 저장해줘
			
		} catch (FileNotFoundException e) {
			System.out.println("dbinfo.txt 파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
