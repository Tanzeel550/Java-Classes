/**
 * 
 */
/**
 * @author Tanzeel
 * 
Initially front and rear will be at 0. We will not start from -1. 

Insertion:
	Inserting one element, rear will move one next (rear++) And we will insert that element at rear.
	Now, front will be empty. Yes, it should be. Wherever front is pointing it should be empty.
	After filling all the elements, rear will reach at the end of queue i.e rear will become equal to size-1.

Deletion:
	Now deleting the elements, front will move one next (front++) and we will delete that item i.e set item to 0. The deleted item will be returned from the function.
	Now lets say I have dequeued 2 elements from the queue. Now the three spaces will be free. But we will never use 1 space.

Again Insertion:
rear is at the end of the queue. Bring it to the start and insert the element there. We can perform this step once more because we only have one space behind (one is for front). Then rear will move in normal fashion. Just rear++. 

Again Deletion:
For deletion, front will also move in the same manner as rear moved.


When queue is full:
-> rear will be at the end of the queue (rear == size - 1) and front will be at 0.
-> rear will be one behind the front (front = rear+1)

When queue is empty:
-> isInitial should be false.
-> rear should be equal to front.


 *
 */
module MyCircularQueue {
}