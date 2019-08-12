package day14.tv;

//호환이 안되니 규칙을 만들자
/*public class →*/ interface TV {
	//전원 on/off 이와 같이 약속하자
	public void poweron();
	public void poweroff();	
}

class STV implements TV{
	public void poweron() {
		System.out.println("STV Power On");
	}
	public void poweroff() {
		System.out.println("STV Power Off");
	}
}

//위에 약속 정했으면 해당 메소드명도 동일하게 바꿔야 함
class LTV implements TV{
	public void poweron() {
		System.out.println("LTV On");
	}
	
	public void poweroff() {
		System.out.println("LTV Off");
	}
}


class ITV implements TV{
	
	public void poweron() {
		System.out.println("ITV On");
	}
	
	public void poweroff() {
		System.out.println("ITV Off");
	}		
}