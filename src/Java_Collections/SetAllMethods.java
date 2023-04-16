package Java_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetAllMethods {
	
	 public static void main(String[] args) {
	        // Create a hash set
	        Set<String> set = new HashSet<>();

	        // Adding elements to the set
	        set.add("apple");
	        set.add("banana");
	        set.add("orange");
	        System.out.println("Set after adding elements: " + set);

	        // Adding a duplicate element
	        boolean added = set.add("banana");
	        System.out.println("Is banana added to the set? " + added);

	        // Removing an element
	        boolean removed = set.remove("orange");
	        System.out.println("Is orange removed from the set? " + removed);
	        System.out.println("Set after removing elements: " + set);

	        // Checking if an element is present
	        boolean present = set.contains("banana");
	        System.out.println("Is banana present in the set? " + present);

	        // Clearing the set
	        set.clear();
	        System.out.println("Set after clearing elements: " + set);

	        // Checking if the set is empty
	        boolean empty = set.isEmpty();
	        System.out.println("Is the set empty? " + empty);

	        // Creating a new set and adding elements to it
	        Set<String> set2 = new HashSet<>();
	        set2.add("banana");
	        set2.add("grape");
	        set2.add("kiwi");
	        System.out.println("Set2: " + set2);

	        // Adding all the elements in set2 to set
	        set.addAll(set2);
	        System.out.println("Set after adding all elements from set2: " + set);

	        // Removing all the elements in set2 from set
	        set.removeAll(set2);
	        System.out.println("Set after removing all elements from set2: " + set);

	        // Adding all the elements in set2 to set again
	        set.addAll(set2);

	        // Retaining only the elements in set that are also in set2
	        set.retainAll(set2);
	        System.out.println("Set after retaining only the elements in set that are also in set2: " + set);

	        // Converting the set to an array
	        Object[] arr = set.toArray();
	        System.out.println("Array obtained from set: " + Arrays.toString(arr));

	        // Converting the set to a string
	        String str = set.toString();
	        System.out.println("String obtained from set: " + str);

	        // Getting the hash code of the set
	        int hashCode = set.hashCode();
	        System.out.println("Hash code of set: " + hashCode);

	        // Creating an iterator over the elements in the set
	        Iterator<String> itr = set.iterator();
	        System.out.print("Set elements obtained using iterator: ");
	        while (itr.hasNext()) {
	            System.out.print(itr.next() + " ");
	        }
	        System.out.println();
	    }


}
