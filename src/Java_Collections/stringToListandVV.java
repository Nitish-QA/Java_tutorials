package Java_Collections;

import java.util.Arrays;
import java.util.List;

public class stringToListandVV {

	public static void main(String[] args) {
		String str = "apple,banana,cherry";
		
		String st = "Nitish";
		String arr[] = st.split("");
		String strr = String.join("", arr);
		System.out.println(strr);

		// convert the string to a list
		List<String> list = Arrays.asList(str.split(","));
		System.out.println("List: " + list);

		// convert the list back to a string
		String str2 = String.join(",", list);
		// String str2 = String.join(",", list) + ",";

		System.out.println("String: " + str2);
	}

}
