package day16;

public class Test03 {

	public static void main(String[] args) {
System.out.println("  Main Start  ");
		
		String msg = null; 
		msg = "xmlsdf"; 
		
		try {
			if(msg != null) System.out.println(msg.charAt(3));
			//System.out.println(msg.charAt(3));
			int num = Integer.parseInt(msg);
			
		} catch (Exception e) { //이렇게 퉁쳐버리면 안돼. 각자 상황에 맞는 적절한 걸 내놔야
			System.out.println("예외가 발생했다 : "+e.getMessage());		//null
	
		} finally {
			System.out.println("finally {자원 반납 코드}");
		}
		
		System.out.println("  Main End  ");

	}

}
