package Java_oopsConcepts;

public class datatype_typecasting {
	
	/*
	 * Typecasting is the process of converting a value of one data type to another
	 * data type. In Java, there are two types of typecasting: implicit typecasting
	 * (widening) and explicit typecasting (narrowing).
	 * 
	 * Implicit typecasting (widening): happens when a value of a smaller data type
	 * is converted to a larger data type.
	 * 
	 * Explicit typecasting (narrowing): happens when a value of a larger data type
	 * is converted to a smaller data type. For example, when a double value is
	 * assigned to an int variable. In this case, the programmer needs to use the
	 * cast operator (type) to perform the typecasting.
	 */
	public static void main(String[] args) {
        // Implicit typecasting (Widening)
        int num1 = 10;
        double num2 = num1;
        System.out.println("Implicit typecasting: " + num2); // Output: 10.0

        // Explicit typecasting (Narrowing)
        double num3 = 10.5;
        int num4 = (int) num3;
        System.out.println("Explicit typecasting: " + num4); // Output: 10

        // Typecasting with different data types
        char letter = 'A';
        int ascii = (int) letter;
        System.out.println("ASCII value of 'A': " + ascii); // Output: 65

        // Typecasting with incompatible data types
        int num5 = 100;
        //boolean flag = (boolean) num5; // Compilation error: Incompatible types
    }
}
