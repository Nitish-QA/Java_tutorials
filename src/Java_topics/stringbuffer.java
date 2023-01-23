package Java_topics;

public class stringbuffer {
	
	/*
	 * StringBuffer is introduced to overcome the problem with String immutablility.
	 * StringBuffer class objects are mutable and can be modified
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration 
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		
		//Declaration
		StringBuffer sb2 = new StringBuffer();
		sb2.append("Hello");
		System.out.println(sb2);
		
		//1-add characters to and existing stringbuffer
		StringBuffer sb3 = new StringBuffer("Pro");
		sb3.append("phecy");
		System.out.println("1-appended value: "+sb3);
		
		//2-Insert new value after string
		StringBuffer sb4 = new StringBuffer("KAHAL");
		sb4.insert(2, "US");  //will insert at 2nd position starting from 0
		System.out.println("2-Name correction: "+sb4);
		
		//3-Delete extra character from the string
		StringBuffer sb5 = new StringBuffer("KAUSSHHAL");
		sb5.delete(4,6);  // here 4 represents starting character to delete and 6 represents till (6-1)th position 
		System.out.println("3-deleted extra characters "+sb5);
		
		//4-Reverse a character
		StringBuffer sb6 = new StringBuffer("KAUSHAL");
		sb6.reverse();
		System.out.println("4-Reversed name: "+sb6);
		
		//5-Convert String type to StringBuffer
		//This we will understand using a famous program
		//Write a program to check if string is a plindrome or not.
		
		String str = "rotator";
		String temp = str;
		StringBuffer sb7 = new StringBuffer(str);  
		//here we converted String str into StringBufffer type and stored in sb7, to make it mutable and also to use its method reverse()
		
		sb7.reverse();	
		
		//now again convert StringBuffer type to String type
		str = sb7.toString();
		
		if(temp.equalsIgnoreCase(str)) {
			System.out.println("5-This is a palindrome");
		}else{
			System.out.println("5-This is not a palindrome");
		}
		
		
		
		

	}

}
