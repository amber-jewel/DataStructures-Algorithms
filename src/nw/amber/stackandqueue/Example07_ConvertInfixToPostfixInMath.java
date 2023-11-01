package nw.amber.stackandqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example07_ConvertInfixToPostfixInMath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String input, output;
		
		while (true) {
			System.out.print("Enter infix: ");
			input = getString();
			if (input.equals("")) {
				break;
			}
			ConvertInfixToPostfix to = new ConvertInfixToPostfix(input);
			output = to.convertInToPost();
			System.out.println("Postfix: " + output);
		}
	}
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String result = br.readLine();
		return result;
	}

}

class Eg_07_Stack {
	private int maxSize;
	private char[] stackArr;
	private int top;
	
	public Eg_07_Stack(int s) {
		maxSize = s;
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
	
	public char peekN(int n) {
		return stackArr[n];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int size() {
		return top + 1;
	}
	
	public void displayStack(String s) {
		System.out.print(s);
		System.out.print("Stack (bottom --> top): ");
		for (int i = 0; i < size(); i++) {
			System.out.print(peekN(i));
			System.out.print(' ');
		}
		System.out.println("");
	}
}

class ConvertInfixToPostfix {
	private String input;
	private String output = "";
	private Eg_07_Stack stack;
	
	public ConvertInfixToPostfix(String in) {
		int size = in.length();
		input = in;
		stack = new Eg_07_Stack(size);
	}
	
	public String convertInToPost() {
		int size = input.length();
		for (int i = 0; i < size; i++) {
			char ch = input.charAt(i);
			stack.displayStack("For " + ch + " ");
			switch (ch) {
				case '+':
				case '-':
					gotOper(ch, 1);
					break;
				case '*':
				case '/':
					gotOper(ch, 2);
					break;
				case '(':
					stack.push(ch);
					break;
				case ')':
					gotParen(ch);
					break;
				default:
					output = output + ch;
					break;
			}
		}
		while (!stack.isEmpty()) {
			stack.displayStack("While ");
			output = output + stack.pop();
		}
		stack.displayStack("End ");
		return output;
	}
	
	public void gotOper(char opThis, int prec1) {
		while (!stack.isEmpty()) {
			char opTop = stack.pop();
			if (opTop == '(') {
				stack.push(opTop);
				break;
			} else {
				int prec2;
				if (opTop == '+' || opTop == '-') {
					prec2 = 1;
				} else {
					prec2 = 2;
				}
				if (prec2 < prec1) {
					stack.push(opTop);
					break;
				} else {
					output = output + opTop;
					break;
				}
			}
		}
		stack.push(opThis);
	}
	
	public void gotParen(char ch) {
		while (!stack.isEmpty()) {
			char c = stack.pop();
			if (c == '(') {
				break;
			} else {
				output = output + c;
			}
		}
	}
}
