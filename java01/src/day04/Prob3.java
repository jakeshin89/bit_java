package day04;

public class Prob3 {

	public static void main(String[] args) {
		String sourceString = 
				"everyday we have is one more than we deserve";	
		String encodedString = 
				"";
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 

		for (int i = 0; i < sourceString.length(); i++) {
			  char c = sourceString.charAt(i);
			  if (c == ' ') {
			  } else {
				  		int tmp = c;
				  		tmp += 3;
				  			if (tmp > 122) {
				  				tmp = 97 + (tmp - 122);
				  		}
				c = (char) tmp;
			}   
			encodedString += c;
		} 		
				System.out.println("암호화할 문자열 : " + sourceString);
				System.out.println("암호화된 문자열 : " + encodedString);	
				// 프로그램 구현부 끝.
		}		
}


// xyz 처리를 해야 하는데 어떻게 하는지 전혀 모르겠슴다
// 게다 또 run하면 뒤죽박죽 결과가 나오는지... 오늘도 코린이는 웁니다..ㅠㅅㅠ