package generics;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		System.out.println("This is stack:");
		System.out.println();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println();

		Stack<String> stackS = new Stack<>();
		stackS.push("One");
		stackS.push("Two");
		stackS.push("Three");

		
			System.out.println(stackS.pop());
			System.out.println(stackS.pop());
			System.out.println(stackS.pop());

			System.out.println(stackS.pop());
			System.out.println(stackS.pop());
		

		Dequeue<Integer> dequeue = new Dequeue<>();

		dequeue.addLast(21);
		dequeue.addLast(22);
		dequeue.addLast(23);
		dequeue.addLast(24);
		dequeue.addLast(25);
		dequeue.addFirst(13);
		dequeue.addFirst(12);
		dequeue.addFirst(11);

		System.out.println();
		System.out.println("This is queue:");
		System.out.println();

	

			System.out.println();
			System.out.println("It is pollFirst");
			System.out.println(dequeue.pollFirst());
			System.out.println(dequeue.pollFirst());
			System.out.println(dequeue.pollFirst());
			System.out.println(dequeue.pollFirst());
			System.out.println("It is pollLast");
			System.out.println(dequeue.pollLast());
			System.out.println(dequeue.pollLast());
			System.out.println(dequeue.pollLast());
			System.out.println(dequeue.pollLast());
			System.out.println(dequeue.pollLast());
			System.out.println(dequeue.pollLast());
			System.out.println();

		
		Dequeue<String> ds = new Dequeue<>();

		ds.addFirst("one");
		ds.addFirst("zero");
		ds.addLast("some number");
		

		
			System.out.println();
			System.out.println("This is queue:");
			System.out.println();
			System.out.println(ds.pollFirst());
			System.out.println(ds.pollLast());
			System.out.println(ds.pollLast());
			System.out.println(ds.pollFirst());
			System.out.println(ds.pollFirst());
			System.out.println();
		
	}

}
