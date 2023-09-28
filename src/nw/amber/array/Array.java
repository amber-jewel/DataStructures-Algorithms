package nw.amber.array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr;
		arr = new long[100];
		int nElems = 0;
		int i;
		long key;
		
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 44;
		arr[4] = 55;
		nElems = 5;
		
		for (i = 0; i < nElems; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		
		key = 446;
		
		for (i = 0; i < nElems; i++) {
			if (key == arr[i]) {
				break;
			}
		}
		if (i == nElems) {
			System.out.println("Couldn't find " + key);
		} else {
			System.out.println("Find " + key);
		}
		
		key = 55;
		for (i = 0; i < nElems; i++) {
			if (key == arr[i]) {
				break;
			}
		}
		if (i == nElems) {
			System.out.println("Can't delete " + key);
		} else {
			for (int k = i; k < nElems - 1; k++) {
				arr[k] = arr[k + 1];
			}
			nElems--;
		}
		
		for (i = 0; i < nElems; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
