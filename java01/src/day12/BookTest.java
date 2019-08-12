package day12;

public class BookTest {

	public static void main(String[] args) {

		String msg1 = "Hello";
		String msg2 = "Hello";
		System.out.println(msg1.toString());	//tostring 만든적 없지만 object가 갖고있기 때문에 소환
		System.out.println(msg2);
		
		System.out.println(msg1.equals(msg2));		
		
		Book b1 = new Book("Java", 2200); 
		Book b2 = new Book("Java", 2200);
		System.out.println(b1.toString()); //그냥 찍어버리니 day12.Book@15db9742... 가 나와 값이 ㅏ니라 주소가 나오지 왜? 레퍼런스형이니까, 그리고 시스아웃 찍엇을 땐 tostring 생략.
		System.out.println(b1.equals(msg1)); // 내용 같은데 false로 나오네; 객체비교(레퍼런스)는 equals, 기본형은 ==. 만든적도 없는데 제공되네? object가 줬어
		System.out.println(b2);
		
		b1.close();
		b2.close();
		
		b1 = null;
		b2 = null;
	
		//System.gc();
		
		System.out.println("=== main end ===");
		
	}

}


