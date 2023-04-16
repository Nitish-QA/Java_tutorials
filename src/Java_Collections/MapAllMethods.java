package Java_Collections;

import java.util.HashMap;
import java.util.Map;

public class MapAllMethods {
	
	public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Print the keys in the map
        System.out.println("Keys in the map: " + map.keySet());

        // Print the values in the map
        System.out.println("Values in the map: " + map.values());

        // Print the key-value mappings in the map
        System.out.println("Mappings in the map: " + map.entrySet());

        // Check if the map contains a key
        System.out.println("Does the map contain the key \"Bob\"? " + map.containsKey("Bob"));

        // Check if the map contains a value
        System.out.println("Does the map contain the value 30? " + map.containsValue(30));

        // Get the value associated with a key
        System.out.println("The value associated with the key \"Charlie\" is: " + map.get("Charlie"));

        // Remove a key-value mapping from the map
        map.remove("Bob");
        System.out.println("After removing the key \"Bob\", the mappings in the map are: " + map.entrySet());

        // Replace the value associated with a key
        map.replace("Alice", 26);
        System.out.println("After replacing the value associated with the key \"Alice\", the mappings in the map are: " + map.entrySet());

        // Clear the map
        map.clear();
        System.out.println("After clearing the map, the mappings in the map are: " + map.entrySet());

    }

}
