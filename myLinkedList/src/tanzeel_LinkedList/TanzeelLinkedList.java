package tanzeel_LinkedList;

import java.util.*;

public class TanzeelLinkedList{

	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int e){
			this.data = e;
			this.next = null;
		}
	}
	
	public TanzeelLinkedList(int data){
		Node to_add = new Node(data);
		this.head = to_add;
	}
	
	public TanzeelLinkedList(){
		this.head = null;
	}

//	Done
	public void print(String sep) {
		if(this.head == null) {
			System.out.println("You are trying to print an Empty LinkedList");
			return;
		}
		
		Node curr_node = this.head;
		
		while(curr_node.next != null) {
			System.out.print(curr_node.data + sep);
			curr_node = curr_node.next;
		}
		System.out.println(curr_node.data);

	}

//	Done
	public void print() {
		if(this.head == null) {
			System.out.println("You are trying to print an Empty LinkedList");
			return;
		}
		
		Node curr_node = this.head;
		
		while(curr_node.next != null) {
			System.out.print(curr_node.data + " ");
			curr_node = curr_node.next;
		}
		System.out.println(curr_node.data);
		
	}
	
//	Done
	public int size() {
		if(this.head == null)
			return 0;
		
		Node curr_node = this.head;
		int s = 0;
		while(curr_node.next != null) {
			curr_node = curr_node.next;
			s++;
		}
		return s+1;
	}

//	Done
	public boolean isEmpty() {
		if(this.head == null)
			return true;
		return false;
	}

//	Done
	public boolean contains(int o) {
		if(this.head == null)
			return false;
		
		Node curr_node = this.head;
		
		while(curr_node.next != null) {
			if(curr_node.data == o)
				return true;
			curr_node = curr_node.next;
		}
		
		if(curr_node.data == o)
			return true;
		
		return false;
	}


	
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

//	Done
	public boolean add(int e) {
		Node to_add = new Node(e);
		if(head == null) {
			this.head = to_add;
			return true;
		}
		
		Node curr_node = this.head;
		while(curr_node.next != null) {
			curr_node = curr_node.next;
		}
		curr_node.next = to_add;
		return true;
	}

//	public boolean remove(int index)
	
	public boolean removeFirst() {
		
		if(head == null) {
			System.out.println("You are trying to remove the first element of that LinkedList which is empty.");
			return false;
		}
		
		this.head = head.next;
		return true;
	}
	
	
	public boolean remove(int o){
		
		if(this.head == null){ 
			System.out.println("You are trying to remove from LinkedList which is Empty.");
			return false;
		}
		
		boolean isRemoved = false;
		Node curr_node = this.head;
		
		if(curr_node.data == o) {
			this.removeFirst();
			return true;
		}
		
		while(curr_node.next != null) {
			if(curr_node.next.data == o) {
				curr_node.next = curr_node.next.next;
				isRemoved = true;
				continue;
			}
			curr_node = curr_node.next;
		}
		
		return isRemoved;
	}

	
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean addAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean addAll(int index, Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

//	Done	
	public void clear() {
		this.head = null;
		
	}

	
	public int get(int index) {
		if(head == null)
			return -1;
		
		if(head.next == null)
			return head.data;
		
		Node curr_node = this.head;
		int curr_index = 0;
		
		while(curr_node.next != null) {
			if(curr_index == index-1)
				return curr_node.data;
			
			curr_index++;
			curr_node = curr_node.next;
		}
		System.out.println("Index out of range.");
		return -1;
	}

//	Done
	public boolean set(int index, int data) {
		if(head == null)
			return false;
		
		Node curr_node = this.head;
		int curr_index = 0;
		boolean isSet = false;
		
		if(index-1 > this.size())
			return false;
		
		while(curr_node.next != null) {
			if(curr_index == index-1) {
				curr_node.data = data;
				isSet = true;
			}
			curr_index++;
			curr_node = curr_node.next;
		}
		
		return isSet;
	}
	
//	Done
	public int indexOf(int o) {
		
		int curr_index= 0;
		
		Node curr_node = this.head;
		
		while(curr_node.next != null) {
			if(curr_node.data == o)
				return curr_index+1;
			curr_index++;
			curr_node = curr_node.next;
		}
		
		return -1;
	}

	
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public ListIterator<?> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ListIterator<?> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<?> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
