package Xercise;

import java.util.ArrayList;

public class ThreadTest01 extends Thread {

	int seq;

	public ThreadTest01(int seq) {
		this.seq = seq;
	}

	 @Override
	 public void run() {
		 System.out.println(this.seq+" thread start.");		 
		 
		 try {
			Thread.sleep(5000);
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
		 
		 System.out.println(this.seq+" thread end.");
	 }

	 
	public static void main(String[] args) {
		
		ArrayList<Thread> threads = new ArrayList<Thread>();
		
		for (int i=0 ; i<10; i++) {
			Thread t = new ThreadTest01(i);
			t.start();
			threads.add(t);
		}
		
		for (int i=0 ; i <threads.size() ; i++) {
			Thread t = threads.get(i);
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	System.out.println("main end.");
	}
}