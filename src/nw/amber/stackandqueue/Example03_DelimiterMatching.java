package nw.amber.stackandqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example03_DelimiterMatching {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String input;
		while (true) {
			System.out.print("Enter a string with delimiter...");
			input = getString();
			if (input.equals("")) {
				break;
			}
			CheckDelimiterMatching obj = new CheckDelimiterMatching(input);
			obj.checkDelimiter();
		}
		
	}

	private static String getString() throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String result = br.readLine();
		return result;
	}

}

class Eg_03_Stack {
	private int maxSize;
	private char[] stackArr;
	private int top;
	
	public Eg_03_Stack(int size) {
		maxSize = size;
		stackArr = new char[maxSize];
		top = -1;
	}
	
	public void push(char value) {
		stackArr[++top] = value;
	}
	
	public char pop() {
		return stackArr[top--];
	}
	
	public char peek() {
		return stackArr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
}

class CheckDelimiterMatching {
	private String input;
	
	public CheckDelimiterMatching(String in) {
		input = in;
	}
	
	public void checkDelimiter() {
		int size = input.length();
		Eg_03_Stack stack = new Eg_03_Stack(size);
		
		for (int i = 0; i < size; i++) {
			char ch = input.charAt(i);
			switch (ch) {
				case '{':
				case '[':
				case '(':
					stack.push(ch);
					break;
				case '}':
				case ']':
				case ')':
					if (!stack.isEmpty()) {
						char chPop = stack.pop();
						if ((ch == '}' && chPop != '{') || 
							(ch == ']' && chPop != '[') || 
							(ch == ')' && chPop != '(')) {
							System.out.println("Error: " + ch + " at " + i);
						}
					} else {
						System.out.println("Error: " + ch + " at " + i);
					}
					break;
			}
		}
		
		if (!stack.isEmpty()) {
			System.out.println("Error: missing right delimiters.");
		}
	}
}
