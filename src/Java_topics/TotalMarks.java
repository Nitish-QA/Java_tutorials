package Java_topics;

//Write a program to find total marks of all the subjects.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalMarks {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter total number of subjects...");
		
		int n = Integer.parseInt(br.readLine());
		
		Integer marks[] = new Integer[n];
		
		System.out.println("Enter marks of all the "+n+" subjects one by one and press enter");
		int total =0;
		for(int i=0; i<n; i++) {
			marks[i] = Integer.parseInt(br.readLine());	
			total += marks[i];
		}
		
		System.out.println("Total marks obtained in all "+n+" subjects: "+total);
		
		float percent = (float)total/n;
		System.out.println("Total Percentage is  "+percent+"%");
		
	
		
		
		

	}

}
