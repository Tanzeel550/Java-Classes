package mymain;

import queu_array.QueuArray;

public class MyMain {
	public static void main(String args[]) throws Exception {

		QueuArray qa = new QueuArray(5);
		qa.enque(10);
		qa.enque(11);
		qa.enque(12);
		qa.enque(13);
		System.out.println(qa.deque());
		System.out.println(qa.deque());
		System.out.println(qa.deque());

		qa.print();
	}
}
