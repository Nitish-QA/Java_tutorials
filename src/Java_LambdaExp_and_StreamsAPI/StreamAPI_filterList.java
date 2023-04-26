package Java_LambdaExp_and_StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI_filterList {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ram", "Shayam", "Gopal", "Hari", "Mohan");

		List<String> result = names.stream().filter(x -> x.length() > 4).collect(Collectors.toList());
		// Note:
		/*
		 * Here we have used lambda experssion (x->x.length()>4) and then we are
		 * collecting and converting it again to a list
		 */
		System.out.println(result);
	}

}
