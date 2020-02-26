package generics;

public class Stack<T> {

	private class Node<E> {

		Node<E> next;
		E data;

		Node(E data, Node<E> next) {
			this.next = next;
			this.data = data;
		}
	}

	Node<T> top;

	public void push(T data) {
		Node<T> node;
		if (top == null) {
			node = new Node<T>(data, null);
			top = node;
		} else {
			node = new Node<T>(data, top);
			top = node;
		}

	}

	public T pop() {
		Node<T> node = top;
		T result = null;
		
		try {
			if (top == null)
				throw new NullPointerException("The stack is empty!");
			top = top.next;
			result = node.data;
		} catch (NullPointerException e) {
			System.out.println();
			System.out.println(e.getMessage());
		}
		
		return result;

	}

}
