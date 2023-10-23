package nw.amber.stackandqueue;

public class Example06_PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq = new PriorityQueue(4);
		
		System.out.println(pq.isEmpty());
		System.out.println(pq.isFull());
		//System.out.println(pq.remove());
		//System.out.println(pq.peekMin());
		
		pq.insert(65);
		pq.insert(12);
		pq.insert(89);
		pq.insert(76);
		//pq.insert(56);
		
		System.out.println("--------------------");
		
		System.out.println(pq.isEmpty());
		System.out.println(pq.isFull());
		System.out.println(pq.peekMin());
		
		System.out.println("---------------------");
		
		while (!pq.isEmpty()) {
			long temp = pq.remove();
			System.out.print(temp + " ");
		}
		System.out.println("\n--------------------");
		
		System.out.println(pq.isEmpty());
		System.out.println(pq.isFull());
		System.out.println(pq.peekMin());
		
		
	}

}

class PriorityQueue {
	private int maxSize;
	private long[] queArr;
	private int nElems;
	
	public PriorityQueue(int size) {
		maxSize = size;
		queArr = new long[maxSize];
		nElems = 0;
	}
	
	public void insert(long value) {
		int i;
		if (nElems == 0) {
			queArr[nElems++] = value;
		} else {
			if (!isFull()) {
				for (i = nElems - 1; i >= 0; i--) {
					if (value > queArr[i]) {
						queArr[i + 1] = queArr[i];
					} else {
						break;
					}
				}
				queArr[i + 1] = value;
				nElems++;
			} else {
				throw new ArrayIndexOutOfBoundsException("Queue is full.");
			}
		}
	}
	
	public long remove() {
		if (isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("Queue is empty.");
		} else {
			return queArr[--nElems];
		}
	}
	
	public long peekMin() {
		if (isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("Queue is empty.");
		} else {
			return queArr[nElems - 1];
		}
	}
	
	public boolean isEmpty() {
		return nElems == 0;
	}
	
	public boolean isFull() {
		return nElems == maxSize;
	}
}
