package Java_topics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsefulCodes {

    public static void main(String[] args) {
        // Count occurrences of character in a string or sentence

        String str1 = "hi my name is nitish";
        long count  =  str1.chars().filter(ch -> ch == 'i').count();
        System.out.println(count);

        // Find Maximum value in an array
        int[] arr1 = {1, 3, 7, 0, 5};
        int max1 = Arrays.stream(arr1).max().getAsInt();
        System.out.println(max1);

        // Find Minimum value in an array
        int[] arr2 = {1, 3, 7, 0, 5};
        int min1 = Arrays.stream(arr2).min().getAsInt();
        System.out.println(min1);

        // Convert List to Array
        List<String> list1 = Arrays.asList("a", "b", "c");
        String[] strarr1 = list1.toArray(new String[0]);
        System.out.println(Arrays.toString(strarr1));

        // Remove Duplicates from a List
        List<Integer> list2 = Arrays.asList(1, 2, 2, 3, 4, 4);
        List<Integer> list3 = list2.stream().distinct().collect(Collectors.toList());
        System.out.println(list3);

        // Convert Array to List
        String[] arr3 = {"a", "b", "c"};
        List<String> list4 = Arrays.stream(arr3).collect(Collectors.toList());
        System.out.println(list4);

        // Check if a String is a Palindrome
        String str2 = "madam";
        Boolean b1  = new StringBuilder(str2).reverse().equals(str2);
        System.out.println("is a palindrome: " + b1);

        //Find sum of elements in the integer array
        int[] arr4 = {1, 2, 3, 4, 5};
        int sum1 = Arrays.stream(arr4).sum();
        System.out.println(sum1);

        // Average of Elements in an Integer Array
        int[] arr5 = {1, 2, 3, 4, 5};

        double avg1 = Arrays.stream(arr5).average().getAsDouble();
        System.out.println(avg1);

        // Convert String to Integer (Parsing)
        String str3 = "123";
        int num1 = Integer.parseInt(str3);
        System.out.println(num1);

        // Check if a List Contains a Value
        List<String> list5 = Arrays.asList("apple", "banana", "cherry");
        boolean b2 = list5.contains("cherry");
        System.out.println(b2);

        // Find the Index of an Element in a List
        List<String> list6 = Arrays.asList("apple", "banana", "cherry");
        int num2 = list6.indexOf("cherry");
        System.out.println(num2);

        // Filter Elements Matches a Condition
        List<Integer> list7 = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> list8  = list7.stream().filter(a -> a > 3).collect(Collectors.toList());
        System.out.println(list8);

        //Find if Any/All/None Element Matches a Condition
        List<Integer> list9 = Arrays.asList(1, 2, 3, 4, 5);
        boolean b3 = list9.stream().anyMatch(a -> a > 4);
        boolean b4 = list9.stream().allMatch(a -> a < 6);
        boolean b5 = list9.stream().noneMatch(a -> a > 6);
        System.out.println(b3+", "+b4+", "+b5); 

        // Sort List in Ascending Order
        List<Integer> list10 = Arrays.asList(5, 3, 8, 1);
        list10.sort(Comparator.naturalOrder());
        System.out.println(list10);

        //Sort List in Descending Order
        List<Integer> list11 = Arrays.asList(5, 3, 8, 1);
        list11.sort(Comparator.reverseOrder());
        System.out.println(list11);

        //Convert List of Strings to Uppercase
        List<String> list12 = Arrays.asList("hello", "world");
        List<String> list13 = list12.stream().map(String :: toUpperCase).collect(Collectors.toList());
        System.out.println(list13);

        // Join Elements of a List into a String
        List<String> list14 = Arrays.asList("apple", "banana", "cherry");

        String str4 = list14.stream().collect(Collectors.joining(", "));
        System.out.println(str4);

        // Find the Most Frequent Element in a List
        List<String> list15 = Arrays.asList("a", "b", "a", "c", "b", "b");
        Optional<String> mostFrequent = list15.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                    .entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);
        System.out.println(mostFrequent.orElse("None"));

        // Get the First N Elements of a List
        List<Integer> list16 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list17 = list16.stream().limit(3).collect(Collectors.toList());
        System.out.println(list17);

        // Get the Last 2 Elements of a List
        List<Integer> list18 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list19 = list18.stream().skip(list18.size() - 2).collect(Collectors.toList());
        System.out.println(list19);

        // Check if a String is Numeric
        String str5 = "12345";
        Boolean b6 = str5.matches("\\d+");
        System.out.println(b6);

        //Find the Common Elements Between Two Lists
        List<Integer> list20 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list21 = Arrays.asList(3, 4, 5, 6);
        List<Integer> list22 = list20.stream().filter(list21 :: contains).collect(Collectors.toList());
        System.out.println(list22);

        // Find the Average of a List of Numbers
        List<Integer> list23 = Arrays.asList(1, 2, 3, 4, 5);
        OptionalDouble num3 = list23.stream().mapToInt(Integer :: intValue).average();
        System.out.println(num3.orElse(0.0));

        // Concatenate Multiple Strings
        String str6 = Stream.of("Hi ", "my ", "name ", "is ", "nitish ").collect(Collectors.joining());
        System.out.println(str6);

        //Find the First Element of a Stream
        List<Integer> list24 = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println(list24.stream().findFirst());

        //Remove Leading and Trailing Whitespaces from a String
        String str7 = "   Hello World!   ";
        System.out.println(str7.trim());

        //Convert a List of Strings to Lowercase
        List<String> list25 = Arrays.asList("Apple", "Banana", "Cherry");
        List<String> list26 = list25.stream().map(String :: toLowerCase).collect(Collectors.toList());
        System.out.println(list26);

        //Get the Length of Each String in a List
        List<String> list27 = Arrays.asList("apple", "banana", "cherry");
        List<Integer> list28 = list27.stream().map(String :: length).collect(Collectors.toList());
        System.out.println(list28);

        // Replace All Occurrences of a Character in a String
        String str8 = "hello world";
        System.out.println(str8.replace('o', '1'));

        // Find the Index of the First Occurrence of a Character in a String
        String str9 = "hello world";
        System.out.println(str9.indexOf('r'));

    }
    
}
