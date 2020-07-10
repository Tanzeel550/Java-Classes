package queu_array;

/**
 * This is the implimentation of queue using Arrays
 * @author Lenovo
 *
 */

public class QueuArray {
	int size;
	int front;
	int rear;
	int Queu[];
	
	public QueuArray() {
		this.size = 0;
		this.front = 0;
		this.rear = 0;
		this.Queu= new int[size];
	}
	
	public QueuArray(int size) {
		this.size = size;
		this.front = 0;
		this.rear = 0;
		this.Queu= new int[size];
	}
	
	public boolean enque(int data) throws Exception {
		if(isFull()) {
			throw new Exception("Queu is full. You cannot insert into full queu");
		}
		
		this.Queu[rear] = data;
		this.rear++;
		return true;
	}
	
	public int deque() {
		int queued = this.Queu[front];
		this.Queu[front] = 0;
		this.front++;
		return queued;
	}
	
	private boolean isFull() {
		if(rear == size -1)
			return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(this.front == this.rear)
			return true;
		return false;
	}
	
	public void print() {
		System.out.print("[ ");
		for(int i = front; i < rear; i++)
			System.out.print(this.Queu[i] + " ");
		System.out.println("]");
	}
	
	
	
	
	
}
