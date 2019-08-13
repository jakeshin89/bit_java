package day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Set;

public class Test06 {

	public static void main(String[] args) {
		
		String filename = "account.obj";
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(filename);
			ois = new ObjectInputStream(fis);
			
			System.out.println("Data Object Read\n");

			Set<Account> a1 = (Set<Account>) ois.readObject();
			a1.forEach(i -> System.out.println(i));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
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