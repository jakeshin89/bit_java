package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyFile {

	public synchronized static void save(String filename, Object obj) {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(filename);	//파일 output할 수 있는 stream 만들어주고
			oos = new ObjectOutputStream(fos);		//객체 직렬화로 stream 변환해주고
			oos.writeObject(obj);					//Write the specified object to the ObjectOutputStream. (Object obj)
			oos.flush();
			System.out.println(obj+"객체가 "+filename+"file에 저장되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(fos != null) fos.close();
				if(oos != null) fos.close();
			} catch (IOException e){
				e.printStackTrace();
			}
		}		
	}
	
	public synchronized static Object load(String filename) {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		Object data = null;
		
		try {
			fis = new FileInputStream(filename);
			ois = new ObjectInputStream(fis);
			data = ois.readObject();
			System.out.println(filename+"파일로부터 "+data+" Load 완료");
		} catch (Exception e) {	//퉁쳐버리네
			//e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(ois != null) fis.close();
			} catch (IOException e){
				e.printStackTrace();
			}
		}
		return data;
	}
}
