package nw.amber.simplesorting;

public class Example02_SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort selection = new SelectionSort(20);
		
		//selection.insert(56);
		//selection.insert(23);
		//selection.insert(12);
		selection.insert(78);
		selection.insert(10);
		
		selection.display();
		selection.selectionSort();
		selection.display();
	}

}

class SelectionSort {
	private int[] arr;
	private int nElems;
	
	public SelectionSort(int size) {
		arr = new int[size];
		nElems = 0;
	}
	
	public void insert(int value) {
		arr[nElems] = value;
		nElems++;
	}
	
	public void selectionSort() {
		for (int out = 0; out < nElems - 1; out++) {
			int min = out;
			for (int in = out + 1; in < nElems; in++) {
				if (arr[in] < arr[min]) {
					min = in;
				}
			}
			swap(out, min);
		}
	}
	
	private void swap(int one, int two) {
		// TODO Auto-generated method stub
		int temp = arr[one];
		arr[one] = arr[two];
		arr[two] = temp;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}
