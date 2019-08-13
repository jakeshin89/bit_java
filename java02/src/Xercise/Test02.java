package Xercise;

public class Test02 {
	public static void main(String[] args) {
		
	System.out.println("Main Start");
	
	String msg = null;
	
	try {
		System.out.println(msg.charAt(3));
		int num = Integer.parseInt(msg);
	} catch (NullPointerException e) {
		System.out.println("예외발생 : "+e.getMessage());
	} catch (StringIndexOutOfBoundsException e) {		//index
		System.out.println("예외발생 : "+e.getMessage());
	} catch (NumberFormatException e){							//null
		System.out.println("예외발생 : "+e.getMessage());
	} finally {
		System.out.println("Finally : 자원반납코드");
	}
	
	System.out.println("Main End");	
		
		
		
	}
}
