package circularlinkedlists;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList list = new CircularLinkedList();
		list.insertFirst(11);
		list.insertFirst(22);
		list.insertFirst(33);
		list.insertFirst(44);
		list.insertLast(9999);
		list.displayList();
		list.deleteFirst();
		list.displayList();
		
	}

}
