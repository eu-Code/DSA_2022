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
	
	public boolean enqueue(int info){
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
	
	public boolean dequeue(){
		if(!this.isEmpty()){
			this.front = this.front.next;
			this.items-=1;
			return true;
		}
		return false;
	}
	
	public int topEl(){
		if(!this.isEmpty()) return this.front.info;
		return -1;
	}
}
