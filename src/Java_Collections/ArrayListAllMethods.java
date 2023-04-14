package Java_Collections;

import java.util.ArrayList;

public class ArrayListAllMethods {
	
	public static void main(String[] args) {
        // create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // add elements to the list
        list.add("apple");
        list.add("banana");
        list.add("orange");

        // access elements by index
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Element at index 2: " + list.get(2));

        // change an element at a specific index
        list.set(1, "grapes");
        System.out.println("After replacing element at index 1: " + list);

        // remove an element at a specific index
        list.remove(0);
        System.out.println("After removing element at index 0: " + list);

        // check if the list contains a specific element
        System.out.println("Does the list contain 'orange'? " + list.contains("orange"));

        // get the size of the list
        System.out.println("Size of the list: " + list.size());

        // clear the list
        list.clear();
        System.out.println("After clearing the list: " + list);

        // add multiple elements to the list
        list.add("dog");
        list.add("cat");
        list.add("hamster");
        System.out.println("After adding more elements: " + list);

        // check if the list is empty
        System.out.println("Is the list empty? " + list.isEmpty());

        // get an array containing all the elements in the list
        String[] array = list.toArray(new String[0]);
        System.out.print("Elements in the list as an array: ");
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        // trim the capacity of the ArrayList to the current size
        list.trimToSize();
    }

}
