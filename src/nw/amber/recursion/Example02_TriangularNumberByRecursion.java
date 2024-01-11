package nw.amber.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example02_TriangularNumberByRecursion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter a number : ");
		int n = getInt();
		int output = triangular(n);
		System.out.println("Triangul number: " + output);
		
	}
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String result = br.readLine();
		return result;
	}

	public static int getInt() throws IOException {
		String res = getString();
		return Integer.parseInt(res);
	}
	
	public static int triangular(int n) throws IOException {
		if (n == 1) {
			return 1;
		} else {
			return (n + triangular(n - 1));
		}
	}
}
