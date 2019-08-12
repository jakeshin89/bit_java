package day02.ex;

public class Prob1 {
	public static void main(String s[]) {
		int tom = -1;
		char marry = '9'; // 문자니까 char
		boolean john = false;
		String sarah = "Sarah Jang"; //sarah 찍었더니 sarah jang이 나오니 그대로 찍어줘야
		System.out.println( "our friends..\n"
		+ tom + ", " + marry + ", " + john + " and " + sarah );
		
		System.out.printf("our friends..\n%d, %c, %b and %s",tom,marry,john,sarah); // , 이후 변수   
		// %d(int), %c(char), %b(boolean), %s(string)
		// 잘 모르겠따... 싶으면 %s(string)으로 가도 돼
	}
	
}

//our friends..
//-1, 9, false and sarah jang