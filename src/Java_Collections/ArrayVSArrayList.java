package Java_Collections;
import java.util.ArrayList;

/*
Size:
    Array: Fixed in size once declared. You cannot change the size after the array is created.
    ArrayList: Dynamic in size. It can grow and shrink as needed.

Performance:
    Array: Generally faster for accessing elements since it has a fixed size.
    ArrayList: Slightly slower due to the dynamic resizing.

Type Safety: 
    Array: Can hold primitives and objects.
    ArrayList: Can only hold objects. For primitives, you need to use wrapper classes.

Methods:
    Array: Does not provide methods for common operations like adding or removing elements.
    ArrayList: Provides various methods like add(), remove(), get(), etc.


*/
public class ArrayVSArrayList {
    public static void main(String[] args) {
        // Demonstrating Array
        System.out.println("Array demonstration:");
        arrayDemo();
        
        // Demonstrating ArrayList
        System.out.println("\nArrayList demonstration:");
        arrayListDemo();
    }
    
    public static void arrayDemo() {
        // Declare and initialize an array of integers
        int[] numbers = new int[5];
        
        // Adding elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        
        // Accessing elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        // Attempting to add an element beyond the fixed size will cause an error
        // numbers[5] = 60; // Uncommenting this line will cause ArrayIndexOutOfBoundsException
    }
    
    public static void arrayListDemo() {
        // Declare and initialize an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        // Accessing elements
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }
        
        // Removing an element
        numbers.remove(2); // Removes the element at index 2
        
        // Accessing elements after removal
        System.out.println("After removal:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }
        
        // Adding more elements to demonstrate dynamic resizing
        numbers.add(60);
        numbers.add(70);
        
        System.out.println("After adding more elements:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }
    }
}
