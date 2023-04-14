package Java_Collections;

import java.util.LinkedList;

public class LinkedListAllMethods {
	public static void main(String[] args) {
		// create a new linked list
		LinkedList<String> linkedList = new LinkedList<>();

		// add elements to the linked list
		linkedList.add("apple");
		linkedList.add("banana");
		linkedList.add("cherry");

		// add an element to the beginning of the linked list
		linkedList.addFirst("orange");

		// add an element to the end of the linked list
		linkedList.addLast("kiwi");

		// print the linked list
		System.out.println("LinkedList: " + linkedList);

		// get the first element of the linked list
		String first = linkedList.getFirst();
		System.out.println("First element: " + first);

		// get the last element of the linked list
		String last = linkedList.getLast();
		System.out.println("Last element: " + last);

		// remove the first element of the linked list
		linkedList.removeFirst();
		System.out.println("LinkedList after removing first element: " + linkedList);

		// remove the last element of the linked list
		linkedList.removeLast();
		System.out.println("LinkedList after removing last element: " + linkedList);

		// add an element at a specific index
		linkedList.add(1, "pear");
		System.out.println("LinkedList after adding 'pear' at index 1: " + linkedList);

		// remove an element at a specific index
		linkedList.remove(2);
		System.out.println("LinkedList after removing element at index 2: " + linkedList);

		// check if the linked list contains a specific element
		boolean containsBanana = linkedList.contains("banana");
		System.out.println("Does LinkedList contain 'banana'? " + containsBanana);

		// get the index of a specific element
		int index = linkedList.indexOf("cherry");
		System.out.println("Index of 'cherry': " + index);

		// get the size of the linked list
		int size = linkedList.size();
		System.out.println("Size of LinkedList: " + size);

		// clear the linked list
		linkedList.clear();
		System.out.println("LinkedList after clearing: " + linkedList);
	}
}
