package nw.amber.simplesorting;

public class Example01_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bubble = new BubbleSort(50);
		
		bubble.insert(90);
		bubble.insert(89);
		bubble.insert(23);
		bubble.insert(45);
		bubble.insert(78);
		bubble.insert(60);
		
		bubble.display();
		
		bubble.bubbleSort();
		
		bubble.display();
	}

}

class BubbleSort {
	private long[] arr;
	private int nElems;
	
	public BubbleSort(int size) {
		arr = new long[size];
		nElems = 0;
	}
	
	public void insert(long value) {
		arr[nElems] = value;
		nElems++;
	}
	
	public void bubbleSort() {
		for (int outer = nElems - 1; outer > 0; outer--) {
			for (int inner = 0; inner < outer; inner++) {
				if (arr[inner] > arr[inner + 1]) {
					swap(inner, inner + 1);
				}
			}
		}
	}
	
	private void swap(int one, int two) {
		// TODO Auto-generated method stub
		long temp = arr[one];
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
