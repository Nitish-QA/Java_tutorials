package Java_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
The List will contain duplicates and maintain the order of the elements, while the Set 
will not contain duplicates and will not maintain the order of the elements.
*/
public class ListVsSet {
	
	public static void main(String[] args) {
        // create a list and a set
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        // add elements to the list and set
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("apple");
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("apple");

        // print the contents of the list and set
        System.out.println("List: " + list);
        System.out.println("Set: " + set);

        // get the size of the list and set
        System.out.println("List size: " + list.size());
        System.out.println("Set size: " + set.size());

        // check if an element exists in the list and set
        System.out.println("List contains apple: " + list.contains("apple"));
        System.out.println("Set contains apple: " + set.contains("apple"));

        // remove an element from the list and set
        list.remove("apple");
        set.remove("apple");

        // print the contents of the list and set after removal
        System.out.println("List after removal: " + list);
        System.out.println("Set after removal: " + set);
    }

}
