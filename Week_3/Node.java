/*
 * let's create a node with info and next as attributes
 */
class Node{
	int info;
	Node next;
	//defining  constructors 
	public Node(int info, Node next){
		this.info = info;
		this.next = next;
	}
	//
	public Node(int info){
		this(info, null);
	}
}
