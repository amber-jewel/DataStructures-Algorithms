package nw.amber.array;

public class Example04OrderedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrdArray arr = new OrdArray(100);
		
		arr.insert(32);
		arr.insert(12);
		arr.insert(98);
		arr.insert(189);
		arr.insert(23);
		
		arr.display();
		
		int key = 12;
		if (arr.findByBinarySearch(key)) {
			System.out.println("Found " + key);
		} else {
			System.out.println("Couldn't find " + key);
		}
		
		key = 12;
		if (arr.delete(key)) {
			System.out.println("Deleted " + key);
		} else {
			System.out.println("Couldn't delete " + key);
		}
		
		arr.display();
	}

}

class OrdArray {
	private long[] a;
	private int nElems;
	
	public OrdArray(int size) {
		a = new long[size];
		nElems = 0;
	}
	
	public void insert(long value) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (a[i] > value) {
				break;
			}
		}
		for (int k = nElems; k > i; k--) {
			a[k] = a[k - 1];
		}
		a[i] = value;
		nElems++;
	}
	
	public boolean findByBinarySearch(long key) {
		int lowerBound = 0;
		int upperBound = nElems - 1;
		int curIn;
		
		while (true) {
			curIn = (lowerBound + upperBound) / 2;
			if (a[curIn] == key) {
				return true;
			} else if (lowerBound > upperBound) {
				return false;
			} else {
				if (a[curIn] > key) {
					upperBound = curIn - 1;
				} else {
					lowerBound = curIn + 1;
				}
			}
		}
	}
	
	public boolean delete(int key) {
		for (int i = 0; i < nElems; i++) {
			if (a[i] == key) {
				for (int k = i; k < nElems - 1; k++) {
					a[k] = a[k + 1];
				}
				nElems--;
				return true;
			}
		}
		return false;
	}
	
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
}
