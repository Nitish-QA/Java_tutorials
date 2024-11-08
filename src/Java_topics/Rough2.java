package Java_topics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Rough2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello Wrold";
		long count = str.chars().filter(ch -> ch == 'l').count();
		System.out.println(count);

		int[] arr = {1, 3, 7, 0, 5};

		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println(max);

		int[] arr1 = {1, 3, 7, 0, 5};

		int min = Arrays.stream(arr1).min().getAsInt();

		System.out.println(min);

		List<String> list = Arrays.asList("a", "b", "c");
		String[] arr2 = list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr2)); 

		List<Integer> list1 = Arrays.asList(1, 2, 2, 3, 4, 4);

		List<Integer> list2 = list1.stream().distinct().collect(Collectors.toList());

		System.err.println(list2);

		String[] arr3 = {"a", "b", "c"};

		List<String> list3 = Arrays.asList(arr3);

		System.out.println(list3);

		String str2 = "madam";

		Boolean b = new StringBuilder(str2).reverse().toString().equals(str2);

		System.out.println(b);

		int[] arr4 = {1, 2, 3, 4, 5};

		int sum = Arrays.stream(arr4).sum();

		System.out.println(sum);

		String str3 = "123";

		int n = Integer.parseInt(str3);

		System.out.println(n);

		List<String> list4 = Arrays.asList("apple", "banana", "cherry");

		Boolean b1  = list4.contains("banana");
		System.out.println(b1);

		List<String> list5 = Arrays.asList("apple", "banana", "cherry");
		int index  = list5.indexOf("cherry");
		System.out.println(index);

		List<Integer> list6 = Arrays.asList(1, 2, 3, 4, 5);

		boolean any = list6.stream().anyMatch(x -> x > 3);
		boolean all = list6.stream().allMatch(y -> y % 2 == 0);
		boolean none  = list6.stream().noneMatch(z -> z % 2 == 0);
		System.out.println(any +", "+ all +", "+ none);

		List<Integer> list7 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list8 = list7.stream().filter(c -> c % 2 == 0).collect(Collectors.toList());
		System.err.println(list8);

		
		List<Integer> list9 = Arrays.asList(5, 3, 8, 1);
		list9.sort(Comparator.naturalOrder());

		System.out.println(list9);
		list9.sort(Comparator.reverseOrder());
		System.out.println(list9);

		List<String> list10 = Arrays.asList("hello", "world");
		List<String> list11 = list10.stream().map(String :: toUpperCase).collect(Collectors.toList());
		System.out.println(list11);

		List<String> list12 = Arrays.asList("apple", "banana", "cherry");

		String str4 = String.join(", ", list12); // Output: apple, banana, cherry
		String str5 = list12.stream().collect(Collectors.joining());  // Output: applebananacherry
		System.out.println(str4 + ", " + str5);

		List<Integer> list13= Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> list14 = list13.stream().limit(3).collect(Collectors.toList());
		List<Integer> list15 = list13.stream().skip(list13.size() - 3).collect(Collectors.toList());
		System.out.println(list14 + ", " + list15);


		String str6 = "12345";
		Boolean  isNumeric = str6.matches("\\d+");
		System.out.println(isNumeric);

		List<Integer> list16 = Arrays.asList(1, 2, 3, 4);
		List<Integer> list17 = Arrays.asList(3, 4, 5, 6);

		List<Integer> common = list16.stream().filter(list17 :: contains).collect(Collectors.toList());
		System.out.println(common);
		





		

		


		



	}

}
