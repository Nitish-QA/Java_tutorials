package Java_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//###########ARRAYLIST vs LINKEDLIST ####################
/*

The main difference between ArrayList and LinkedList is the way they store and retrieve elements. 
ArrayList stores elements in an array, and retrieving elements is done by accessing the elements directly by their index. 
In contrast, LinkedList stores elements as a linked list of nodes, where each node contains the element and a reference to the next node. 
Retrieving elements in LinkedList requires traversing the list by following the references between nodes.

VVI-
In the example program above, we can see that ^^^^ArrayList is faster than LinkedList^^^^ for retrieving elements by index. 
This is because ArrayList stores elements in an array, and accessing elements by index is a constant time operation, whereas 
traversing a linked list in LinkedList takes more time as the number of elements in the list increases. 

VVI-
However, ^^^^LinkedList is faster than ArrayList^^^^ for adding or removing elements in the middle of the list, since it only requires 
updating the references between nodes, whereas adding or removing elements in the middle of an ArrayList requires shifting all the 
subsequent elements to new positions.
*
*Q. does both have same set of methods
*Yes, both ArrayList and LinkedList implement the List interface in Java, which means that they have the same set of methods.
*However, the implementation details of these methods are different in ArrayList and LinkedList, as explained in my previous response. 
*This difference in implementation can affect the performance of the methods, depending on the specific use case.
*/

public class arrayListvsLinkedList {
	
	  public static void main(String[] args) {
	        // Create an ArrayList and a LinkedList
	        List<Integer> arrayList = new ArrayList<>();
	        List<Integer> linkedList = new LinkedList<>();

	        // Add 100,000 elements to both lists
	        for (int i = 0; i < 100000; i++) {
	            arrayList.add(i);
	            linkedList.add(i);
	        }

	        // Get the time taken to retrieve elements from the ArrayList
	        long arrayListStartTime = System.currentTimeMillis();
	        for (int i = 0; i < 100000; i++) {
	            arrayList.get(i);
	        }
	        
	        long arrayListEndTime = System.currentTimeMillis();
	        long arrayListTimeTaken = arrayListEndTime - arrayListStartTime;

	        // Get the time taken to retrieve elements from the LinkedList
	        long linkedListStartTime = System.currentTimeMillis();
	        for (int i = 0; i < 100000; i++) {
	            linkedList.get(i);
	        }
	        
	        long linkedListEndTime = System.currentTimeMillis();
	        long linkedListTimeTaken = linkedListEndTime - linkedListStartTime;

	        // Print the time taken to retrieve elements from both lists
	        System.out.println("Time taken to retrieve elements from ArrayList: " + arrayListTimeTaken + " ms");
	        System.out.println("Time taken to retrieve elements from LinkedList: " + linkedListTimeTaken + " ms");
	    }
}
