/*
 * Binary search tree impelementation
 * 	1. Checking if a given BST is empty or not
 */
public class BST{
	/*
	 * Definging the only attribute of a binary search tree which is the root node
	 */
	private BSTNode root;
	/*
	 * Defining a constructor and set root node to null
	 */
	public BST(){
		this.root = null;
	}
	/*
	 * a method to check if a given BST is empty or not
	 */
	public boolean isEmpty(){
		return this.root == null;
	}

}
