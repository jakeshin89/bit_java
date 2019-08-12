package Xercise; 

public class Customer {	//상속

	protected int customerID;					// 고객 아이디
	protected String customerName;	// 고객 이름
	protected String customerGrade;	// 고객 등급
	int bonusPoint;								// 보너스 포인트
	double bonusRatio;						// 적립 비율
	
	public Customer() {
		customerGrade = "SILVER";		// 기본 등급 (SILVER로 디폴트했구나)
		bonusRatio = 0.01;					// 보너스 포인트 기본 적립 비율
		System.out.println("Customer() 생성자 호출");	//상위클래스 생성할 때 콘솔 출력문
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;	//보너스 포인트 계산
		return price;
	}
	
	public StringBuilder showCustomerInfo() {
		StringBuilder sb = new StringBuilder();
			sb.append(customerName);
			sb.append("님의 등급은 ");
			sb.append(customerGrade);
			sb.append("이며, 보너스 포인트는 ");
			sb.append(bonusPoint);
			sb.append("입니다.");
		
		return sb;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
