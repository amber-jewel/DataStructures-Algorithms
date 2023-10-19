package nw.amber.stackandqueue;

public class Example05_QueueWithoutNumberOfItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eg_05_Queue queue = new Eg_05_Queue(5);
		
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		System.out.println(queue.peek());
		
		queue.insert(65);
		queue.insert(87);
		queue.insert(23);
		queue.insert(54);
		queue.insert(45);
		
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		System.out.println(queue.peek());
		
		System.out.println("----------------------");
		
		while (!queue.isEmpty()) {
			long temp = queue.remove();
			System.out.print(temp + " ");
		}
		System.out.println("\n---------------------");
		
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		System.out.println(queue.peek());
	}

}

class Eg_05_Queue {
	private int maxSize;
	private long[] quearr;
	private int front;
	private int rear;
	
	public Eg_05_Queue(int size) {
		maxSize = size + 1;
		quearr = new long[maxSize];
		front = 0;
		rear = -1;
	}
	
	public void insert(long value) {
		if (rear == maxSize - 1) {
			rear = -1;
		}
		quearr[++rear] = value;
	}
	
	public long remove() {
		long temp = quearr[front++];
		if (front == maxSize) {
			front = 0;
		}
		return temp;
	}
	
	public long peek() {
		return quearr[front];
	}
	
	public boolean isEmpty() {
		return (rear + 1 == front) || (front + maxSize - 1 == rear);
	}
	
	public boolean isFull() {
		return (rear + 2 == front) || (front + maxSize - 2 == rear);
	}
	
	public int size() {
		if (rear >= front) {
			return rear - front + 1;
		} else {
			return (maxSize - front) + (rear + 1);
		}
	}
}
