package nw.amber.array;

public class Example03HighArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HighArray arr = new HighArray(100);
		
		arr.insert(11);
		arr.insert(22);
		arr.insert(33);
		arr.insert(44);
		arr.insert(55);
		
		arr.display();
		
		System.out.println(arr.getNElem());
		
		int key = 110;
		if (arr.find(key)) {
			System.out.println("Found " + key);
		} else {
			System.out.println("Couldn't find " + key);
		}
		
		key = 44;
		if (arr.delete(key)) {
			System.out.println("Deleted " + key);
		} else {
			System.out.println("Couldn't delete " + key);
		}
		
		arr.display();
	}

}

class HighArray {
	private long[] a;
	private int nElems;
	
	public HighArray(int size) {
		a = new long[size];
		nElems = 0;
	}
	
	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}
	
	public boolean find(long key) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (key == a[i]) {
				return true;
			}
		}
		/*
		 * if (i == nElem) { return false; } else { return true; }
		 */
		return false;
	}
	
	public boolean delete(long key) {
		// int i;
		for (int i = 0; i < nElems; i++) {
			if (key == a[i]) {
				// break;
				for (int k = i; k < nElems - 1; k++) {
					a[k] = a[k + 1];
				}
				nElems--;
				return true;
			}
		}
		/*
		if (i == nElem) {
			return false;
		} else {
			for (int k = i; k < nElem - 1; k++) {
				a[k] = a[k + 1];
			}
			nElem--;
			return true;
		}
		*/
		return false;
	}
	
	public int getNElem() {
		return nElems;
	}
	
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
}
