package Java_topics;

import java.util.Random;

public class RandomAllMethods {
	
	public static void main(String[] args) {
        Random random = new Random();

        // nextBoolean() method
        System.out.println("nextBoolean() method:");
        System.out.println(random.nextBoolean()); // Output: either true or false

        // nextInt() method
        System.out.println("nextInt() method:");
        System.out.println(random.nextInt()); // Output: a random integer

        // nextInt(int bound) method
        System.out.println("nextInt(int bound) method:");
        System.out.println(random.nextInt(10)); // Output: a random integer between 0 and 9

        // nextDouble() method
        System.out.println("nextDouble() method:");
        System.out.println(random.nextDouble()); // Output: a random double between 0.0 and 1.0

        // nextGaussian() method
        System.out.println("nextGaussian() method:");
        System.out.println(random.nextGaussian()); // Output: a random double with mean 0.0 and standard deviation 1.0

        // nextLong() method
        System.out.println("nextLong() method:");
        System.out.println(random.nextLong()); // Output: a random long

        // nextFloat() method
        System.out.println("nextFloat() method:");
        System.out.println(random.nextFloat()); // Output: a random float between 0.0 and 1.0

        // setSeed() method
        System.out.println("setSeed() method:");
        random.setSeed(123456789L); // Set the seed for the random number generator
        System.out.println(random.nextDouble()); // Output: the same random double as the previous call
    }

}
