package day06;

public class Lab01 {

	static int abc (int k) {		
		k += 5;
		return k;               
	}
	
	public static void main(String[] args) {
            
	        int a = 10;
	        	System.out.println(a);
	        
	        a = abc(a);     
	        	System.out.println(a);
	        
	        a = abc(20);
	        	System.out.println(a);
	    }
	}