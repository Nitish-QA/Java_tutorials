package Java_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassAllMethods {
	
	public static void main(String[] args) {
        // Create a list of integers
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.add(1);
        nums.add(5);
        System.out.println("Original list: " + nums);

        // Sort the list using the sort() method
        Collections.sort(nums);
        System.out.println("Sorted list: " + nums);

        // Shuffle the list using the shuffle() method
        Collections.shuffle(nums);
        System.out.println("Shuffled list: " + nums);

        // Find the minimum and maximum values in the list using the min() and max() methods
        int min = Collections.min(nums);
        int max = Collections.max(nums);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        // Count the number of occurrences of a value in the list using the frequency() method
        int count = Collections.frequency(nums, 1);
        System.out.println("Number of occurrences of 1: " + count);

        // Reverse the order of the list using the reverse() method
        Collections.reverse(nums);
        System.out.println("Reversed list: " + nums);

        // Create a synchronized (thread-safe) version of the list using the synchronizedList() method
        List<Integer> syncList = Collections.synchronizedList(nums);
        System.out.println("Synchronized list: " + syncList);
    }

}
