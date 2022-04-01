/*
 * Doubly linked list implementation
 *	1. a method to check if the list is empty of not
 *	2. a method to add a node to the head of doubly linked list
 *	3. a method to add a node to the tail of doubly linked list
 *	4. a method to print the whole list
 *	5. a method to search for a node based on info
 *	6. a method to delete a node from the head of doubly linked list
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

	/*
	 * Print a list from head to tail
	 */

	public void printList(){
		for(Node temp = this.head; temp!=null; temp = temp.next){
			System.out.println(temp.info);
		}
	}
	
	/* 
	 * Search for a node in a doubly linked list based on info
	 * 	return true if the node exist
	 * 	return false if the node doesn't exist
	 */

	public boolean search(int info){
		for(Node temp = this.head; temp!=null; temp = temp.next){
			if(temp.info==info){
				return true;
			}
		}

		return false;
	}

	/* 
	 * Deleting a node from the head of doubly linked list
	 *  if the list is empty do nothing
	 *
	 *  if the list is not empty
	 *  	if the list contains only one node
	 *  		set both head and tail to null
	 *  	else if the list contains more than one node
	 *  		set the head to point to the the next of the current head
	 *  		set the prev of head to null
	 */

	public void deleteHead(){
		/* if the list is not empty */
		if(!isEmpty()){
			/* if there is only one node in the list */
			if(this.head == this.tail){
				this.head = this.tail = null;
			}
			/* if ther are more than one node in the list */
			else{
				this.head = this.head.next;
				this.head.prev = null;
			}
		}
		
	}

}
