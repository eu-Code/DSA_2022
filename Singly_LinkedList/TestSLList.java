/*
 * Test program for our linked list impelementation
 * Here are some of the operations we are going to test in this program
 *	1. Testing if the list is empty or not
 *	2. Testing adding a node to the head of the list
 *	3. Testing adding a node to the tail of the list
 *	4. Testing printing the whole list
 *	5. Testing for search method
 *	6  Testing delete head method
 *	7. Testing delte from tail method
 */
class TestSLList{
	public static void main(String[] args){
		/* Declaring an empty linked list*/
		SLList linkedList = new SLList();
		/* Let's print the result of isEmpty() */
		System.out.println("Is empty "+ linkedList.isEmpty());
		/* Adding a node with info of 5 to the tail of the linked list */
		linkedList.addToTail(5);
		linkedList.addToHead(4);
		linkedList.addToTail(7);
		linkedList.addToHead(9);
		/* Checking if the list is still empty */ 
		System.out.println("Is our list still empty "+linkedList.isEmpty());
		/* Printing the list */
		linkedList.printList();
		/* Testing search method */
		System.out.println("Is 6 in the list: "+ linkedList.search(6));
		System.out.println("Is 9 in the list: "+ linkedList.search(9));
		/* Testing deleteHead method */
		linkedList.deleteHead();
		System.out.println("Printing the list after its head got deleted");
		linkedList.printList();
		/* Testing deleteTail method */
		linkedList.deleteTail();
		System.out.println("Printing the list after its tail got deleted");
		linkedList.printList();	
	}
}
