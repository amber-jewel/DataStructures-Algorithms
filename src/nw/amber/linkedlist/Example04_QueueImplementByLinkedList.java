package nw.amber.linkedlist;

public class Example04_QueueImplementByLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImplementByLinkedList obj = new QueueImplementByLinkedList();
		
		System.out.println(obj.isEmpty());
		
		obj.insert(22);
		obj.insert(33);
		
		System.out.println(obj.isEmpty());
		obj.displayQueueList();
		
		obj.insert(44);
		obj.insert(55);
		obj.displayQueueList();
		
		System.out.println("Deleted :" + obj.delete());
		
		obj.displayQueueList();
	}

}

class Eg_04_Link {
	public long data;
	public Eg_04_Link next;
	
	public Eg_04_Link(long d) {
		data = d;
	}
	
	public void displayLink() {
		System.out.print(data + " ");
	}
}

class Eg_04_LinkedList {
	private Eg_04_Link first;
	private Eg_04_Link last;
	
	public Eg_04_LinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertLast(long value) {
		Eg_04_Link newLink = new Eg_04_Link(value);
		if (isEmpty()) {
			first = newLink;
		} else {
			last.next = newLink;
		}
		last = newLink;
	}
	
	public long deleteFirst() {
		long temp = first.data;
		if (first.next == null) {
			last = null;
		}
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		Eg_04_Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}

class QueueImplementByLinkedList {
	private Eg_04_LinkedList linkedList;
	
	public QueueImplementByLinkedList() {
		linkedList = new Eg_04_LinkedList();
	}
	
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
	
	public void insert(long v) {
		linkedList.insertLast(v);
	}
	
	public long delete() {
		return linkedList.deleteFirst();
	}
	
	public void displayQueueList() {
		linkedList.displayList();
	}
}



