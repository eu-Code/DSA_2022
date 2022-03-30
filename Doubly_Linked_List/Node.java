/*
 * Doubly linked list node
 * 	1. info will store actual data
 * 	2. next will store the address of the next node
 * 	3. prev will store the address of the previous node
 */
class Node{
	/* Define node attributes */
	int info;
	Node next;
	Node prev;

	/* Define a constructor with info, next and prev as params */
	public Node(int info, Node next, Node prev){
		this.info = info;
		this.next = next;
		this.prev = prev;
	}

	/* Define a constructor with only info as a param */
	public Node(int info){
		this(info, null, null);
	}
}
