package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test06 {
	public static void main(String[] args) {

		System.out.println("Main Start");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("c://lib//samples.txt"); //파일못찾아서 에러, 경로지정 따로 해주지 않으면 프로젝트폴더서 찾음. 파일경로는 절대적 위치로 잡아주는게 좋음
			System.out.println("파일준비완료");	//위 문장 수행하다 예외가 발생하면 여기 안거치고 바로  catch로 감
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("sample.txt 파일을 확인해주세요.");
		}	catch (Exception e) {
				e.printStackTrace();
			}
			//예외는 수행할 수 없는 상황에 발생하며, 적절한 메세지를 나타내주어야 한다.
			finally { //자원반납				
				try {
					if(fis != null) {
						fis.close();
						fis = null;
					}
					System.out.println("자원반납완료");
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			}
		
		System.out.println("Main End");

	}

}
