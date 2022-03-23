/*
 * Test program for our linked list impelementation
 * Here are some of the operations we are going to test in this program
 *	1. Checking if the list is empty or not
 *	2. Checking adding a node to the head of the list
 *	3. Checking adding a node to the tail of the list
 */
class TestSLList{
	public static void main(String[] args){
		/* Declaring an empty linked list*/
		SLList linkedList = new SLList();
		/* Let's print the result of isEmpty() */
		System.out.println("Is empty "+ linkedList.isEmpty());
		/* Adding a node with info of 5 to the tail of the linked list */
		linkedList.addToTail(5);
		/* Checking if the list is still empty */ 
		System.out.println("Is our list still empty "+linkedList.isEmpty());
	}
}
