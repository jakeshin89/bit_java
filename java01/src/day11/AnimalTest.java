package day11;

import day10.Animal;
import day10.Dog;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal d = new Dog("진돗개", "냥냥이");
		if(d instanceof Dog) ((Dog)d).dogPrint();
	
		Fish f = new Fish("구피");
		f.fishPrint();
		f.breath(); //부모에게 기능은 물려받았지만 기능수행에 문제가 있을 수 있다. 이때 메소드 오버라이딩 해야함.
	
		//오옷! 오버라이딩말 잘해도! 이론상으론 안되는데
		
		Animal a = new Fish("다금바리");
		if(a instanceof Fish)((Fish)a).fishPrint();
		a.breath();
		
	}

}
