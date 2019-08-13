package day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) {
		
		//System.in inputstream 타입
		InputStreamReader ir = new InputStreamReader(System.in);
		// 키보드로 들어오는 데이터를 char타입으로 바꿔주는 역할을 함
		BufferedReader br= new BufferedReader(ir);
		
		String s = null;

		try {
			while((s = br.readLine()) != null) {
				System.out.println("Keyboard Input Data => "+s);				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ir != null); ir.close();
				if(br != null); br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
