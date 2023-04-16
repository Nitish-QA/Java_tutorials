package Java_topics;

public class MathALLMethods {

	/*
	 * abs(): Returns the absolute value of a given value. 
	 * ceil(): Returns the smallest integer greater than or equal to the given value. 
	 * floor(): Returns the largest integer less than or equal to the given value. 
	 * max(): Returns the greater of two given values. 
	 * min(): Returns the lesser of two given values.
	 * pow(): Returns the value of the first argument raised to the power of the second argument. 
	 * random(): Returns a double value greater than or equal to 0.0 and less than 1.0. 
	 * round(): Returns the closest long or int to the argument. 
	 * sqrt(): Returns the square root of a given value.
	 */

	public static void main(String[] args) {
		double x = 2.5;
		double y = 3.7;

		// abs() method
		System.out.println("abs() method:");
		System.out.println(Math.abs(-1)); // Output: 1

		// ceil() method
		System.out.println("ceil() method:");
		System.out.println(Math.ceil(x)); // Output: 3.0

		// floor() method
		System.out.println("floor() method:");
		System.out.println(Math.floor(x)); // Output: 2.0

		// max() method
		System.out.println("max() method:");
		System.out.println(Math.max(x, y)); // Output: 3.7

		// min() method
		System.out.println("min() method:");
		System.out.println(Math.min(x, y)); // Output: 2.5

		// pow() method
		System.out.println("pow() method:");
		System.out.println(Math.pow(x, y)); // Output: 44.15200768954086

		// random() method
		System.out.println("random() method:");
		System.out.println(Math.random()); // Output: a random number between 0.0 and 1.0

		// round() method
		System.out.println("round() method:");
		System.out.println(Math.round(x)); // Output: 3

		// sqrt() method
		System.out.println("sqrt() method:");
		System.out.println(Math.sqrt(x)); // Output: 1.5811388300841898
	}

}
