
package StreamsAndFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class countNumberOfLinesInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int linesCount = 0;
		try {
			FileReader fileReader = new FileReader("myfile.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			    while (bufferedReader.readLine() != null) {
			        linesCount++;
			    }

			    bufferedReader.close();
			    fileReader.close();
			    
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}

		   System.out.println("Number of lines in this file is: "+ linesCount);

	}

}
