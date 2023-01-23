package Java_topics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class stringTokenizer {

	public static void main(String[] args) throws IOException {
		
		// to accept input from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Ask for input separated by comma
		System.out.println("Enter name, age, salary: ");
		
		//accept input into a String
		String str = (String)br.readLine();
		
		//use String tokenizer to split input at commas
		StringTokenizer st = new StringTokenizer(str, ",");
		 
		//we have 3 tokens as String
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String s3 = st.nextToken();
		
		//trim any spaces before and after the token
		s1 = s1.trim();
		s2 = s2.trim();
		s3 = s3.trim();
		
		//convert s1 into String s2 into an int and s3 into a float
		String name =s1;
		int age = Integer.parseInt(s2);
		float salary = Float.parseFloat(s3);
		
		//Dislay entered data
		System.out.println("Name= "+name);
		System.out.println("Age= "+age);
		System.out.println("Salary= "+salary);
		
		char arr[] = {'n','i','t','i','s','h'};
		String s = new String(arr,2,3);
		System.out.println(s);

	}

}
