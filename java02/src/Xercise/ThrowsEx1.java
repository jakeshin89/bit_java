package Xercise;

import java.util.Scanner;

public class ThrowsEx1 {
	
	public void setData(String n) throws NumberFormatException {
		if(n.length() >= 1) {
			String str = n.substring(0,1);
			printData(str);			
		}
	}
	
	private void printData(String n) throws NumberFormatException {
		int dan = Integer.parseInt(n);
		System.out.println(dan+"단");
		System.out.println("--------");
		for (int i=0 ; i <9 ; i++) 
			System.out.println(dan+"*"+(i+1)+"="+(dan*(i+1)));
	}
	
	public static void main(String[] args) {		
		
		ThrowsEx1 t1 = new ThrowsEx1();
		System.out.println("입력할 단 : ");
		
		try {
		t1.setData(new Scanner(System.in).next());
		} catch (NumberFormatException e) {
			System.out.println("첫 문자가 숫자가 아닙니다.");
		}
		
	}
	
	
	
	
}
