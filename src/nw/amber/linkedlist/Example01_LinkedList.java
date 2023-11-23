package nw.amber.linkedlist;

public class Example01_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eg_01_LinkedList linkedList = new Eg_01_LinkedList();
		linkedList.insert(2, 22);
		linkedList.insert(3, 33);
		linkedList.insert(4, 44);
		
		linkedList.displayList();
		
		linkedList.deleteFirst();
		
		linkedList.displayList();
		
		while (!linkedList.isEmpty()) {
			linkedList.deleteFirst();
		}
		
		linkedList.displayList();
		
		linkedList.insert(5, 55);
		linkedList.insert(6, 66);
		linkedList.insert(7, 77);
		
		linkedList.displayList();
		
		int key = 5;
		if (linkedList.find(key) != null) {
			System.out.println("Found link: " + key);
		} else {
			System.out.println("Couldn't find the link: " + key);
		}
		
		if (linkedList.deleteByKey(key) != null) {
			System.out.println("Deleted: " + key);
		} else {
			System.out.println("Couldn't delete: " + key);
		}
		
		linkedList.displayList();
	}

}

class Eg_01_Link {
	public int iData;
	public double dData;
	public Eg_01_Link next;
	
	public Eg_01_Link(int i, double d) {
		iData = i;
		dData = d;
	}
	
	public void displayLink() {
		System.out.print("{" + iData + ", " + dData + "}");
	}
}

class Eg_01_LinkedList {
	private Eg_01_Link first;
	
	public Eg_01_LinkedList() {
		first = null;
	}
	
	public void insert(int id, double dd) {
		Eg_01_Link newLink = new Eg_01_Link(id, dd);
		newLink.next = first;
		first = newLink;
	}
	
	public Eg_01_Link deleteFirst() {
		Eg_01_Link temp = first;
		first = first.next;
		return temp;
	}
	
	public Eg_01_Link find(int key) {
		Eg_01_Link current = first;
		while (current.iData != key) {
			if (current.next == null) {
				return null;
			} else {
				current = current.next;
			}
		}
		return current;
	}
	
	public Eg_01_Link deleteByKey(int key) {
		Eg_01_Link current = first;
		Eg_01_Link previous = first;
		while (current.iData != key) {
			if (current.next == null) {
				return null;
			} else {
				previous = current;
				current = current.next;
			}
		}
		if (current == first) {
			first = first.next;
		} else {
			previous.next = current.next;
		}
		return current;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void displayList() {
		Eg_01_Link current = first;
		System.out.print("List (first --> last) ");
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
