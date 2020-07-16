package mymain;

import circularqueu_array.MyCircularQueue_Arrays;

public class MyMain {
	public static void main(String args[]) {
		MyCircularQueue_Arrays mcqa = new MyCircularQueue_Arrays(5);
		
		System.out.println(mcqa.enque(2));
		System.out.println(mcqa.enque(3));
		System.out.println(mcqa.enque(4));
		System.out.println(mcqa.enque(5));
		System.out.println(mcqa.dequeue());
		System.out.println(mcqa.dequeue());
		System.out.println(mcqa.dequeue());
		System.out.println(mcqa.isEmpty());
		System.out.println(mcqa.enque(6));
		System.out.println(mcqa.enque(6));
		System.out.println(mcqa.enque(6));
		System.out.println(mcqa.dequeue());
		System.out.println(mcqa.dequeue());

		mcqa.print();
	}
}
