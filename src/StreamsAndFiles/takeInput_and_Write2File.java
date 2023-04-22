package StreamsAndFiles;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class takeInput_and_Write2File {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter a text to save it in a file: \n");

		FileWriter fw = new FileWriter("myfile.txt");

		Scanner sc = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();

		while (true) {
			String st = sc.nextLine();
			if (st.isEmpty()) {
				break;
			}
			sb.append(st);
			sb.append("\n");
		}
		
		 if (sb.length() > 0 && sb.charAt(sb.length()-1) == '\n') {
		        sb.deleteCharAt(sb.length()-1); // remove the last empty newline character
		    }

		fw.write(sb.toString());
		fw.close();
		sc.close();
	}

}
