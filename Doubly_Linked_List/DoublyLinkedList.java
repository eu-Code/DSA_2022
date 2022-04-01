/*
 * Doubly linked list implementation
 *	1. a method to check if the list is empty of not
 *	2. a method to add a node to the head of doubly linked list
 *	3. a method to add a node to the tail of doubly linked list
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
	
	/*
	 * Adding a node to the head of a doubly linked list,
	 * the steps to add a node to a head of doubly linked list are
	 * 	1. creating a new node.
	 *
	 * 	if the list is empty
	 *
	 * 		2. update both tail and head to the new node
	 *
	 * 	else if the list is not empty
	 *
	 * 		2. setting the next of the new node to the address of the current head.
	 * 		3. setting the prev of the current head to the address of the new node.
	 * 		4. updating the head  with the new node.
	 */
	public void addToHead(int info){
		/* creating a new node */

		Node node = new Node(info);

		/* if the list is not empty */
		
		if(!isEmpty()){
			node.next = this.head;
			this.head.prev = node;
			this.head = node;
		}
		/* if the list is empty */
		else{
			this.head = this.tail = node;
		}
	}
	/* 
	 * Adding a node to the tail of a doubly linked list
	 * the steps to add a node to the tail of a doubly linked list are
	 * 	1. creating a new node.
	 * 	if the list is empty
	 * 		2. update both the tail and head to point to the new node
	 * 	else if the list is not empty
	 * 		2. set the next of the current tail to point to the new node
	 * 		3. set the prev of the new node to point to the current tail
	 * 		4. set the tail to point to the new node
	 */
	public void addToTail(int info){
		/* creating a new node */
		
		Node node = new Node(info);

		/* if the list is not empty */
		if(!isEmpty()){
			this.tail.next = node;
			node.prev = this.tail;
			this.tail = node;
		}
		/* if the list is empty */
		else{
			this.head = this.tail = node;
		}

	}
}
