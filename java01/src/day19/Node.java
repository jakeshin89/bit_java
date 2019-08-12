package day19;

public class Node<E> {

	E data;
	Node<E> next;
	// 그 다음 데이터 얘기해주기, null이면 그 다음 데이터 없음

	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
	
}
