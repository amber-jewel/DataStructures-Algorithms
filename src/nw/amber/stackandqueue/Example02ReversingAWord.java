package nw.amber.stackandqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example02ReversingAWord {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String input, output;
		
		while (true) {
			System.out.print("Enter a string: ");
			System.out.flush();
			input = getString();
			if (input.equals("")) {
				break;
			}
			ReverseAWord obj = new ReverseAWord(input);
			output = obj.reverse();
			System.out.println("Reverse a word: " + output);
		}
	}

	private static String getString() throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String text = br.readLine();
		return text;
	}

}

class Eg_02_Stack {
	private int maxSize;
	private char[] stackArr;
	private int top;
	
	public Eg_02_Stack(int size) {
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

class ReverseAWord {
	private String input;
	private String output;
	
	public ReverseAWord(String in) {
		input = in;
	}
	
	public String reverse() {
		int size = input.length();
		Eg_02_Stack stack = new Eg_02_Stack(size);
		
		for (int i = 0; i < size; i++) {
			char c = input.charAt(i);
			stack.push(c);
		}
		
		output = "";
		while (!stack.isEmpty()) {
			char ch = stack.pop();
			output += ch;
		}
		
		return output;
	}
}
