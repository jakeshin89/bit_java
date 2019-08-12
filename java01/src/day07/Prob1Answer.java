package day07;

public class Prob1Answer {

	public String rightpad(String str, int size, char padChar) {

		if (str.length() > size) {
			return str;				
		}

		int count = size-str.length();			//str.length 변하지 않도록 변수 생성
		for (int i = 0; i < count; i++) {				
			str = str + padChar;					//for루프 첫번째 돌고 두번째 루프에서 str length 사이즈가 4로 변함				
		}														//string에서 +연산 쓰는거 좋지 않음
				
		return str;
		
	}
	
	public String leftpad(String str, int size, char padChar) {
			if (str.length() > size) {
				return str;				
			}

			int count = size-str.length();			//str.length 변하지 않도록 변수 생성
			for (int i = 0; i < count; i++) {				
				str = padChar + str;					//for루프 첫번째 돌고 두번째 루프에서 str length 사이즈가 4로 변함				
			}
					
			return str;
	}
		
	
	public static void main(String[] args) {

		Prob1Answer p = new Prob1Answer();				//위에 있는거 쓰려면 객체생성해서 써야지

		System.out.println(p.leftpad("bit", 6,'#'));
		System.out.println(p.leftpad("bit", 5,'$'));
		System.out.println(p.leftpad("bit", 2,'&'));
		System.out.println();

		System.out.println(p.rightpad("bit", 6,'#'));
		System.out.println(p.rightpad("bit", 5,'$'));
		System.out.println(p.rightpad("bit", 2,'&'));
		
	}

}
