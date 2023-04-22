package StreamsAndFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class countNumberOfCharactersInFile {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("myfile.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);

			int character;
			int count = 0;

			while ((character = bufferedReader.read()) != -1) {
				count++;
			}

			System.out.println("Number of characters in the file: " + count);

			reader.close();
			bufferedReader.close();
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
