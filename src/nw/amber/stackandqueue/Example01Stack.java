package nw.amber.stackandqueue;

public class Example01Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eg_01_Stack stack = new Eg_01_Stack(5);
		
		stack.push(23);
		stack.push(76);
		stack.push(98);
		stack.push(67);
		stack.push(45);
		
		// Throw exception stack is full exception. 
		// stack.push(88);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		
		while (!stack.isEmpty()) {
			long pop = stack.pop();
			System.out.print(pop + " ");
		}
		System.out.println("");
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		
		// Throw exception stack is empty exception.
		// System.out.println(stack.pop());
	}

}

class Eg_01_Stack {
	private int maxSize;
	private long[] stackArr;
	private int top;
	
	public Eg_01_Stack(int size) {
		maxSize = size;
		stackArr = new long[maxSize];
		top = -1;
	}
	
	public void push(long value) {
		if (!isFull()) {
			stackArr[++top] = value;
		} else {
			throw new StackOverflowError("Stack is full.");
		}
	}
	
	public long pop() {
		if (!isEmpty()) {
			return stackArr[top--];
		} else {
			throw new StackOverflowError("Stack is empty.");
		}
	}
	
	public long peek() {
		return stackArr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == (maxSize - 1);
	}
}
