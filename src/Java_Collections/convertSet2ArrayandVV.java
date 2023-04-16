package Java_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class convertSet2ArrayandVV {
	
	 public static void main(String[] args) {
	        // Creating an array
	        String[] arr = {"apple", "banana", "orange", "grape", "pineapple"};

	        // Converting array to set
	        Set<String> set = new HashSet<>(Arrays.asList(arr));

	        // Printing the set
	        System.out.println("Set: " + set);

	        // Converting set to array
	        String[] arr2 = new String[set.size()];
	        set.toArray(arr2);

	        // Printing the array
	        System.out.println("Array: " + Arrays.toString(arr2));
	    }

}
