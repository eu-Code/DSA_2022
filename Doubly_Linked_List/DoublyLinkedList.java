/*
 * Doubly linked list implementation
 *	1. a method to check if the list is empty of not
 */
class DoublyLinkedList{
	/* Declare head and tail nodes */
	Node head, tail;

	/* 
	 * Use constructor to set both head and tail to null
	 * this mean we are creating an empty list initially.
	 */
	public DoublyLinkedList(){
		this.head = this.tail = null;
	}

	/* 
	 * Define isEmpty() method, 
	 * this method will return true if head is null
	 * otherwise it will return false
	 */
	public boolean isEmpty(){
		return this.head == null;
	}

}
