package nw.amber.linkedlist;

public class Example05_SortedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedLinkedList obj = new SortedLinkedList();
		
		System.out.println(obj.isEmpty());
		
		obj.insert(11);
		
		System.out.println(obj.isEmpty());
		
		obj.insert(77);
		obj.insert(22);
		obj.insert(33);
		obj.insert(88);
		
		obj.displaySortedList();
		
		obj.deleteFirst();
		
		obj.displaySortedList();
	}

}

class Eg_05_Link {
	public long data;
	public Eg_05_Link next;
	
	public Eg_05_Link(long d) {
		data = d;
	}

	public void displayLink() {
		System.out.print(data + " ");
	}
}

class SortedLinkedList {
	private Eg_05_Link first;
	
	public SortedLinkedList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insert(long d) {
		Eg_05_Link newLink = new Eg_05_Link(d);
		Eg_05_Link current = first;
		Eg_05_Link previous = null;
		
		while (current != null && d > current.data) {
			previous = current;
			current = current.next;
		}
		
		if (previous == null) {
			first = newLink;
		} else {
			previous.next = newLink;
		}
		newLink.next = current;
	}
	
	public Eg_05_Link deleteFirst() {
		Eg_05_Link temp = first;
		first = first.next;
		return temp;
	}
	
	public void displaySortedList() {
		Eg_05_Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}



