package Xercise;

public class ThreadWithClass{

	
public class ExtendThread extends Thread{
	public void run() {
		for (int i=0 ; i<5; i++) {
			System.out.println(getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableThread implements Runnable{

	public void run() {
		for (int i=0 ; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}
	public static void main(String[] args) {
		

	}

}
