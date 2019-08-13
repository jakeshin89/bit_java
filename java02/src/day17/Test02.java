package day17;

public class Test02 {

	public static void main(String[] args) {

		Book b1 = new Book("Java", 900);	// Generics 해놓고 객체생성시 타입선언 안 하면 <Object, Object>
		System.out.println(b1);
		
		Book<String, Integer> b2 = new Book<String, Integer>("Python", 500); //제너릭하고 타입선언은 한다면 이렇게
		System.out.println(b2);

		System.out.println();
		
		if (b1.getTitle() instanceof String)	//그냥 형변환 하면 위험하니 이 장치 달아주기
			System.out.println(((String)(b1.getTitle())).charAt(0)); 
		
		//System.out.println(b1.getTitle().toString().charAt(0)); 
		System.out.println(b2.getTitle().charAt(0));
		
		//Book<?, Integer> b3 = new Book<String, Integer>("Spring", 4400);
		
		Book<?, Integer> b3 = new Book<String, Integer>("Spring", 400);
		System.out.println(b3.getTitle());	// ? => Object

		Book<String, ? extends Number> b4 = new Book<String, Integer>("Spring", 400);
		System.out.println(b4.getPrice()); // ? => Number type
		
		Book<String, ? super Number> b5 = new Book<String, Object>("Spring", 400); // Number의 부모
		System.out.println(b5.getPrice()); // ? => Object
		//Book앱에서의 문제
		
	}

}