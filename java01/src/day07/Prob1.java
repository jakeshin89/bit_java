package day07;

public class Prob1 {
	public static void main(String[] args) {

		Prob1 prob1 = new Prob1();		// leftpad;; 이걸 띄우고 사용 
		
		System.out.println(prob1.leftPad("bit", 6, '#') );
		System.out.println(prob1.leftPad("bit", 5, '$') ); 
		System.out.println(prob1.leftPad("bit", 2, '&') ); 
		}

	public String leftPad(String str, int size, char padChar) {
		/*  여기에 프로그램을 완성하십시오. */

		String result = str;
		int temp = size - result.length();
		for (int i = 0; i < temp; i++) {
				result = padChar + result;				//나와야 할 
		}
		
		return result;
				
	}

}
