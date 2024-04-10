package nw.amber.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example04_AnagramAWord {

	static int size;
	static int count;
	static char[] arrChar = new char[100];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter a word: ");
		String input = getString();
		size = input.length();
		count = 0;
		for (int i = 0; i < size; i++) {
			arrChar[i] = input.charAt(i);
		}
		doAnagram(size);
	}

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String out = br.readLine();
		return out;
	}
	
	public static void doAnagram(int newSize) {
		if (newSize == 1) {
			return;
		}
		for (int i = 0; i < newSize; i++) {
			doAnagram(newSize - 1);
			if (newSize == 2) {
				displayWord();
			}
			rotate(newSize);
		}
	}
	
	private static void rotate(int newSize) {
		// TODO Auto-generated method stub
		int i;
		int tempPosition = size - newSize;
		char temp = arrChar[tempPosition];
		for (i = tempPosition + 1; i < size; i++) {
			arrChar[i - 1] = arrChar[i];
		}
		arrChar[i - 1] = temp;
	}

	public static void displayWord() {
		if (count < 99) {
			System.out.print(" ");
		}
		if (count < 9) {
			System.out.print(" ");
		}
		System.out.print(++count + " ");
		for (int i = 0; i < size; i++) {
			System.out.print(arrChar[i]);
		}
		System.out.print(" ");
		if (count % 6 == 0) {
			System.out.println("");
		}
	}
}
