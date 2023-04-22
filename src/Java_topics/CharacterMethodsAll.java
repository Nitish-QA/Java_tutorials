package Java_topics;

public class CharacterMethodsAll {
	
	public static void main(String[] args) {
        char c = 'A';
        char ch = 'B';

        // isLetter() method
        System.out.println("isLetter() method:");
        System.out.println(Character.isLetter(c)); // Output: true

        // isDigit() method
        System.out.println("isDigit() method:");
        System.out.println(Character.isDigit(c)); // Output: false

        // isUpperCase() method
        System.out.println("isUpperCase() method:");
        System.out.println(Character.isUpperCase(c)); // Output: true

        // isLowerCase() method
        System.out.println("isLowerCase() method:");
        System.out.println(Character.isLowerCase(c)); // Output: false

        // toUpperCase() method
        System.out.println("toUpperCase() method:");
        System.out.println(Character.toUpperCase(c)); // Output: 'A'

        // toLowerCase() method
        System.out.println("toLowerCase() method:");
        System.out.println(Character.toLowerCase(c)); // Output: 'a'

        // getNumericValue() method
        System.out.println("getNumericValue() method:");
        System.out.println(Character.getNumericValue(c)); // Output: 10 (assuming c is '\n')
        
        // isAlphabetValue() method
        System.out.println("isAlphabetValue() method:");
        System.out.println(Character.isAlphabetic(c)); // Output: true
        
        // Compare method
        System.out.println("Compare method:");
        System.out.println(Character.compare(c, ch)); // Output: -1
	}

}
