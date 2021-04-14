package linkedlists;

public class Node {
	int data;
	Node next = null;
	
	public static int listLength(Node aNode) {
		int length = 0;
		
		Node currentNode = aNode;
		while(currentNode != null) {
			length++;
			currentNode = currentNode.next;
		}
		return length;
	}
}
