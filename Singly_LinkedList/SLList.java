/*
 * Singly linked list implementation based on
 * an integer node.
 */
class SLList{
	/*
	* Declaring head and tail nodes
	*/
	Node head, tail;
	/*
	* Initializing both head and tail nodes to null or creating an empty list.
	*/
	public SLList(){
		this.head = this.tail = null;
	}
	/*
	* Return 
	*	1. true if the list is empty 
	* 	2. false if the list is not empty
	*/
	public boolean isEmpty(){
		return this.head == null;
	}
	/*
	 * Adding a node to the head of the list
	 * This inlcudes adding a node
	 * 	1. to an empty linked list
	 * 	2. to non empty linked list
	 * in both of the above cases we are creating a node with its next set too null
	 * then we will update the head to this newly created node.
	 */
	public void addToHead(int info){
		/* creating a node with its next set to null*/
		Node node = new Node(info);
		/* adding a node to a non empty list*/
		if(!isEmpty()){
			node.next = this.head;
			this.head = node;
		}
		/* adding a node to an empty list */
		else{
			this.head = this.tail = node;
		}
	}
	/*
	 * Adding a node to the tail of the list
	 * This includes adding a node
	 * 	1. to an empty linked list
	 * 	2. to non empty linked list
	 * in both of the above cases we are creating a node with its net set to null
	 * then we will update the tail to this newly created node.
	 */
	public void addToTail(int info){
		/* Creating a node with its next set to null */
		Node node = new Node(info);
		/* Adding a node to the tail of non empty list */
		if(!isEmpty()){
			this.tail.next = node;
			this.tail = node;
		}
		/* Adding a node to the tail of an empty list */
		else{
			this.head = this.tail = node;
		}
	}
	/*
	 * Printing the list from a head to tail
	 */
	public void printList(){
		System.out.println("Printing the whole list");
		for(Node temp = this.head; temp!=null; temp=temp.next){
			System.out.println(temp.info);
		}
	}
	/*
	 * Search for the existence of a node given its info
	 */
	public boolean search(int info){
		for(Node temp = this.head; temp!=null; temp=temp.next){
			/* Return true when reaching at the given node */
			if(temp.info==info) return true;
		}
		/* If it reached the end of the list that means 
		 * the given node doesn't exist in the list
		 * then it will return false
		 */
		return false;
	}
}	
