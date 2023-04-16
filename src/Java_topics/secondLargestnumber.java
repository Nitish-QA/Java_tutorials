package Java_topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class secondLargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// To find largest digit among a number
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number of more than one digit to find second largest number \n");

		String num = sc.nextLine();

		List<Integer> li = new ArrayList<>();

		for (int i = 0; i < num.length(); i++) {
			char ch = num.charAt(i);
			if (Character.isDigit(ch)) {
				li.add(Character.getNumericValue(ch));
			}
		}

		Collections.sort(li, Collections.reverseOrder());

		System.out.println("Largest digit is: " + li.get(0));
		System.out.println("Second largest digit is: " + li.get(1) + "\n");

// To find Largest number among list of numbers	

		System.out.println("Now enter a list of numbers separated by colon ':' to find largest number \n");
		String st = sc.nextLine(); // 1. Store numbers in an string

		String[] starr = st.split(":"); // 2. Store string in an array by splitting all the numbers

		List<Integer> numli = new ArrayList<>(); // 3. Create an empty array list

		for (int i = 0; i < starr.length; i++) {
			numli.add(Integer.parseInt(starr[i])); // 4. loop through the String array and convert each strings to
													// Integer and also add those elements to the list
		}

		Collections.sort(numli, Collections.reverseOrder()); // 5. Use Collections method and sort list in acceding
																// order and then in reverse order

		System.out.println("Largest number is: " + numli.get(0));
		System.out.println("Second largest number is: " + numli.get(1));

	}

}
