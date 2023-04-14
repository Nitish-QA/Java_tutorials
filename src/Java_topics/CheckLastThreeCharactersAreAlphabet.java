package Java_topics;

import java.util.Scanner;

public class CheckLastThreeCharactersAreAlphabet {
	
	// WRITE A CODE check if last three characters of string is other then an alphabet or any other
	// Also print those characters in same order
	// if not print last three are alphabets

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		StringBuilder strb = new StringBuilder();
		
		System.out.println("Enter a word or sentence: ");
		String str = sc.nextLine();

		//System.out.println(str.length() - 1);

		for (int i = str.length() - 1; i >= 0; i--) {
			if (!(Character.isAlphabetic(str.charAt(i))) && str.length() - i <= 3) {
				strb.append(str.charAt(i));
			}
		}

		if(strb.length()>0) {
		strb.reverse();
		}else {
			System.out.println("Last Three characters is an Alphabet");
		}
		System.out.println(strb.toString());

	}

}
