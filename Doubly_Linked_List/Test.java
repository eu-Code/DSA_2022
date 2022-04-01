/*
 * Testing our doubly linked list implemenation
 * 	1. Testing isEmpty method
 * 	2. Testing addToHead method
 */
class Test{
	public static void main(String [] args){
		/* Declear an empty list */
		DoublyLinkedList list = new DoublyLinkedList();
		/* check if the list lis empty or not */
		System.out.println("Is the list empty: "+list.isEmpty());
		/* adding a node to the tail of the list */
		System.out.println("Adding a node with info of 5 to the tail of our doubly linked list");
		list.addToTail(5);		
		/* checking if the list is still empty */
		System.out.println("Is the list still empty: "+list.isEmpty());
	}
}
