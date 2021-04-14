package ds;

// FIFO - First in First out
public class Queue {
	private int maxSize;
	private int front;
	private int rear;
	private long[] queArray;
	private int nItems;
	
	public Queue(int size) {
		this.maxSize = size;
		this.front = 0;
		this.rear = -1;
		queArray = new long[maxSize];
		nItems = 0;
	}
	
	public void insert(long j) {
		if(rear == maxSize - 1) {
			rear = -1;
		} else {
			rear++;
			queArray[rear] = j;
			nItems++;
		}
	}
	
	public long remove() {
		long temp = queArray[front];
		front++;
		if(front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}
	
	public long peakFront() {
		return queArray[front];
	}
	
	public void view() {
		System.out.print("[");
		for(int i = 0; i < queArray.length; i++) {
			System.out.print(queArray[i] + " ");
		}
		System.out.print("]");
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
}
