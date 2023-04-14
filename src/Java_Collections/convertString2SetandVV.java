package Java_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Converting String to Set, removes duplicate elements from it


//Note that the order of the elements in the Set and the String may differ 
//due to the nature of a Set not guaranteeing any specific order.

public class convertString2SetandVV {
	
	public static void main(String[] args) {
        // convert a string to a set
        String str = "banana";
        Set<String> set = new HashSet<>(Arrays.asList(str.split("")));
        System.out.println("Set: " + set);

        // convert a set to a string
        String newStr = String.join("", set);
        System.out.println("String: " + newStr);
    }
}
