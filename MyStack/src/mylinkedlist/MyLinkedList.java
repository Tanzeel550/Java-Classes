package mylinkedlist;

public class MyLinkedList<E> {

	Node head;

	class Node {
		E data;
		Node next;

		Node(E e) {
			this.data = e;
			this.next = null;
		}
	}

	public MyLinkedList(E data) {
		Node to_add = new Node(data);
		this.head = to_add;
	}

	public MyLinkedList() {
		this.head = null;
	}

//		Done
	public void print(String sep) {
		if (this.head == null) {
			System.out.println("You are trying to print an EmptyStack");
			return;
		}

		Node curr_node = this.head;

		System.out.print("[");
		while (curr_node.next != null) {
			System.out.print(curr_node.data + sep);
			curr_node = curr_node.next;
		}
		System.out.println(curr_node.data + "]");

	}

//		Done
	public void print() {
		if (this.head == null) {
			System.out.println("You are trying to print an EmptyStack");
			return;
		}

		Node curr_node = this.head;

		System.out.print("[ ");
		while (curr_node.next != null) {
			System.out.print(curr_node.data + " ");
			curr_node = curr_node.next;
		}
		System.out.println(curr_node.data + " ]");

	}

//		Done
	public int size() {
		if (this.head == null)
			return 0;

		Node curr_node = this.head;
		int s = 0;
		while (curr_node.next != null) {
			curr_node = curr_node.next;
			s++;
		}
		return s + 1;
	}

//		Done
	public boolean isEmpty() {
		if (this.head == null)
			return true;
		return false;
	}

//		Done
	public boolean add(E e) {
		Node to_add = new Node(e);
		if (head == null) {
			this.head = to_add;
			return true;
		}

		Node curr_node = this.head;
		while (curr_node.next != null) {
			curr_node = curr_node.next;
		}
		curr_node.next = to_add;
		return true;
	}

//		Done	
	public void clear() {
		this.head = null;

	}

	public E get(int index) {
		if (head == null)
			return null;

		if (head.next == null)
			return head.data;

		Node curr_node = this.head;
		int curr_index = 0;

		while (curr_node.next != null) {
			if (curr_index == index - 1)
				return curr_node.data;

			curr_index++;
			curr_node = curr_node.next;
		}
		System.out.println("Index out of range.");
		return null;
	}

//		Done
	public int indexOf(E o) {

		int curr_index = 0;

		Node curr_node = this.head;

		while (curr_node.next != null) {
			if (curr_node.data == o)
				return curr_index + 1;
			curr_index++;
			curr_node = curr_node.next;
		}
		return -1;
	}

//		Done
	public int lastIndexOf(E o) {
		if (this.head == null)
			return -1;

		int pos = 0, index = 0;
		Node curr_node = this.head;

		while (curr_node.next != null) {
			if (curr_node.data == o)
				index = pos;
			curr_node = curr_node.next;
			pos++;
		}
		return index + 2;
	}

	public E remove(int index) {

		if (this.head == null)
			return null;

		if (head.next == null) {
			if (index == 1) {
				E temp = this.head.data;
				this.head = null;
				return temp;
			}
			return null;
		}

		if (index == 0)
			this.head.next = this.head.next.next;

		Node curr_node = this.head;
		int pos = 0;
		while (curr_node.next != null) {
			if (pos == index - 1) {
				E temp = curr_node.next.data;
				curr_node.next = curr_node.next.next;
				return temp;
			}
			curr_node = curr_node.next;
			pos++;
		}
		System.out.println("Index out of range.");
		return null;
	}

	public E lastData() {
		Node curr_node = this.head;
		while (curr_node.next != null)
			curr_node = curr_node.next;

		return curr_node.data;
	}
}
