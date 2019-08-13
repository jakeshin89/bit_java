package Xercise;

public class MyStack {

	int[] stack;
	int top = 0;
	
	public MyStack() {
		stack = new int[10];
	}

	public MyStack(int size) {
		if(size < 0) stack = new int[10];
		else stack = new int[size];
	}	
	
	
	public void push(int element) {
		if(isFull()) return;
		stack[top] = element;
		top++;
	}
	
	public boolean isEmpty() {
		return top == 0 ? true : false;
	}
	
	public boolean isFull() {
		return top == stack.length ? true : false;
	}
	
	public int peek(){
		if(isEmpty()) return -1;
		return stack[top];
	}
	
	public int pop() {
		if(isEmpty()) return -1;
		return stack[--top];
	}
	
}
