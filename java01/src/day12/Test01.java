package day12;

public class Test01 {

	public static void main(String[] args) {

		Animal[] a = {
			new Dog("시베리안허스키", "케리"),
			new Fish("구피쓰"),
			new Fish("Fish", "구피씅"), //이 생성자함수에서 첫번째 껀 superkind로
		};
		
		for(Animal data :a) {										//Object에 있는 tostring만 나오는데, 이게 밑으로 내려가서 밑에게 찍힘. 그림그리쟈
			System.out.println(data.toString()); 		//상속 언급 없어도 자동 object extends(작성한 상위클래스 기준)
			data.breath();  											//void타입이어서 안나오니 에러
			System.out.println();
		}
		
		System.out.println(rev("Java Programming"));
		
	}

	public static String rev(String d) {
		String result = ""; //뭔가 뽑아내려면 초기값 
		for(int i=d.length()-1 ; i>=0 ; i--) { //왜 15부터 시작하는가, 아 자리수?
			result += d.charAt(i);
		}	
		return result;	
	}

}
