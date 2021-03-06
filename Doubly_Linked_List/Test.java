/*
 * Testing our doubly linked list implemenation
 * 	1. Testing isEmpty method
 * 	2. Testing addToHead method
 * 	3. Testing addToTail method
 * 	4. Testing printList method
 * 	5. Testing search method
 * 	6. Testing deleteHead method
 * 	7. Testing deleteTail method
 * 	8. Testing delete method
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
		/* Deleting a node from anywhere in the list */
		System.out.println("Deleting a node with info of 5");
		list.delete(6);
		list.printList();
	}
}
