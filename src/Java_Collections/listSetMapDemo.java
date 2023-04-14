package Java_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class listSetMapDemo {
	
	public static void main(String[] args) {
        // Create a List of integers
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2); // List can have duplicate elements
        System.out.println("List: " + list);

        // Create a Set of integers
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // Set does not allow duplicate elements
        System.out.println("Set: " + set);

        // Create a Map of integers to strings
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(2, "double"); // Map can have duplicate keys, but not duplicate key-value pairs
        System.out.println("Map: " + map);

        // Accessing elements
        System.out.println("List element at index 1: " + list.get(1));
        System.out.println("Set contains element 2: " + set.contains(2));
        System.out.println("Map value for key 2: " + map.get(2));

        // Removing elements
        list.remove(2); // Removes the element at index 2, which is 3
        set.remove(2); // Removes the element 2
        map.remove(2); // Removes the key-value pair with key 2
        System.out.println("List after removing element at index 2: " + list);
        System.out.println("Set after removing element 2: " + set);
        System.out.println("Map after removing key 2: " + map);

        // Iterating over elements
        System.out.print("List elements: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.print("Set elements: ");
        for (int element : set) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Map entries: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.print("(" + entry.getKey() + ", " + entry.getValue() + ") ");
        }
        System.out.println();
    }

}
