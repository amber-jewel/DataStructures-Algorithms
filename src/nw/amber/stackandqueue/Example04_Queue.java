package nw.amber.stackandqueue;

public class Example04_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eg_04_Queue que = new Eg_04_Queue(2);
		
		System.out.println(que.isFull());
		System.out.println(que.isEmpty());
		//que.insert(67);
		//que.insert(37);
		//que.insert(98);
		que.insert(92);
		que.insert(45);
		System.out.println(que.isFull());
		System.out.println(que.isEmpty());
		que.insert(87);
		
		System.out.println(que.removeFront() + ", " + que.removeFront());
		
		while (!que.isEmpty()) {
			long temp = que.remove();
			System.out.print(temp + " ");
		}
		System.out.println("");
		
		System.out.println(que.size());
		
		System.out.println(que.removeFront());
		System.out.println(que.isFull());
		System.out.println(que.isEmpty());
	}

}

class Eg_04_Queue {
	private int maxSize;
	private long[] queArr;
	private int front;
	private int rear;
	private int nElems;
	
	public Eg_04_Queue(int size) {
		maxSize = size;
		queArr = new long[maxSize];
		front = 0;
		rear = -1;
		nElems = 0;
	}
	
	public void insert(long value) {
		if (isFull()) {
			System.out.println("Queue is full.");
		} else {
			if (rear == maxSize - 1) {
				rear = -1;
			}
			queArr[++rear] = value;
			nElems++;
		}
	}
	
	public long remove() {
		if (isEmpty()) {
			System.out.print("Empty queue = ");
			return 0;
		} else {
			long temp = queArr[front++];
			if (front == maxSize) {
				front = 0;
			}
			nElems--;
			return temp;
		}
	}
	
	public long removeFront() {
		if (isEmpty()) {
			System.out.print("Empty queue = ");
			return 0;
		} else {
			return queArr[front];
		}
	}
	
	public boolean isEmpty() {
		return nElems == 0;
	}
	
	public boolean isFull() {
		return nElems == maxSize;
	}
	
	public int size() {
		return nElems;
	}
}
