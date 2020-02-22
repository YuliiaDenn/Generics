package generics;

public class Dequeue<D> {
	

	private class Node<N> {

		Node<N> next;
		Node<N> prev;
		N data;

		Node(N data, Node<N> prev, Node<N> next) {

			this.next = next;
			this.data = data;
			this.prev = prev;
		}
	}

	Node<D> head;
	Node<D> tail;

	public void addLast(D data) {
		Node<D> node;

		if (tail == null) {
			node = new Node<D>(data, null, null);

			head = node;
			tail = node;

		} else {
			node = new Node<D>(data, tail, null);

			tail.next = node;
			node.prev = tail;
			tail = node;
		}

	}

	public void addFirst(D data) {
		Node<D> node;

		if (head == null) {
			node = new Node<D>(data, null, null);

			head = node;
			tail = node;

		} else {
			node = new Node<D>(data, null, head);

			head.prev = node;
			node.next = head;
			head = node;
		}

	}

	public D pollFirst() {

		D result = head.data;

		if (head.next == null) {
			head = tail;
			result = head.data;
			head = null;
			return result;

		} else {
			head = head.next;
			head.prev = null;
			return result;
		}

	}

	public D pollLast() {

		D result = tail.data;

		if (tail.prev == null) {
			tail = head;
			result = tail.data;
			tail = null;
			return result;

		} else {
			tail = tail.prev;
			tail.next = null;
			return result;
		}
	}

}
