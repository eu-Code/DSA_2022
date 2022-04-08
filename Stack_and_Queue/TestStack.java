/*
 * Here we will test our stack impelemntation
 */
class TestStack{
	/*
	 */
	public static void main(String[] args){
		Stack stack = new Stack(5);
		stack.push(4);
		stack.push(5);
		stack.pop();
		System.out.println("the top of the stack is:"+stack.topEl());
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(11);
		stack.push(13);
		System.out.println("the number of elements in the stack is:"+stack.itemsCount());
	}
}
