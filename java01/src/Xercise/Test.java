package Xercise;

public class Test {

	public static void main(String[] args) {
		char[] x = {'a', 'b', 'c'};
		char[] y = {'h', 'e', 'l', 'l', 'o'};
		
		System.arraycopy(x, 2, y, x.length, 1);
		
		for (int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		}
	}

	
	
}
