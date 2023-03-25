package Java_topics;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseSentence rs = new ReverseSentence();
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence: \n");

		String st = sc.nextLine();
		printReverse(st);
		sc.close();
	}

	public static void printReverse(String st) {
		String[] words = st.split(" ");
		System.out.println("Reverse of your sentence is: \n");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}
}
