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
		/* adding a node to the head of the list */
		System.out.println("Adding a node with info of 6 to the head of the list");
		list.addToHead(6);	
		/* checking if the list is still empty */
		System.out.println("Is the list still empty: "+list.isEmpty());
	}
}
