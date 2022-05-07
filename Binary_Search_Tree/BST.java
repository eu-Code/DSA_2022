/*
 * Binary search tree impelementation
 * 	1. Checking if a given BST is empty or not
 * 	2. Inserting a node into a BST
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
	 * Inserting a node into a binary search tree, while inserting a node into a binary search tree we are required to consider to cases
	 * 	Case I: adding a node to an empty BST, in this case it is just creating a new BST node assingning a new created node as a root node
	 * 	Case II: adding a node to a non empty bST, here we are required to traverse through the tree and find a right location to attach this new node
	*/
	public void insert(int key){
		/*
		 * adding a node to an empty binary search tree
		 */
		if(this.root == null){
			this.root = new BSTNode(key);
		}
		/*
		 * adding a node to a non-empty binary search tree
		 */
		else{
			/* 
			 * finding a right location for the new node
			 */
			BSTNode p = root;
			BSTNode prev;
			while(p!=null){
				prev = p;
				if(p.key<key) p = p.right;
				else p = p.left;
			}
			/*
			 * attaching the new node to the tree
			 */
			if(prev.key<key) prev.right = new BSTNode(key);
			else prev.left = new BSTNode(key);

		}
	}

}
