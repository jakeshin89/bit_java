package day10;

public class Test01 {

	public static void main(String[] args) {
	
		System.out.println("Java ProgRammIng".equals("java progRamING"));
		System.out.println("Java ProgRammIng".equals("JAVA progRaming"));
		System.out.println("Java ProgRammIng".equalsIgnoreCase("Java Programming"));
		System.out.println("Java ProgRammIng");
		System.out.println("Java ProgRammIng");
		System.out.println("Java ProgRammIng".contains("Java"));
		System.out.println("Java ProgRammIng".toLowerCase().contains("Java ProgRammING"));
		System.out.println("Java ProgRammIng".toLowerCase().contains("JAVA".toLowerCase()));

	}

}
