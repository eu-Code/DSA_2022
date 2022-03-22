/*
 * implementing singly linked list
 */
class SLList{
	// head and tail node
	Node head, tail;
	//
	public SLList(){
		this.head = this.tail = null;
	}
	// implementing isEmpty()
	public boolean isEmpty(){
		return this.head == null;
	}
}
