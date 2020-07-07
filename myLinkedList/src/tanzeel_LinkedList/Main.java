package tanzeel_LinkedList;


public class Main {
	
	public static void main(String args[]) {
		TanzeelLinkedList ll = new TanzeelLinkedList();
		ll.add(10);
		int a = 10;
		ll.add(11);
		ll.add(12);
		ll.add(13);
		
//		System.out.println(ll.size());
//		System.out.println(ll.isEmpty());
//		System.out.println(ll.contains(11));
		System.out.println(ll.remove(10));
//		System.out.println(ll.get(2));
//		System.out.println(ll.set(1, 1000));
//		System.out.println(ll.indexOf(11));
		ll.removeFirst();
		ll.print();
	}
	
}
