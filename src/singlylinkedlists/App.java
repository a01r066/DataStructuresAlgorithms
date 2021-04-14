package singlylinkedlists;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertFirst(4);
		list.insertFirst(3);
		list.insertFirst(7);
		list.insertFirst(8);
		
		list.insertLast(99999);
		
		list.displayList();
		list.deleteFirst();
		list.displayList();
	}

}
