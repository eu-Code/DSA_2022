/*
 * Testing our doubly linked list implemenation
 * 	1. Testing isEmpty method
 */
class Test{
	public static void main(String [] args){
		/* Declear an empty list */
		DoublyLinkedList list = new DoublyLinkedList();
		/* check if the list lis empty or not */
		System.out.println("Is the list empty: "+list.isEmpty());
	}
}
