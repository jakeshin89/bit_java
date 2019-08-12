package day14.tv;

public class TVTest { //Low Coupling & High Cohesion

	public static void main(String[] args) {
		
		play(new STV());
		play(new LTV());	
		play(new ITV());
	}
/*	
		 user = new LTV();	//같은 user의 리모컨 (local variable) 호환이 안돼; 이걸 인터페이스가?
		 	user.poweron();
		 	user.poweroff();
		 	// 객체를 다른걸 띄워도 와 동일하게 적용되네;; 클라스 ;;
		 	// 이게 low coupling이라는데 흐음
		 	
		 user = new ITV();
		 	user.poweron();
		 	user.poweroff();
	}
*/
	public static void play(TV tv) {
			tv.poweron();
			tv.poweroff();		
	}
	
}