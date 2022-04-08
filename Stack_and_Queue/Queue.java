/*
 * Sinlgy linked list based queue impelementation
 */

class Queue{
	/*
	 * Defining top and bottom pointer attributes
	 */
	private Node top, bottom;
	/*
	 * Defining a variable to store the size of the queue
	 */
	private int size;
	/*
	 * Definging a variable to store the number of items in the queue
	 */
	private int items = 0;
	/*
	 * A constructor which can accept size as a pram
	 */
	public Queue(int size){
		this.size = size;
		this.top = this.bottom = null;
	}
	/*
	 * Checking if the queue is empty or not
	 */
	public boolean isEmpty(){
		return this.top == null;
	}
	/*
	 * Checking if the queue is full or not
	 */
	public boolean isFull(){
		return this.items == this.size;
	}
	/*
	 * Returning the size of the queue
	 */
	public int itemsCount(){
		return this.items;
	}
	/*
	 * Enqueue an element to the queue
	 */
	public boolean enqueue(int info){
		// check if the queue is not full
		if(!this.isFull()){
			Node node = new Node(info);
			if(this.isEmpty()){
				this.top = this.bottom = node;
			}
			else{
				this.bottom.next = node;
				this.bottom = node;
			}
			this.items+=1;
			return true;
		}
		// if the queue is full
		return false;
	}
	/*
	 * Dequeue an element from the queue
	 */
	public boolean dequeue(){
		//  dequeue if the queue is not empty
		if(!this.isEmpty()){
			this.top = this.top.next;
			this.items-=1;
			return true;
		}
		// return false if the queue is empty
		return false;
	}
	/*
	 * Checking the top of the queue/ the first element of the queue
	 */
	public int topEl(){
		// if the queue is not empty return the info stored at the top
		if(!this.isEmpty()) return this.top.info;
		// else return -1
		return -1;
	}
}
