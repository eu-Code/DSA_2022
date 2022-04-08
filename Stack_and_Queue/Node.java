/*
 * Defining a node with info and next attributes
 */
class Node{
	/*
	 * Defining info and next attributes
	 */
	int info;
	Node next;
	/*
	 * Let's define a constructor which can accept both info and next as parameters
	 */
	public Node(int info, Node next){
		this.info = info;
		this.next = next;
	}
	/*
	 * Let's define another constructor which can accept info as the only prameter
	 */
	public Node(int info){
		this(info, null);
	}
}
