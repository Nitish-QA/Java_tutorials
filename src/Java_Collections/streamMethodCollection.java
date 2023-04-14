package Java_Collections;

import java.util.ArrayList;
import java.util.List;

public class streamMethodCollection {
	
	public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        // Example 1: Print all names in the list
        System.out.println("All names in the list:");
        names.stream().forEach(name -> System.out.println(name));

        // Example 2: Count the number of names in the list that start with "A"
        long count = names.stream().filter(name -> name.startsWith("A")).count();
        System.out.println("Number of names starting with 'A': " + count);

        // Example 3: Convert all names to uppercase and print them
        System.out.println("All names in uppercase:");
        names.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));
    }

}
