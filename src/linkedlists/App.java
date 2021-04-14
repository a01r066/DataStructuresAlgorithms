package linkedlists;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node nodeA = new Node();
		nodeA.data = 4;
		
		Node nodeB = new Node();
		nodeB.data = 3;
		
		Node nodeC = new Node();
		nodeC.data = 7;
		
		Node nodeD = new Node();
		nodeD.data = 8;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		
		System.out.println("List length nodeA: "+ Node.listLength(nodeA));
		System.out.println("List length nodeB: "+ Node.listLength(nodeB));
	}

}
