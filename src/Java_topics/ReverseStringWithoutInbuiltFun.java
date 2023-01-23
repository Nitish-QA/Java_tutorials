package Java_topics;

public class ReverseStringWithoutInbuiltFun {

	public static void main(String[] args) {

		String st = "Nitish";

		for (int i = st.length() - 1; i >= 0; i--) {
			System.out.print(st.charAt(i));
		}

	}

}
