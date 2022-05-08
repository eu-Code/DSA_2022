/*
 * Binary search tree impelementation
 * 	1. Checking if a given BST is empty or not
 * 	2. Inserting a node to a binary search tree
 * 	3. Searching for a node in a binary search tree
 * 	4. preorder depth first traversal
 * 	5. inorder depth first traversal
 * 	6. postorder depth first traversal
 * 	7. breadth first traversal
 */
public class BST{
	/*
	 * Definging the only attribute of a binary search tree which is the root node
	 */
	public BSTNode root;
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
	/*
	 * A visit method
	 */
	public void visit(BSTNode node){
		System.out.println(node.key);
	}
	/*
	 * preorder depth first traversing 
	 */
	public void preorder(BSTNode node){
		if(node!=null){
			visit(node);
			preorder(node.left);
			preorder(node.right);
		}
	}
	/*
	 * inorder depth first traversing 
	 */
	public void inorder(BSTNode node){
		if(node!=null){
			inorder(node.left);
			visit(node);
			inorder(node.right);
		}
	}
	/*
	 * post order depth first traversing
	 */
	public void postorder(BSTNode node){
		if(node!=null){
			postorder(node.left);
			postorder(node.right);
			visit(node);
		}
	}
	/*
	 * Breadth first traversal
	 */
	public void bft(BSTNode node){
		Queue queue = new Queue();
		if(node!=null){
			queue.enqueue(node);
			while(!queue.isEmpty()){
				BSTNode temp = queue.dequeue();
				this.visit(temp);
				if(temp.left!=null) queue.enqueue(temp.left);
				if(temp.right!=null) queue.enqueue(temp.right);
			}
		}
	}

}
