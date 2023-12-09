package nw.amber.linkedlist;

public class Example02_DoubleEndedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleEndedLikedList obj = new DoubleEndedLikedList();
		
		System.out.println(obj.isEmpty());
		
		obj.insertFirst(11);
		obj.insertFirst(22);
		obj.insertFirst(33);
		
		System.out.println(obj.isEmpty());
		
		obj.displayList();
		
		obj.insertLast(44);
		obj.insertLast(55);
		obj.insertLast(66);
		
		obj.displayList();
		
		obj.deleteFirst();
		
		obj.displayList();
		
		long key = 559;
		if (obj.findByKey(key) != null) {
			System.out.println("Found :" + key);
		} else {
			System.out.println("Couldn't find :" + key);
		}
		
		//obj.displayList();
		
		key = 66;
		if (obj.deleteByKey(key) != null) {
			System.out.println("Deleted :" + key);
		} else {
			System.out.println("Couldn't delete :" + key);
		}
		
		obj.displayList();
	}

}

class Eg_02_Link {
	public long dData;
	public Eg_02_Link next;
	
	public Eg_02_Link(long d) {
		dData = d;
	}
	
	public void displayLink() {
		System.out.print(dData + " ");
	}
}

class DoubleEndedLikedList {
	private Eg_02_Link first;
	private Eg_02_Link last;
	
	public DoubleEndedLikedList() {
		first = null;
		last = null;
	}
	
	public void insertFirst(long d) {
		Eg_02_Link newLink = new Eg_02_Link(d);
		if (isEmpty()) {
			last = newLink;
		}
		newLink.next = first;
		first = newLink;
	}
	
	public void insertLast(long d) {
		Eg_02_Link newLink = new Eg_02_Link(d);
		if (isEmpty()) {
			first = newLink;
		} else {
			last.next = newLink;
		}
		last = newLink;
	}
	
	public Eg_02_Link findByKey(long key) {
		Eg_02_Link current = first;
		while (current.dData != key) {
			if (current.next == null) {
				return null;
			} else {
				current = current.next;
			}
		}
		return current;
	}
	
	public Eg_02_Link deleteByKey(long key) {
		Eg_02_Link current = first;
		Eg_02_Link previous = first;
		
		while (current.dData != key) {
			if (current.next == null) {
				return null;
			} else {
				previous = current;
				current = current.next;
			}
		}
		if (current == first) {
			last = null;
			first = first.next;
		} else {
			previous.next = current.next;
		}
		return current;
	}
	
	public long deleteFirst() {
		long temp = first.dData;
		if (first.next == null) {
			last = null;
		}
		first = first.next;
		return temp;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void displayList() {
		Eg_02_Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
