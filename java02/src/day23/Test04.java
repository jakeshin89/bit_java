package day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Test04 {

	public static void main(String[] args) {
		
		String filename = "data.obj";
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(filename);
			ois = new ObjectInputStream(fis);
			
			System.out.println("Data Object Read");
			String name = (String) ois.readObject();
			Date date = (Date) ois.readObject();

			System.out.println("Read "+name);
			System.out.println("Read "+date);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(fis != null) fis.close();
				if(ois != null) ois.close();
			} catch (Exception e2) {
			e2.getStackTrace();
			}
		}
		System.out.println("Main End");
	}

}
/*
try {
	
} catch (Exception e) {
	System.out.println(e.getMessage());
} finally {
	try {
		if(fis != null) fis.close();
		if(oos != null) oos.close();
	} catch (Exception e2) {
	e2.getStackTrace();
	}
}
System.out.println("Main End");
}
*/