package day23;

import java.io.RandomAccessFile;

public class Test07 {

	public static void main(String[] args) throws Exception {
		
		RandomAccessFile raf = new RandomAccessFile("rand.dat", "rw");
		//rw는 read, write 둘 다가능
		
		String msg = "Hello, RandomAccessFile";
		String result = null;
		
		raf.writeBytes(msg);
		raf.seek(0); // 포인터 위치값 설정
		while(true) {
			result = raf.readLine();
			if(result == null) break;
			System.out.println(result);
		}
		System.out.println("============");
		raf.seek(raf.length());
		msg = "\n hi java test, io test";
		raf.writeBytes(msg);
		raf.seek(7);
		while(true) {
			result = raf.readLine();
			if(result == null) break;
			System.out.println(result);
		}
		System.out.println("============");
		raf.close();
	}

}
