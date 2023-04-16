package Java_Collections;

import java.util.HashMap;
import java.util.Map;

public class convertString2MapandVV {

	public static void main(String[] args) {

		// Convert a String to a Map
		String str = "Alice:25,Bob:30,Charlie:35";
		Map<String, Integer> map = new HashMap<>();
		String[] pairs = str.split(",");
		for (String pair : pairs) {
			String[] keyValue = pair.split(":");
			String key = keyValue[0];
			int value = Integer.parseInt(keyValue[1]);
			map.put(key, value);
		}
		System.out.println("Map from String: " + map);

		// Convert a Map to a String
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("Alice", 25);
		map2.put("Bob", 30);
		map2.put("Charlie", 35);
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, Integer> entry : map2.entrySet()) {
			sb.append(entry.getKey() + ":" + entry.getValue() + ",");
		}
		String str2 = sb.substring(0, sb.length() - 1);
		System.out.println("String from Map: " + str2);
	}

}
