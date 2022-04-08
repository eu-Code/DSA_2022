/*
 * Testing queue impelementation
 */
class TestQueue{
	public static void main(String[] args){
		Queue queue = new Queue(5);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.dequeue();
		queue.enqueue(9);
		System.out.println("The top element is:"+queue.topEl());
	}
}
