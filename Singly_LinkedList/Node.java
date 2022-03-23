/*
 * Implementation of an integer node
 */
class Node{
	int info;
	Node next;
	// constructor with two parameters
	public Node(int info, Node next){
		this.info = info;
		this.next = next;
	}
	// constructor witn only parameter
	public Node(int info){
		this(info, null);
	}
}
