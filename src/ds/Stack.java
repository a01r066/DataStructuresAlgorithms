package ds;

// LIFO - Last in first out
public class Stack {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1;
	}
	
	public void push(char j) {
		if(!isFull()) {
			top++;
			stackArray[top] = j;
		} else {
			System.out.println("stack is exceed!");
		}
	}
	
	public char pop(){
		if(!isEmpty()) {
			int oldTop = top;
			top--;
			return stackArray[oldTop];
		} else {
			System.out.println("stack is empty!");
			return '-';
		}
	}

	public char peak() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (maxSize - 1 == top);
	}
	
	
	public static String reverseString(String str) {
		int stackSize = str.length();
		Stack stack = new Stack(stackSize);
		
		for(int i = 0; i < stackSize; i++) {
			char ch = str.charAt(i);
			stack.push(ch);
		}
		
		String result = "";
		
		while(!stack.isEmpty()) {
			char ch = stack.pop();
			result += ch;
		}
		
		return result;
	}
}
