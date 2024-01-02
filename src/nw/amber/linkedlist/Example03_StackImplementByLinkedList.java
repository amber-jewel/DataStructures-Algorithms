package nw.amber.linkedlist;

public class Example03_StackImplementByLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackByLinkedList obj = new StackByLinkedList();
		
		System.out.println(obj.isEmpty());
		
		obj.push(11);
		obj.push(22);
		
		obj.displayStackList();
		System.out.println(obj.isEmpty());
		
		obj.push(33);
		obj.push(44);
		
		obj.displayStackList();
		
		obj.pop();
		obj.displayStackList();
		
	}

}

class Eg_03_Link {
	public long data;
	public Eg_03_Link next;
	
	public Eg_03_Link(long d) {
		data = d;
	}
	
	public void displayLink() {
		System.out.print(data + " ");
	}
}

class Eg_03_LinkedList {
	private Eg_03_Link first;
	
	public Eg_03_LinkedList() {
		first = null;
	}
	
	public void insertFirst(long value) {
		Eg_03_Link newLink = new Eg_03_Link(value);
		newLink.next = first;
		first = newLink;
	}
	
	public long deleteFirst() {
		Eg_03_Link temp = first;
		first = first.next;
		return temp.data;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void displayList() {
		Eg_03_Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}

class StackByLinkedList {
	private Eg_03_LinkedList linkedList;
	
	public StackByLinkedList() {
		linkedList = new Eg_03_LinkedList();
	}
	
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
	
	public void push(long v) {
		linkedList.insertFirst(v);
	}
	
	public long pop() {
		return linkedList.deleteFirst();
	}
	
	public void displayStackList() {
		linkedList.displayList();
	}
	
	
	
	
	
	
	
	
	
	
	
}
