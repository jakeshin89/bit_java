package day06;

public class AnimalTest {

	public static void main(String[] args) {			//여기 main method에서는 this사용 불가. animal에선

		Animal ani = new Animal();
		
		ani.setName("큰뿔소");
		ani.setAge(3);							//char int promotion 가능
		ani.setLive(true);
		ani.display();
		
		ani.setName("펭귄");
		ani.display();
		
	
	}

}
