/*
 * Binary search tree impelementation
 * 	1. Checking if a given BST is empty or not
 * 	2. Inserting a node to a binary search tree
 * 	3. Searching for a node in a binary search tree
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
	 * 	1. Inserting a node to an empty binary search tree
	 * 		- create a new leaf node and assign it as a root
	 * 	2. Inserting a node to a non-empty binary search tree
	 * 		- create a new leaf node
	 * 		- find the right parent for a newly created leaf node(we are requred to traverse through the tree starting from its root)
	 * 		- attach the newly created leaf node to its parent
	 */
	public void insert(int key){
		/*
		 * Inserting a node to an empty binary search tree
		 */
		if(this.root == null){
			this.root = new BSTNode(key);
		}
		/*
		 * Inserting a node to a non-empty binary search tree
		 */
		else{
			/*
			 * Create a new leaf node
			 */
			BSTNode node = new BSTNode(key);
			/*
			 * Find the right parent for newly created leaf node
			 */
			BSTNode temp = root;
			BSTNode parent = null;
			while(temp!=null){
				parent = temp;
				if(temp.key<key) temp = temp.right;
				else temp = temp.left;
			}
			/*
			 * Attach the newly created leaf node to its parent
			 */
			if(parent.key<key) parent.right = node;
			else parent.left = node;
		}
	}
	/*
	 * Searching for a node in a binary search tree
	 */
	public BSTNode search(int key){
		BSTNode temp = this.root;
		while(temp!=null){
			if(temp.key==key) return temp;
			else if(temp.key<key) temp = temp.right;
			else temp = temp.left;
		}
		return null;
	}

}
