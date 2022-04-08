/*
 * A singly linked list based stack impelementation
 * In this class we will implement the following methods
 * 	1. a method to check if the stack is empty or not
 * 	2. a method to check if the stack is full or not
 * 	3. a method to push an element to the stack
 * 	4. a method to pop an element from the top of the stack
 * 	5. a method to check the top of the stack
 * 	6. a method which can return the number of items in the stack
 */
 
class Stack{
	/*
	 * Definging a pointer to the top of the stack
	 */
	private Node top;
	/*
	 * Defining a variable which can store the size of our stack
	 */
	private int size;
	/*
	 * Defining a variable which can store the number of items/elements in the stack
	 */
	private int items = 0;
	/*
	 * Let's define a constructor
	 */
	public Stack(int size){
		this.size = size;
	}
	/*
	 * a method which can check if the stack is empty or not
	 */
	public boolean isEmpty(){
		return this.top == null;
	}
	/* 
	 * a method which can check if the stack is full or not
	 */
	public boolean isFull(){
		return this.items == this.size;
	}
	/*
	 * return the number of current items in the stack
	 */
	public int itemsCount(){
		return this.items;
	}
	/*
	 * A method which can push to the top of the stack
	 */
	public boolean push(int info){
		// if the stack is not full
		if(!this.isFull()){
			Node node = new Node(info);
			// pushing to an empty stack
			if(this.isEmpty()){
				this.top = node;
			}
			// pushing to a non empty stack
			else{
				node.next = this.top;
				this.top = node;
			}
			this.items+=1;
			return true;
		}
		// return false if the stack is already full
		return false;
	}
	/*
	 *  a method which can pop the top of the stack
	 */
	public boolean pop(){
		// if the stack is not empty
		if(!this.isEmpty()){
			this.top = this.top.next;
			this.items-=1;
			return false;
		}
		return false;
	}
	/*
	 *  a method which can return the top of the stack
	 */
	public int topEl(){
		// check if the stack is not empty
		if(!this.isEmpty()) return this.top.info;
		return -1;
	}
}
