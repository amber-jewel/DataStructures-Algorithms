package nw.amber.array;

public class Example02LowArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LowArr lowArr = new LowArr(100);
		int nElems = 0;
		int i, key;
		
		lowArr.setElem(0, 11);
		lowArr.setElem(1, 22);
		lowArr.setElem(2, 33);
		lowArr.setElem(3, 44);
		lowArr.setElem(4, 55);
		nElems = 5;
		
		for (i = 0; i < nElems; i++) {
			System.out.print(lowArr.getElem(i) + " ");
		}
		System.out.println("");
		
		key = 550;
		
		for (i = 0; i < nElems; i++) {
			if (key == lowArr.getElem(i)) {
				break;
			}
		}
		if (i == nElems) {
			System.out.println("Couldn't find " + key);
		} else {
			System.out.println("Find " + key);
		}
		
		key = 440;
		
		for (i = 0; i < nElems; i++) {
			if (key == lowArr.getElem(i)) {
				break;
			}
		}
		if (i == nElems) {
			System.out.println("Couldn't delete " + key);
		} else {
			for (int k = i; k < nElems - 1; k++) {
				lowArr.setElem(k, lowArr.getElem(k + 1));
			}
			nElems--;
		}
		
		for (i = 0; i < nElems; i++) {
			System.out.print(lowArr.getElem(i) + " ");
		}
		System.out.println("");
	}

}

class LowArr {
	private long[] a;
	
	public LowArr(int size) {
		a = new long[size];
	}
	
	public void setElem(int index, long value) {
		a[index] = value;
	}
	
	public long getElem(int index) {
		return a[index];
	}
}
