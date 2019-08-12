package Xercise; 

public class VIPCustomer extends Customer {
/*
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
*/	
	private int agentID;	// VIP 위해 추가 : VIP고객 담당 상담원 아이디
	double saleRatio;		// VIP 적용 할인율
	
	public VIPCustomer() {
		customerGrade = "VIP";		// 등급
		bonusRatio = 0.05;				// 적립
		saleRatio = 0.1;						// 할인
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public int getAgentID() {		// VIP 고객에게 필요한 부분
		return agentID;
	}
	
	public StringBuilder showVIPInfo() {
		StringBuilder sb = new StringBuilder();
			sb.append(super.showCustomerInfo());
			sb.append("담당 상담원 아이디는 ");
			sb.append(agentID);
			sb.append(" 입니다.");		
		return sb;
	}
	
}
