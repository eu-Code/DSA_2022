/*
 * Queue node.
 */
class Node{
	BSTNode info;
	Node next;
	
	public Node(BSTNode info, Node next){
		this.info = info;
		this.next = next;
	}
	
	public Node(BSTNode info){
		this(info, null);
	}
}
