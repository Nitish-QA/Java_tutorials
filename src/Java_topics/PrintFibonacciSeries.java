package Java_topics;

import java.util.Scanner;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Fibonacci sequence is a sequence in which each number is the sum of the two
		 * preceding ones. starts with a zero, followed by a one, then by another one, 
		 * and then by a series of steadily increasing numbers. 0, 1, 1, 2, 3, 5, 8, 13,
		 * 21, 34, 55 Formula: Fn = Fn-1 + Fn-2, where n > 1.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number up to which fibonacci series is to be printed: \n");

		int n = sc.nextInt();

		/*
		 * int a = 0; int b = 1; int c;
		 * 
		 * for (int i = 2; i < n; i++) { c = a + b; System.out.print(" " + c); a = b; b
		 * = c; }
		 */

		// ANOTHER WAY, but this time print the first 100 Fibonacci numbers:

		int[] fbnchi = new int[n];

		fbnchi[0] = 0;
		fbnchi[1] = 1;

		for (int i = 2; i < n; i++) {
			fbnchi[i] = fbnchi[i - 1] + fbnchi[i - 2];
		}

		for (int i = 0; i < n; i++) {
			if (fbnchi[i] > n) {
				break;
			}
			System.out.print(fbnchi[i] + " ");
		}

		// MY WAY for the above
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.
		 * println("Enter length till which fibbonacci series is required: \n");
		 * 
		 * int size = sc.nextInt();
		 * 
		 * int a = 0; int b = 1; int c; for (int i = 2; i <= size-1; i++) { c = a + b;
		 * if(a + b == c && c<size) {
		 * 
		 * System.out.print(c+" "); a = b; b = c; }
		 */

	}

}
