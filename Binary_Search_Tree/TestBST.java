/*
 * Testing basic Binary Search Tree oprations
 * 	1. Testing isEmpty
 * 	2. Testing insert
 */
class TestBST{
	public static void main(String[] args){
		// creating an empty BST
		BST bst = new BST();
		// cheking if the BST is empty or not
		System.out.println("Is the BST empty: "+bst.isEmpty());
		// inserting a node to an empty BST
		bst.insert(7);
		System.out.println("Is the BST still empty: "+bst.isEmpty());
		// inserting a node to a non-empty BST
		bst.insert(4);
	}
}
