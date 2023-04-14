package Java_Collections;

import java.util.Arrays;
import java.util.LinkedList;

public class linkedList2ArrayandVV {
	
	public static void main(String[] args) {
        // create an array of integers
        Integer[] arr = {1, 2, 3, 4, 5};

        // convert the array to a linked list
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(arr));
        System.out.println("LinkedList: " + linkedList);

        // create a new linked list
        LinkedList<String> list = new LinkedList<>();

        // add some elements to the linked list
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println("LinkedList: " + list);

        // convert the linked list to an array
        String[] arr2 = list.toArray(new String[list.size()]);
        System.out.println("Array: " + Arrays.toString(arr2));
    }


}
