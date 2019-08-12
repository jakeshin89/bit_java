package day13;

public class SingletonTest {

	public static void main(String[] args) {	
		//Singleton s = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();	
		Singleton s3 = Singleton.getInstance();
	}
}

class Singleton{
	
	private static Singleton s = new Singleton();	

	private Singleton() {											//private처리하면 외부에서 객체생성 안돼. 그래서 위 Singleton s = new Singleton(); 에러;;
		System.out.println("Singleton() 생성");			//내부에서만 객체생성 가능. 그러려면 여기서 만들어서 내보내야 함
	}
	
	public static Singleton getInstance() {		//대신 얘를 설계함
		//return new Singleton();
		if(s == null) s = new Singleton();		
		return s;
	}	//객체가 비어있다면 최초로 객체를 생성하여 반환하고
}		//비어있지 않으면 그대로 반환