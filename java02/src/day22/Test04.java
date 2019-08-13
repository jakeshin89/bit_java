package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {

	public static void main(String[] args) {
		
		String src ="C:\\Users\\user\\Desktop\\lib\\Ben.mp3";
		FileInputStream fis = null;
		FileOutputStream fos = null;

		System.out.println("파일 복사 시작합니다.");

		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("C:\\Users\\user\\Desktop\\lib\\BenCopy4.mp3", false);
			
			int read = 0; //횟수겠지?
			int count = 0;

			byte[] buffer = new byte[1024*1024];
			//적당한 사이즈로 잘라주기, 용량이 늘어났네
			
			while ((read = fis.read(buffer)) != -1) {
				System.out.println("read : "+read);
				// 3번은 꽉 채웠는데, 4번째는 못채움
				fos.write(buffer, 0, read);
				// 다 못쓴만큼 잘라줘
				count++;
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