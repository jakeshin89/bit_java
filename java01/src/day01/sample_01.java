package day01;

import java.util.Scanner;

public class sample_01 {		// \n:들여쓰기, \t: 옆으로

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
/*		
		System.out.println("Hello JAVA! day02!");
		System.out.print("java\n\n");
		System.out.print("DB\n");
		System.out.print("JDBC\t");
		System.out.print("Html5\t");
		System.out.println("JSP");
*/

		String name;
		int math;
		
		System.out.println("이름?");
		name = input.next();
		
		System.out.println("수학?");
		math = input.nextInt();
		
		System.out.println(name+":"+math);
		
	}
}
