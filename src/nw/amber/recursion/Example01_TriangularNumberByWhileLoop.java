package nw.amber.recursion;

public class Example01_TriangularNumberByWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int total = 0;
		while (n > 0) {
			total += n;
			--n;
		}
		System.out.println("Triangul number : " + total);
	}

}
