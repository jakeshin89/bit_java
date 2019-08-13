package day18.collection;

public class Stack {

	int[] stack;
	int stacksize;
	int top = 0;
	
	public Stack() {
		stack = new int[10];
	}

	public Stack(int stacksize) {
		if(0<stacksize)
			stack= new int[10];
		this.stacksize = stacksize;
	}
	
	// peek
	
	public void push(int element) {
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}
		stack[top] = element;
		top++;
	}
	
	public int pop() {
		if(isEmpty()) return -1;
		return stack[top--];
		
	}

	public int peek() {
		if(isEmpty()) return -1;
		return stack[top-1];
	}
	
	public boolean isEmpty() {
		return top == 0 ? true : false;
	}
	
	public boolean isFull() {
		return top == stack.length ? true : false;
	}
	
}
