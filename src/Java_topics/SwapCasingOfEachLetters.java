package Java_topics;

import java.util.Scanner;

public class SwapCasingOfEachLetters {
	// WRITE A CODE TO swap String letters to uppercase and lowercase
	
		public static void main(String[] args) {
			
			Scanner sc   = new Scanner(System.in);
			System.out.println("Enter a Sentence to swap casing: \n"); 
			System.out.println(swapCasing(sc.nextLine()));
			sc.close();
		}
		
		public static String swapCasing(String str) {
			StringBuilder strb = new StringBuilder();
			
			for(int i = 0; i<str.length(); i++) {
				if(Character.isLowerCase(str.charAt(i))) {
					strb.append(Character.toUpperCase(str.charAt(i)));
				}else if(Character.isUpperCase(str.charAt(i))) {
					strb.append(Character.toLowerCase(str.charAt(i)));
				}else {
					strb.append(str.charAt(i));
				}
			}
			
			return strb.toString();
		}
}
