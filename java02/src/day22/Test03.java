package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {

	public static void main(String[] args) {
		
		String src ="C:\\Users\\user\\Desktop\\lib\\Ben.mp3";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		System.out.println("파일 복사 시작합니다.");
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("C:\\Users\\user\\Desktop\\lib\\BenCopy2.mp3", false);
			
			int read = 0;
			int count = 0;
			
			//이렇게 돌렸더니 너무 느려서 butter 작동
			byte[] buffer = new byte[fis.available()];
			//한 index 안에 byte가 들어가니, 파일의 byte 수 만큼의 배열이 필요함
			//파일의 크기 만큼의 배열을 만들어줘
			//아 우항의 []은 배열의 길이지;;
			//단점은 용량, 큰 용량의 배열을 만들 수 있을까
			
			while ((read = fis.read(buffer)) != -1) {
				System.out.println("read : "+read);
				fos.write(buffer); //앞의 예제처럼 여러번 반복해서 보내는게 아니라, buffer를 통채로 보내니 buffer로 받아야 함
				count++;		   //read로 보내면 못 읽음
			}
			
			System.out.println("I/O 횟수 :"+count);
			System.out.println("파일 복사 완료");
			
		} catch (FileNotFoundException e) {
			System.out.println(src+" 파일(복사원본) 확인해주세요");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main End");
	}	
}