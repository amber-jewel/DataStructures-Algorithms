package nw.amber.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example03_FactorialNumberByRecursion {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter a number : ");
		int n = getInt();
		int output = factorial(n);
		System.out.println("Factorial number: " + output);
	}
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
	
	public static int getInt() throws NumberFormatException, IOException {
		return Integer.parseInt(getString());
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	}
}
