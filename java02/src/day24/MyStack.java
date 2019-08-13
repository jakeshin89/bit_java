package day24;

public class MyStack {

	int[] stack;
	int stacksize;
	int top = 0; 
	
	public MyStack() {
		stack = new int[10];
	}

	public MyStack(int stacksize) {
		if(stacksize < 0)
			stack = new int[10];
		else
			stack = new int[stacksize];
	}

	public synchronized void push(int element) {
		if(isFull()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stack[top] = element;
		top++;
		System.out.println("push => "+element);
		
		notifyAll();
	}
	
	public synchronized boolean isEmpty() {
		return top == 0 ? true : false;
	}
	
	public synchronized boolean isFull() {
		return top == stack.length ? true : false;
	}
	
	public synchronized int top() {
		if(isEmpty()) return -1;
		return stack[top-1];
	}
	
	public synchronized int pop() {
		if(isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int element = stack[--top];
		System.out.println("                          pop => "+element);
		notifyAll(); 
		return element;
	}
	
}
