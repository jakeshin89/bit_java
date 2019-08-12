package day10;

public class AnimalTest01 {

	public static void main(String[] args) {
/*	
		Animal a1 = new Animal(); //디폴트로 먼저 생성
		a1.breath();

		Animal a2 = new Animal("개");	// 생성자 함수 이용해서 생성
		a2.breath();		
*/			
		Dog d1 = new Dog("시베리안허스키","캐리");
		d1.breath(); // 하단부에 없으니 super영역 가서 찾아옴. 처음에 "동물의 종류 : 폐로 숨쉰다." 라고 뜸
		d1.dogPrint();
		System.out.println();

		Dog d2 = new Dog("Dog", "진돗개", "쫑이");
		d2.dogPrint();
	
		Dog d3 = new Dog();
		d3.dogPrint();
		
		String animalKind = d2.getSuperkind();
		System.out.println(animalKind);

		
	}

}
