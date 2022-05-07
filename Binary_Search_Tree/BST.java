/*
 * Binary search tree impelementation
 * 	1. Checking if a given BST is empty or not
 * 	2. Inserting a node to a binary search tree
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
	
	/*
	 * Inserting a node to a binary search tree
	 * 	1. Inserting a node to an empty BST
	 * 		- create an new leaf node and assing it as root node.
	 * 	2. Inserting a node to a non-empty BST
	 * 		- create a new leaf node
	 * 		- find a right location/parent for a newly created leaf node
	 * 		- attach newly created leaf node to its parent
	 */
	public void insert(int key){
		/*
		 * inserting a node to an empty BST
		 */
		if(this.root==null){
			this.root = new BSTNode(key);
		}
		/*
		 * Inserting a node to a non-empty BST
		 */
		else{
			/*
			 * Creating a new leaf node
			 */
			BSTNode node = new BSTNode(key);
			/*
			 * Finding a right parent for the newly created leaf node
			 */
			BSTNode p = root;
			BSTNode prev = null;
			while(p!=null){
				prev = p;
				if(p.key<key) p = p.right;
				else p = p.left;
			}
			/*
			 * Attaching a newly created node to its parent
			 */
			if(prev.key<key) prev.right = node;
			else prev.left  = node;
		}
	}

}
