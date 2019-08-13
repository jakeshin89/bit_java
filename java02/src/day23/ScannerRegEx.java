package day23;

import java.util.Scanner;

public class ScannerRegEx {

	public static void main(String[] args) {
		
		String str = "1 and 2 and animal and lion and tiger";
		Scanner scan = new Scanner(str);
		scan = scan.useDelimiter("\\s*and\\s*");
		//정규표현식(Regular Expression)
		// '/s'얘는 공백을 의미하고, *는 공백이 몇 개든 상관없다는 것을 의미
		
		int firstToken = scan.nextInt();
		int secondToken = scan.nextInt();
		String thirdToken = scan.next();
		String fourthToken = scan.next();
		String fifthToken = scan.next();
		System.out.printf("%d, %d, %s, %s, %s", 
				firstToken, secondToken, thirdToken, fourthToken, fifthToken);
		scan.close();
		
	}

}
