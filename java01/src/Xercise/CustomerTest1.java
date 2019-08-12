package Xercise;

public class CustomerTest1 {

	public static void main(String[] args) {
	/*
		Customer customerLee = new Customer();
			customerLee.setCustomerID(10010);		//setget에서 정보입력은 set
			customerLee.setCustomerName("이순신");
			customerLee.bonusPoint = 100;				//customer에서 생성한 변수에 값 넣기. 그러면 메소드에 넣어진 이 값데로 계산, 출력
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();	//클래스 생성하고 밑에 그 클래스에 값 넣기. 클래스 만들면 그 클래스 안에 있는 기능들 다 쓸 수 있어!
			customerKim.setCustomerID(10020);
			customerKim.setCustomerName("김유신");
			customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	*/
		
		VIPCustomer customerKim = new VIPCustomer();	
			customerKim.setCustomerID(10020);
			customerKim.setCustomerName("김유신");
			customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
