package mymain;

import mystack.MyStack;

public class MyMain {
	public static void main(String args[]) {
		MyStack<Integer> stack = new MyStack<>();
		for(int i = 0; i <= 5; i++)
			stack.push(i);
			
		int popped = stack.pop();
		System.out.println(popped);
		stack.print();
		
	}
}
