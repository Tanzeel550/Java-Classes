package tanzeel_LinkedList;


public class MyLinkedList{

	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int e){
			this.data = e;
			this.next = null;
		}
	}
	
	public MyLinkedList(int data){
		Node to_add = new Node(data);
		this.head = to_add;
	}
	
	public MyLinkedList(){
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


//	Done
	public int[] toArray() {
		if(this.head == null)
			return null;
		
		int arr[] = new int[this.size()];
		int pos = 0;
		Node curr_node = this.head;
		
		while(curr_node.next != null) {
			arr[pos] = curr_node.data;
			curr_node = curr_node.next;
			pos++;
		}
		arr[pos] = curr_node.data;
		return arr;
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
	
//	Done
	public int lastIndexOf(int o) {
		if(this.head == null)
			return -1;
		
		int pos = 0, index = 0;
		Node curr_node = this.head;
		
		while(curr_node.next != null) {
			if(curr_node.data == o)
				index = pos;
			curr_node = curr_node.next;
			pos++;
		}	
		return index+2;
	}
}
