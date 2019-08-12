package day08;

public class P164_Test {

	public static void main(String[] args) {

		count c1 = new count();
		count c2 = new count();
		count c3 = new count();
		count c4 = new count();
		System.out.println(count.count);
	}

}

class count {

	int c;
	static int count;

	public count() {
			c++;
			count++;		
	}
	
}