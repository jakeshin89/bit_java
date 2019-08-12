package day24;

public class MyStack {

	E[] stack; //제네릭 처리, 스택에 어떤 자료형이 들어갈지 모르니
	int top = 0;
	
	public MyStack() {
		stack = (E[]) new Object[10];
	}

	public MyStack(int size) {
		if(size < 0)
			stack = (E[]) new Object[10];
		else
			stack = (E[]) new Object[size];
	}

	public void push(E element) {
		if(isFull()) {			
			return;
		} 
		stack[top] = element;
		top++;
	}
		
	public boolean isEmpty() {
		return top == 0 ? true : false;
	}
		
	public boolean isFull() {
		return top == stack.length ? true : false;
	} 
	
	public E top() {
		if(isEmpty()) return null;
		return stack[top-1];
	}
	
	public E pop() {
		if(isEmpty()) return null;
		return stack[--top];
	}
	
}
