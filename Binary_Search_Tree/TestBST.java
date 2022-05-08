/*
 * Testing basic Binary Search Tree oprations
 * 	1. Testing isEmpty
 * 	2. Testing insert
 * 	3. Testing search
 * 	4. Testing preorder depth first traversing
 * 	5. Testing inorder depth first traversing
 * 	6. Testing postorder depth first traversing
 * 	7. Testing breadth first traversal
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
		bst.insert(3);
		bst.insert(9);
		// searching for a node
		if(bst.search(8)!=null) System.out.println("We found a node.");
		else System.out.println("Oops, the node that you are looking for is not in this BST");
		System.out.println("Preorder depth first traversal");
		bst.preorder(bst.root);
		// inorder depth first traversal
		System.out.println("Inorder depth first traversal");
		bst.inorder(bst.root);
		// postorder depth first traversal
		System.out.println("Postorder depth frist traversl");
		bst.postorder(bst.root);
		// breadth first traversing
		System.out.println("Breadth first traversing from left to right");
		bst.bft(bst.root);
	}
}
