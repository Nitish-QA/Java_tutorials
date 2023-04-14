package Java_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList2ArrayandVV {
	public static void main(String[] args) {
		// create an array of integers
		Integer[] array = { 1, 2, 3, 4, 5 };

		// convert array to ArrayList
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array));
		System.out.println("ArrayList from array: " + list1);

		// create an ArrayList of integers
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(6);
		list2.add(7);
		list2.add(8);

		// convert ArrayList to array
		Integer[] array2 = new Integer[list2.size()];
		array2 = list2.toArray(array2);
		System.out.println("Array from ArrayList: " + Arrays.toString(array2));
	}

}
