package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) {
		
		String src ="C:\\Users\\user\\Desktop\\lib\\Ben.mp3";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		System.out.println("파일 복사 시작합니다.");
		
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("C:\\Users\\user\\Desktop\\lib\\BenCopy1.mp3", false);
			//true : 원본+복사 = 2배, false : 원본 잃어버린 overwrite
			
			int read = 0;
			int count = 0;
			
			while ((read = fis.read()) != -1) {
				//System.out.println(read); read는 0~255까지 숫자 나옴
				fos.write(read); //숫자를 다시 변환
				count++;		 //이같은 반복을 몇 번 했는가
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