package Java_topics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// WAP to display occurrence count of each characters in a string

public class Rough {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a name..");
		String st = br.readLine();
		
		//char ch[] = st.toCharArray();
		

		for (int i = 0; i <st.length(); i++) {
			
			char ch = st.charAt(i);
			
			int count=0;
			for (int j = 0; j < st.length(); j++) {
				if(ch==st.charAt(j)) {
					//System.out.println(" current i value ="+i);
					if(st.indexOf(st.charAt(i))>st.indexOf(st.charAt(j))) {	
						//System.out.println("i="+st.indexOf(st.charAt(i))+" j= "+st.indexOf(st.charAt(j)));
						//count--;
						count++;
					}
					
				}
			}
			System.out.println(ch+" count is "+count);
		}
	}
}
