package StreamsAndFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFiledata_and_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("myfile.txt");
			BufferedReader br = new BufferedReader(fr);

			// Read Paragraph from a file

			String st = br.readLine();
			StringBuilder sb = new StringBuilder();

			while (st != null) {
		        sb.append(st);
		        st = br.readLine();
		        if (st != null) {
		            sb.append(System.lineSeparator());
		        }
		    }
			br.close();
			fr.close();

			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
