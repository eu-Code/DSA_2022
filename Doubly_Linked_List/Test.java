/*
 * Testing our doubly linked list implemenation
 * 	1. Testing isEmpty method
 * 	2. Testing addToHead method
 * 	3. Testing addToTail method
 * 	4. Testing printList method
 * 	5. Testing search method
 * 	6. Testing deleteHead method
 */
class Test{
	public static void main(String [] args){
		/* Declear an empty list */
		DoublyLinkedList list = new DoublyLinkedList();
		/* check if the list lis empty or not */
		System.out.println("Is the list empty: "+list.isEmpty());
		/* adding a node to the tail of the list */
		System.out.println("Adding nodes");
		list.addToTail(5);
		list.addToHead(4);
		list.addToHead(6);
		list.addToTail(9);
		/* printing the whole list */
		list.printList();
		/* search a node with info of 12 */
		System.out.println("Is a node with info of 12 in the list: "+list.search(12));
		/* search a node with info of 9 */
		System.out.println("Is a node with info of 9 in the list: "+list.search(9));
		/* deleting head of the list */
		list.deleteHead();	
		list.printList();
	}
}
