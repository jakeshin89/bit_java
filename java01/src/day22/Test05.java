package day22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05 {

	public static void main(String[] args) {
		
		String src ="C:\\Users\\user\\Desktop\\lib\\Ben.mp3";

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		System.out.println("파일 복사 시작합니다.");
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("C:\\Users\\user\\Desktop\\lib\\BenCopy5.mp3", false);
			
			bis = new BufferedInputStream(fis); //src를 읽은 fis를 버퍼링 해주떼여
			bos = new BufferedOutputStream(fos);
			//buffer는 가득차야지 보내는구나
			
			int read = 0;
			int count = 0;

			while((read = bis.read()) != -1) {
				//@return the next byte of data, or <code>-1</code> if the end of the stream is reached.
				bos.write(read);
			}
			
			bos.flush();
			
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