/*
 * A class to test basic operations of BST
 * 	1. Testing isEmpty
 * 	2. Testing insert
 */
class TestBST{
	public static void main(String[] args){
		BST bst = new BST();
		System.out.println("Is the BST empty: "+bst.isEmpty());
		// inserting a node to an empty BST
		bst.insert(4);
		System.out.println("Is the BST still empty: "+bst.isEmpty());
		// inserting a node to a non-empty BST
		bst.insert(7);
	}
}
