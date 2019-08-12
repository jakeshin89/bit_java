package day05;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		String msg = "Hello Java"; //이 문자열을 하나씩 배열하고싶
		String msg2 = "Everyday we have is one more than we deserve.";
		
		//char[] c = {'h', 'e', 'l'}; 이거 이렇게 일일이 입력하면 번거롭;; 양이 많아지면 어떻게 할래?

/*		
		char[] c = new char[msg.length()];				//msg 길이만큼 배열공간 새롭게 만들어라
		for (int i=0; i < msg.length(); i++) {			//msg 길이만큼 돌려서 뽑아내
				c[i] = msg.charAt(i);								//mgs에 있는 문자열, 0번째 문자부터 하나씩 뽑아내
		}
*/
		char[] cc = msg.toCharArray();					//이 문장은 위 3줄과 같은 역할
		char[] ccc = msg2.toCharArray();				//위 string 문자열 갯수만큼 char 타입으로 뽑아낸다
		cc[0] = 'Q';
		
		String ne = new String(cc); 						// char의 배열을 string으로. 이 사이는 간단하게 이동이 가능.
		
		System.out.println(msg);
		//System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(cc));
		System.out.println(Arrays.toString(ccc));
		System.out.println(ne);

		//msg. 이 쩜을 찍으면 쩜은 msg데이터 기반으로 method(기능)을 호출. 각자가 주소가 다르기 때문에 다른 값이 출력
		
	}

}
