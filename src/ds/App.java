package ds;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String reverseString = "";
		
//		Stack stack = new Stack(5);
//		stack.push('H');
//		stack.push('e');
//		stack.push('l');
//		stack.push('l');
//		stack.push('o');
//		stack.push(' ');
		
//		while(!stack.isEmpty()) {
//			char value = stack.pop();
//			System.out.println("stack.pop: "+ value);
//			reverseString += value;
//		}
//		
//		System.out.println(reverseString);
		System.out.println("Reverse string of Hello is: "+ Stack.reverseString("Hello"));
		
		Queue mQueue = new Queue(5);
		mQueue.insert(22);
		mQueue.insert(44);
		mQueue.insert(66);
		mQueue.insert(88);
		mQueue.insert(11);
		mQueue.insert(99);
		mQueue.insert(199);
		mQueue.insert(299);
		mQueue.insert(399);
		
		mQueue.view();
	}
}
