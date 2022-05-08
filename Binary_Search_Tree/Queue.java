/*
 * A queue implementation specifically made to store BSTNodes.
 */

class Queue{
	private Node front, rare;
	private int items = 0;
	public Queue(){
		this.front = this.rare = null;
	}
	
	public boolean isEmpty(){
		return this.front == null;
	}
	
	public int itemsCount(){
		return this.items;
	}
	
	public boolean enqueue(BSTNode info){
		Node node = new Node(info);
		if(this.isEmpty()){
			this.front = this.rare = node;
		}
		else{
			this.rare.next = node;
			this.rare = node;
		}
		this.items+=1;
		return true;
	}
	
	public BSTNode dequeue(){
		if(!this.isEmpty()){
			BSTNode node = this.front.info;
			this.front = this.front.next;
			this.items-=1;
			return node;
		}
		return null;
	}
	
	public BSTNode topEl(){
		if(!this.isEmpty()) return this.front.info;
		return null;
	}
}
