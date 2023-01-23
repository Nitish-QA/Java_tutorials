package Java_topics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a String to check palindrome: ");

		// Take input from user
		String st = br.readLine();

		// Convert String to type StringBuilder which is immutable
		StringBuilder str = new StringBuilder(st);
		str.reverse();

		String temp = str.toString();

		if (st.equals(temp)) {
			System.out.println("This is a palindrome");
		} else {
			System.out.println("This is not a palindrome");
		}

	}

}
