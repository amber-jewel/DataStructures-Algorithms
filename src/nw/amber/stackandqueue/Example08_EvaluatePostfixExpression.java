package nw.amber.stackandqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example08_EvaluatePostfixExpression {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String input;
		int output;
		
		while(true) {
			System.out.print("Enter postfix: ");
			input = getString();
			if (input.equals("")) {
				break;
			}
			ParseOrEvaluatePostfix eval = new ParseOrEvaluatePostfix(input);
			output = eval.doEvaluate();
			System.out.println("Answer is: " + output);
		}
	}
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

}

class Eg_08_Stack {
	private int maxSize;
	private int[] stackArr;
	private int top;
	
	public Eg_08_Stack(int size) {
		maxSize = size;
		stackArr = new int[maxSize];
		top = -1;
	}
	
	public void push(int value) {
		stackArr[++top] = value;
	}
	
	public int pop() {
		return stackArr[top--];
	}
	
	public int peek() {
		return stackArr[top];
	}
	
	public int size() {
		return top + 1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public int peekN(int n) {
		return stackArr[n];
	}
	
	public void displayStack(String s) {
		System.out.print(s);
		System.out.print("Stack (bottom-->top): ");
		for (int i = 0; i < size(); i++) {
			System.out.print(peekN(i));
			System.out.print(' ');
		}
		System.out.println("");
	}
}

class ParseOrEvaluatePostfix {
	private Eg_08_Stack stack;
	private String input;
	
	public ParseOrEvaluatePostfix(String in) {
		input = in;
	}
	
	public int doEvaluate() {
		stack = new Eg_08_Stack(20);
		int num1, num2, answer;
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			stack.displayStack("" + ch + "");
			if (ch >= '0' && ch <= '9') {
				stack.push((int)ch - '0');
			} else {
				num2 = stack.pop();
				num1 = stack.pop();
				switch (ch) {
					case '+':
						answer = num1 + num2;
						break;
					case '-':
						answer = num1 - num2;
						break;
					case '*':
						answer = num1 * num2;
						break;
					case '/':
						answer = num1 / num2;
						break;
					default:
						answer = 0;
				}
				stack.push(answer);
			}
		}
		answer = stack.pop();
		return answer;
	}
}
