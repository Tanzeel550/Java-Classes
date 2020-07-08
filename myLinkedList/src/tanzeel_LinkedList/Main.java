package tanzeel_LinkedList;


public class Main {
	
	public static void main(String args[]) {
		MyLinkedList<Integer> ll = new MyLinkedList<>();
		ll.add(10);
		ll.add(11);
		ll.add(12);
		ll.add(12);
		ll.add(12);
		
		Integer o = 12;
		
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains(11));
		System.out.println(ll.removeAll(o));
		System.out.println(ll.get(2));
		System.out.println(ll.set(1, 1000));
		System.out.println(ll.indexOf(11));
		ll.removeFirst();
		ll.print();
		
		System.out.println(ll.lastIndexOf(12));
		
//		int arr[] = ll.toArray();
//		for(int item: arr)
//			System.out.println(item);
	}
	
}
