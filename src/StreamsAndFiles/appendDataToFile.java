package StreamsAndFiles;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class appendDataToFile {

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter text to append: \n");
			StringBuilder sb = new StringBuilder();

			while (true) {
				String st = sc.nextLine();
				if (st.isEmpty()) {
					break;
				}
				sb.append(st);
				sb.append("\n");
			}

			FileWriter fw = new FileWriter("myfile.txt", true);

			/*
			 * In Java, the second parameter of the FileWriter constructor specifies whether
			 * the file should be opened in "append mode" or not.
			 * 
			 * If you set the second parameter to true, then the file will be opened in
			 * "append mode", which means that any new data you write to the file will be
			 * appended to the end of the existing data, rather than overwriting it. This is
			 * useful if you want to add new data to the end of an existing file without
			 * deleting the previous contents.
			 */

			fw.write(System.lineSeparator() + sb.toString());
			fw.close();
			sc.close();
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
