package nw.amber.linkedlist;

public class Example07_DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList obj = new DoublyLinkedList();
		
		System.out.println(obj.isEmpty());
		
		obj.insertFirst(11);
		
		System.out.println(obj.isEmpty());
		
		obj.insertFirst(22);
		obj.insertFirst(33);
		
		obj.displayForward();
		
		obj.insertLast(44);
		obj.insertLast(55);
		obj.insertLast(66);
		
		obj.displayForward();
		
		obj.displayBackward();
		
		obj.insertByKey(22, 77);
		obj.insertByKey(66, 99);
		obj.insertByKey(77, 234);
		obj.insertByKey(987, 78733);
		
		obj.displayForward();
		
		Eg_07_Link del = obj.deleteFirst();
		if (del != null) {
			System.out.println("Deleted successfully!");
		} else {
			System.out.println("Couldn't delete!");
		}
		
		obj.displayForward();
		
		del = obj.deleteLast();
		if (del != null) {
			System.out.println("Deleted successfully!");
		} else {
			System.out.println("Couldn't delete!");
		}
		
		obj.displayForward();
		
		del = obj.deleteByKey(44);
		if (del != null) {
			System.out.println("Deleted successfully!");
		} else {
			System.out.println("Couldn't delete!");
		}
		
		obj.displayForward();
	}

}

class Eg_07_Link {
	public long data;
	public Eg_07_Link next;
	public Eg_07_Link previous;
	
	public Eg_07_Link(long d) {
		data = d;
	}
	
	public void displayLink() {
		System.out.print(data + " ");
	}
}

class DoublyLinkedList {
	private Eg_07_Link first;
	private Eg_07_Link last;
	
	public DoublyLinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void displayForward() {
		Eg_07_Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	
	public void displayBackward() {
		Eg_07_Link current = last;
		while (current != null) {
			current.displayLink();
			current = current.previous;
		}
		System.out.println("");
	}
	
	public void insertFirst(long d) {
		Eg_07_Link newLink = new Eg_07_Link(d);
		if (isEmpty()) {
			last = newLink;
		} else {
			first.previous = newLink;
		}
		newLink.next = first;
		first = newLink;
	}
	
	public void insertLast(long d) {
		Eg_07_Link newLink = new Eg_07_Link(d);
		if (isEmpty()) {
			first = newLink;
		} else {
			last.next = newLink;
			newLink.previous = last;
		}
		last = newLink;
	}
		
		// boolean
	public void insertByKey(long key, long d) {
		Eg_07_Link newLink = new Eg_07_Link(d);
		Eg_07_Link current = first;
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				//return false;
				return;
			}
		}
		if (current == last) {
			newLink.next = null;
			last = newLink;
		} else {
			newLink.next = current.next;
			current.next.previous = newLink;
		}
		newLink.previous = current;
		current.next = newLink;
		//return true;
	}
	
	public Eg_07_Link deleteFirst() {
		Eg_07_Link temp = first;
		if (first.next == null) {
			last = null;
		} else {
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}
	
	public Eg_07_Link deleteLast() {
		Eg_07_Link temp = last;
		if (first.next == null) {
			first = null;
		} else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}
	
	public Eg_07_Link deleteByKey(long key) {
		Eg_07_Link current = first;
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return null;
			}
		}
		if (current == first) {
			first = current.next;
		} else {
			current.previous.next = current.next;
		}
		if (current == last) {
			last = current.previous;
		} else {
			current.next.previous = current.previous;
		}
		return current;
	}
}


















