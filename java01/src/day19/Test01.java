package day19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test01 {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();		
		for(int i=0 ; i<100 ;i++) {
			stack.push(""+i);
		}
		System.out.println(stack.pop());
		//얘를 뺄거야
		System.out.println(stack.peek());
		
		
		Queue<Integer> queue = new LinkedList<Integer>();
		//얘는 interface
		for(int i=0 ; i<100 ; i++) {
			queue.offer(i);
			//api마다 명령 다름. stack은 push, queue는 offer
		}System.out.println(queue.poll());
		
	}

}
