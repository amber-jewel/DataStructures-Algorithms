package nw.amber.simplesorting;

public class Example03InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort insertion = new InsertionSort(20);
		
		//insertion.insert(23);
		//insertion.insert(12);
		//insertion.insert(89);
		insertion.insert(45);
		insertion.insert(30);
		
		insertion.display();
		insertion.insertionSort();
		insertion.display();
	}

}

class InsertionSort {
	private long[] arr;
	private int nElems;
	
	public InsertionSort(int size) {
		arr = new long[size];
		nElems = 0;
	}
	
	public void insert(long value) {
		arr[nElems] = value;
		nElems++;
	}
	
	public void insertionSort() {
		for (int out = 1; out < nElems; out++) {
			long temp = arr[out];
			int in = out;
			while (in > 0 && arr[in - 1] >= temp) {
				arr[in] = arr[in - 1];
				in--;
			}
			arr[in] = temp;
		}
	}
	
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}
