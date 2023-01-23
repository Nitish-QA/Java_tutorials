package Java_topics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
	
	// Write a program to count occurrences of each characters in a string
	
	
	
	public static void getCharCount(String name) {
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		char strArray[] = name.toLowerCase().toCharArray();
		
		for(char ch: strArray) {
			if (charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
		}
		System.out.println(name + " : " + charMap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: "+ '\n');
		String st = sc.nextLine();
		getCharCount(st);

	}

}
