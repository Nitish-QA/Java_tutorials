package Java_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class convertSet2ListandVV {
	
	public static void main(String[] args) {
        // Creating a list
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "grape", "pineapple"));

        // Converting list to set
        Set<String> set = new HashSet<>(list);

        // Printing the set
        System.out.println("Set: " + set);

        // Converting set to list
        List<String> list2 = new ArrayList<>(set);

        // Printing the list
        System.out.println("List: " + list2);
    }

}
