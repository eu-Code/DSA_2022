/*
 * a node defintion for a binary search tree
 */
public class BSTNode{
	/*
	 * defining binary search tree node attributes
	 */
	public int key;
	public BSTNode right;
	public BSTNode left;
	
	/*
	 * defining a constructor with key, right and left as params
	 */
	public BSTNode(int key, BSTNode right, BSTNode left){
		this.key = key;
		this.right = right;
		this.left = left;
	}
	/*
	 * defining a constructore with key as the only prameter
	 */
	public BSTNode(int key){
		this(key,null,null);
	}
}
