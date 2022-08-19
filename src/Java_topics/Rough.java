package Java_topics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rough {
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a character");
		char ch = (char)br.read();
		//String st = (String)br.readLine();
		int it = Integer.parseInt(br.readLine());
		float ft = Float.parseFloat(br.readLine());
		
		System.out.println("You Entered: "+ch);
		
		

	}

}
