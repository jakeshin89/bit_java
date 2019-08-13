package day18.collection;

public class StackTest {

	public static void main(String[] args) {
		
		MyStack2 stack = new MyStack2(10);
		
		if(stack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}
		
		for (int i=1 ; i<=10 ; i++) {
			stack.push(i);
		}
		
		if(stack.isFull()) {
			System.out.println("스택이 가득 찼습니다.");
		}
		
		System.out.println("최상위 숫자 : "+stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : "+stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : "+stack.pop());
		System.out.println("");
		System.out.println(" = = 스택 리스트 = =");
		for (int i=1 ; i<=10 ; i++) {
			int num = stack.pop();
			if(num != -1) System.out.println(num);	
		}
	}
}

class MyStack2{

	int[] stack;
	int stacksize;
	int top = 0; 
	//배열의 크기는 정해졌지만, 실제 몇 개가 있는지 카운트 해야 함
	//10개가 차면 사이즈 오바
	
	public MyStack2() {
		stack = new int[10];
	}

	public MyStack2(int stacksize) {
		if(stacksize < 0)
			stack = new int[10];
		else
			stack = new int[stacksize];
	}

	public void push(int element) {
		if(isFull()) {
			System.out.println("Stack is full.");
			return;
		} //리사이징 언급 없으니 여기까지
		stack[top] = element;
		top++;
	} //가득 찬 경우가 아니면 top 위치에 데이터 넣고 top 증가
	
	//스택이 비어있는지 체크
	public boolean isEmpty() {
		return top == 0 ? true : false;
		// 아, top이 0이면 true 아니면 false 
	}
	
	//스택이 꽉 찼는지 체크
	public boolean isFull() {
		return top == stack.length ? true : false;
	} //10이라 적었지만 정확히는 입력하는 배열의 크기만큼
	
	public int top() {
		if(isEmpty()) return -1;
		return stack[top-1];
	}
	
	public int pop() {
		if(isEmpty()) return -1;
		return stack[--top];
	} //사실 이렇게 하면 꺼내도 데이터가 남아있음. 좀 더 명확하게 하려면 0으로 출력하고 나와야 함
	
}