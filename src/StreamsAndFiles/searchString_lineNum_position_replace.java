package StreamsAndFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class searchString_lineNum_position_replace {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter string to find");
		Scanner sc = new Scanner(System.in);
		
		String searchST = sc.nextLine();
		System.out.println("Enter new string to replace");
		
		String replaceST = sc.nextLine();
		
		
		
		
		try {
			FileReader fr = new FileReader("myfile.txt");
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
			
			while(br.readLine() != null) {
				
				
			}
			
			//StringBuilder sb = new StringBuilder();
			
			int lineNum = 0;
			int count = 0;
			
			String line;
			while((line = br.readLine()) !=null) {
				lineNum++;
				int index = 0;
				while((index = line.indexOf(searchST, index)) != -1) {
					bw.write(line.substring(0,index) + replaceST);
					index += searchST.length();
					count++;
				}
				if (count > 0) {
			        bw.write(line.substring(index));
			        bw.write(System.lineSeparator());
			    } else {
			        bw.write(line);
			        bw.write(System.lineSeparator());
			    }
			    count = 0;
	        }	
			
			System.out.println("Total Occurances: " + count);
			fr.close();
			br.close();
			bw.close();
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
