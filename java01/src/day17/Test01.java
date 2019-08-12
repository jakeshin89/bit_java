package day17;

public class Test01 {

	public static void main(String[] args) {
		
		Book1 b1 = new Book1("Java", 900);	// T → Object
		System.out.println(b1);

		Book1<Double> b2 = new Book1<Double>("SQL", new Double(600));	//double형이니 소수점 찍거나, 
		System.out.println(b2);
		
		Book1<Integer> b3 = new Book1<Integer>("Python", 900);
		System.out.println(b3);
		
		
	}

}
