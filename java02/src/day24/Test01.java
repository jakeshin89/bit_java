package day24;

import java.util.ArrayList;
import java.util.Vector;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("Main Start");
		Account account = new Account("2019001", "홍길동", 99000);
	
		Job1 j1 = new Job1(account);
		Job1 j2 = new Job1(account);
		//runnable implements한 클래스 객체생성
		
		Thread t1 = new Thread(j1, "통장");
		Thread t2 = new Thread(j1, "카드");
		
		t1.start();	//그럼 run을 돌림
		t2.start();
		
		ArrayList a;
		Vector b;
		//ArrayList synch처리 ㄴㄴ. Vector는 처리
		
		System.out.println("Main End");
		
	}

}

class Job1 implements Runnable{

	Account ac;
	//쓰레드 돌릴 객체 띄우기
	
	public Job1() { }
	public Job1(Account ac) {
		super();
		this.ac = ac;
	}

	@Override
	public void run() {
		for (int i=0 ; i<5 ; i++) {
			int money = (int)(Math.random()*7+1)*1000;
			ac.withdraw(money);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class Account{
	
	String name;
	String number;
	int money;
	
	public Account() {
		super();
	}

	public Account(String name, String number, int money) {
		super();
		this.name = name;
		this.number = number;
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", number=" + number + ", money=" + money + "]";
	}
	
	//출금
	public synchronized void withdraw(int money) {
		System.out.println("******************************");
		System.out.println(Thread.currentThread()); //Returns a reference to the currently executing thread object
		// Thread.currentThread() 객체생성 하면 [이름, 우선순위, 어디서 실행했는지]
		System.out.println("금액 "+money+"원을 출금합니다.");
		System.out.println("잔고 : "+this.money);
		if(this.money>=money) {
			this.money -= money;
			System.out.println("출금완료 : "+money);
			System.out.println("출금 후 잔고 : "+this.money);
		} else {
			System.out.println("잔액부족");
		}	
	}
}