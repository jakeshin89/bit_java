package day11;

import day10.Animal;
import day10.Dog;

public class AnimalTest02 {

	public static void main(String[] args) {

			Animal[] animals = {
					new Dog("진돗개", "쫑이"),
					new Fish("구피"),
					new Dog("말티즈", "흰둥이")
			};
		
//			for(Animal data : animals) {
//				//data.breath();
//				data.print();	
//			}
			
			Dog a1 = new Dog("진돗개", "쫑이");
			Fish f1 = new Fish("구피");
			callD(animals[0]);
			callD(animals[1]); //아핫;; 오버라이딩때문에 하단부 아가미가 나왔다
			//메소드는 하나인데 들어오는 파라미터에 따라 출력값이 달라지네yo
	}
/*	
	public static void callD(Dog d) {
		d.breath();
	} Dog 타입만 유효
	
	public static void callD(Fish d) { //이게 메소드 오버로딩
		d.breath();
	} Fish 타입만 유효
*/	
	public static void callD(Animal d) {
		d.breath(); //오버라이딩으로 피쉬는 밑에꺼 ㅏㄴ응
	}//오버로딩 했기 때문에 위에 23번째 줄이 가능함
	// Animal로 같은 개체가 뜰 것 같은데,, 오버라이딩 된 애들이 있다면 오버라이딩 된 애들 형태로 나오게 된다
	
}
