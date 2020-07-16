package circularqueu_array;


/***
 * 
 * @author Tanzeel
 * This is the implementation of Circular Queues using arrays.
 *
 */

public class MyCircularQueue_Arrays {
	private int size;
	private int front;
	private int rear;
	private int Queue[];
	private boolean isInitial = true;
	
	public MyCircularQueue_Arrays(){
		size = 0;
		front = 0;
		rear = 0;
		Queue = new int[0];
	}
	
	public MyCircularQueue_Arrays(int size) {
		this.size = size;
		this.front = 0;
		this.rear = 0;
		this.Queue = new int[size];
	}
	
	public boolean enque(int data) {
		if(isFull())
			return false;
		
		if(isInitial)
			isInitial = false;
		
		if(rear == size - 1)
			rear = -1;
			
		rear++;
		Queue[rear] = data;
		return true;
	}
	
	public int dequeue() {
		if(this.isEmpty())
			return -1;
		
		if(front == size - 1)
			front = -1;
		
		this.front++;
		int dequeued = this.Queue[front];
		this.Queue[front] = 0;
		
		return dequeued;
	}
	
	private boolean isFull() {
		if(isInitial)
			return false;
		
		if(rear == size - 1 && front == 0)
			return true;
		
		if(front == rear+1)
			return true;
		
		return false;
	}
	
	public void print() {
		for(int i = 0; i < size; i++)
			System.out.print(this.Queue[i] + " ");
	}
	
	public boolean isEmpty() {
		if(isInitial)
			return false;
		return front == rear;
	}
}
