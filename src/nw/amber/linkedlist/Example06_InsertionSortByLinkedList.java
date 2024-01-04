package nw.amber.linkedlist;

public class Example06_InsertionSortByLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSortByLinkedList obj = new InsertionSortByLinkedList();
		
		System.out.println(obj.isEmpty());
		
		int size = 10;
		
		Eg_06_Link[] arr = new Eg_06_Link[size];
		for (int i = 0; i < size; i++) {
			int n = (int) (Math.random() * 99);
			arr[i] = new Eg_06_Link(n);
		}
		
		System.out.print("Unsorted array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i].data + " ");
		}
		System.out.println("");
		
		obj = new InsertionSortByLinkedList(arr);
		
		for (int i = 0; i < size; i++) {
			arr[i] = obj.remove();
		}
		
		System.out.print("Sorted :");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i].data + " ");
		}
		
	}

}

class Eg_06_Link {
	public long data;
	public Eg_06_Link next;
	
	public Eg_06_Link(long d) {
		data = d;
	}
	
	public void displayLink() {
		System.out.print(data + " ");
	}
}

class InsertionSortByLinkedList {
	private Eg_06_Link first;
	
	public InsertionSortByLinkedList() {
		first = null;
	}
	
	public InsertionSortByLinkedList(Eg_06_Link[] arr) {
		first = null;
		for (int i = 0; i < arr.length; i++) {
			insert(arr[i]);
		}
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insert(Eg_06_Link link) {
		Eg_06_Link current = first;
		Eg_06_Link previous = null;
		
		while (current != null && link.data > current.data) {
			previous = current;
			current = current.next;
		}
		
		if (previous == null) {
			first = link;
		} else {
			previous.next = link;
		}
		
		link.next = current;
	}
	
	public Eg_06_Link remove() {
		Eg_06_Link temp = first;
		first = first.next;
		return temp;
	}
}


