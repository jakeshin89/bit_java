package day23;

public class Test08 {

	public static void main(String[] args) {
		
		//System.out.println(Thread.MAX_PRIORITY); //10
		//System.out.println(Thread.MIN_PRIORITY); //1
		//System.out.println(Thread.NORM_PRIORITY);//5
		//try {
		//	Thread.sleep(5000);
		//} catch (InterruptedException e) {
		//	e.printStackTrace();
		//}

		System.out.println("Main Start\n");
		//Thread.yield(); //무시
		System.out.println(Thread.currentThread());

		//스레드 생성
		Job1 j1 = new Job1();
		Thread t1 = new Thread(j1, "job1");
		
		Job2 j2 = new Job2();
		Thread t2 = new Thread(j2, "job2");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//스레드 실행대기Que에 넣음
		System.out.println("홀수합 + 짝수합 = "+(j1.sum+j2.sum));
		System.out.println("\nMain End");
		
	}

}

class Job1 implements Runnable{
// 가상의 cpu 위에 올려 작동시키려면 runnable 해야 함

	int sum = 0;
	public void run() {
		
		for(int i=1 ; i<100 ; i=i+2) {
			sum += i;
			System.out.print(Thread.currentThread()+"  ");
			System.out.println("1 부터 "+i+"까지의 홀수의 합 : "+sum);
		}	
	}	
}

class Job2 implements Runnable{

	int sum = 0;
	public void run() {
		
		for(int i=0 ; i<100 ; i=i+2) {
			sum += i;
			System.out.print(Thread.currentThread()+"  ");
			System.out.println("0 부터 "+i+"까지의 짝수의 합 : "+sum);
		}	
	}	
}
class T1 extends Thread{

	int sum = 0;
	public void run() {
		
		for(int i=1 ; i<100 ; i=i+2) {
			sum += i;
			System.out.print(Thread.currentThread()+"  ");
			System.out.println("1 부터 "+i+"까지의 홀수의 합 : "+sum);
			Thread.yield();
		}	
	}	
}

class T2 extends Thread{

	int sum = 0;
	public void run() {
		
		for(int i=0 ; i<100 ; i=i+2) {
			sum += i;
			System.out.print(Thread.currentThread()+"  ");
			System.out.println("0 부터 "+i+"까지의 짝수의 합 : "+sum);
		}	
	}	
}
