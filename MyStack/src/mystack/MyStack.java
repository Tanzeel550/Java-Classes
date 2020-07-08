package mystack;

import mylinkedlist.MyLinkedList;

public class MyStack <E>{
	MyLinkedList<E> ll;
	
	public MyStack(){
		ll = new MyLinkedList<>();
	}
	
	public MyStack(E data) {
		ll = new MyLinkedList<>(data);
	}
	
	public boolean push(E data) {
		return this.ll.add(data);
	}
	
	public E pop() {
		return this.ll.remove(this.ll.size()-1);
	}
	
	public E peek() {
		return ll.lastData();
	}
	
	public void print() {
		this.ll.print();
	}
	
	public boolean isEmpty() {
		return this.ll.isEmpty();
	}
	
	public int size() {
		return this.ll.size();
	}
	
	public int indexOf(E o) {
		return this.ll.indexOf(o);
	}
	
	public E get(int index) {
		return this.ll.get(index);
	}
	
	public void clear() {
		this.ll.clear();
	}
	
}
