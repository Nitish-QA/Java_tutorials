package Java_Collections;

import java.util.ArrayList;
import java.util.List;

public class retainAllMethodCollection {
	
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);

        // Print the original lists
        System.out.println("Original lists:");
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        // Retain only the common elements in both lists
        list1.retainAll(list2);

        // Print the updated lists
        System.out.println("Updated lists after retainAll():");
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
    }

}
