package day09;		//스트링 문자열 쪼개서 배열에 넣기

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Test01 {
	public static void main(String[] args) {

		//객체생성방법 다양
		//String msg1 = "";
		//String msg2 = new String(new char[] {'g','h'});	//힙 영역에 배열 띄울거야
		//String msg1 = ("Java Programinning/23000");
		String msg1 = JOptionPane.showInputDialog("Book 정보를 입력하세요.");
		//System.out.println(msg1);
		//JAVA Programinning/23000 슬래시 기준으로 왼쪽 오른쪽 쪼개볼거야

		//System.out.println(msg1.toUpperCase());
		//System.out.println(msg1 = msg1.toUpperCase());
		//System.out.println(msg1);	//String은 변해서 값이 나오는게 아니야. Immutable 객체. 위 항은 대입.
		
		//문자열 2개로 쪼개면 배열
		
		System.out.println(msg1);
		
		if(msg1.indexOf("/") == -1) {	//0부터 시작하는데 위치 벗어나니 슬래시가 어디에도 없는 경우
			System.out.println("슬래쉬(/)가 필요합니다.");
			System.out.println("다시 입력하세요.");
			return;
		};
		
		String[] data = msg1.split("/");	// 슬래시(/) 기준으로 좌우 쪼개어서 각 문자열들을 String 타입의 data라는 변수의 배열로 착착
		System.out.println(Arrays.toString(data));
		
		Book b1 = new Book(data[0].trim(), Integer.parseInt(data[1].trim()));	// (String title, int price) 어짜피 2개 들어왔으니 첫번째 분명 타이틀, 띄어쓰기 했을테니 없애주기
		//String을 int로 컨버트, integer.parse.. 슬래시(/) 기준으로 앞 뒤 space bar 넣었는데 이러면 인식 못함. 그래서 트림 넣어저ㅜ야 행.
		//트림은 좌우 blank 없애줌, 스트링-정수 변환에서 먼저 trim 해주고 변환 
		b1.print();
		
	}

}
