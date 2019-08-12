package day08;

public class Card {

	final static int WIDTH = 100;								//크기 바꾸면 안돼! 수정되지 않도록 하기 위해선 앞에 final ㄱㄱ
	final static int HEIGHT = 250;
	String kind = "다이아몬드";								//얘는 인스턴스 베리어블, 메모리에 안띄었잖아! 메모리에 띄어야 사용 가능핮.
	int num;	

	public static void main(String[] args) {
		//Card.WIDTH=0;											//헐 근데 누가 크게 이렇게 바꿨네;;; 봐봐 오류떴지 왜? final 박아버렸으니까
		System.out.println(WIDTH+" * "+HEIGHT);//메모리에 떠있기 때문에 
		//System.out.println(kind);						//kind를 그냥 찍어버리면 오류. 주소를 찍어야 함.
		System.out.println(new Card().kind);		// 그냥 띄을 수 없기에.. 왜냐면 메모리에 올라가야 데리고 오는데 말이지. 그래서 메모리에 띄우고 가져온거야.
	}
	
	
}