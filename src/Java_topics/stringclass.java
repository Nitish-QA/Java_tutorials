package Java_topics;

/*
 * Notes:
	> Q.Is String a class or datatype?
		String is a class, but in java all classes are also considered data types. So we can take String as data type also.
			
	> String is immutable.
		We cannot modify or change a string once created
		
	> Differance between String and StringBuffer
		String is immutable and cannot be modified, so to overcome this java introduced StringBuffer which is mutable
*/

public class stringclass {

	public static void main(String[] args) {
		
	//VVI - Immutable String
		String k1 = "data";
		String k2 = "base";
		k1 = k1 + k2;
		System.out.println(k1);  //Output is: database
		// if String is immutable then why k1 got mpdified from data to database?
		/*
		 * Answer: Here JVM created two objects k1 and k2 separately When k1 + k2 is
		 * done, JVM actually created a third object and stored 'database' inside it so
		 * k1 referance is now referring the new object. So the old object that contains
		 * 'data' has lost its referance.
		 */
		
	  // 1-Join two string using + sign
		String s1 = "Hydera";
        String s2 = "bad";
        String s3 = s1+s2;
        System.out.println("1-City name is:  "+s3);
        
      // 2-Join two string using concat method
        String p1 = "Hydera";
        String p2 = "bad";
        String p3 = p1.concat(p2);       
        System.out.println("2-City name is:  "+p3);
        
        
      // 3-Create string from characters array
        char arr[] = {'N','i','t','i','s','h'};
        String str = new String(arr);
        System.out.println("3-Name: "+str);
        
        
       //4-Create string from selected range of characters array
        char arr2[] = {'N','i','t','i','s','h'};
        String str2 = new String(arr2, 3,3);
        System.out.println("4-Name last three chars: "+str2);
        
        //5-Display particular char in string using charAt
        String city = "Bhagalpur";
        System.out.println("5-City 3rd last letter: "+ city.charAt(6));
        
        //6-To find length of string
        String company = "Prophecy";
        System.out.println("6-Number of letters in company name is: "+ company.length());
        
        //7-To find place of string inside an another string
        String companyname = "Prophecy Sensorlytics pvt. ltd.";
        String type     = "pvt.";
        System.out.println("7-location of 'pvt.' in company: "+ companyname.indexOf(type));
        
        //8-To correct spelling of a string - to replace character inside a string
        String org = "Prophacy Sensorlytics pvt. ltd.";
        String orgnew  = org.replace('a', 'e');  //Need to store into new string as string are final in nature
        System.out.println("8-New Company name: "+ orgnew);
        
        //9 -To display part of a string or we can say substring
        String com2 = "Prophecy Sensorlytics pvt. ltd.";
        String ss  = com2.substring(9);
        System.out.println("9-subtring of a string: "+ ss);
        
        //10 - To convert string to lowercase
        String com3 = "PropHecy SensORlyTics Pvt. ltd.";
        System.out.println("10-Lowercase name "+ com3.toLowerCase());
        
        //11- To convert string to uppercase
        String com4 = "PropHecy SensORlyTics Pvt. ltd.";
        System.out.println("11-Uppercase name "+ com4.toUpperCase());
        
        //12 - To remove space from start and end
        String com5 = "        Prophecy Sensorlytics pvt. ltd.     ";
        System.out.println("12-Trimmed space:"+ com5.trim());
        
        //13- To split a string into pieces wherever a space is found
        String com6 = "Prophecy Sensorlytics";
        String arr3[];
        arr3 = com6.split("");
       
        String com7 = "Nitish,Rahul,Rajesh,Mukesh,Prakash";
        String arr4[];
        arr4 = com7.split(",");
        
        for(String i:arr3) {
        	System.out.println("13A-each letters in new line: "+i);
        	
        }
        for(String i:arr4) {
        	System.out.println("13A-each letters in new line: "+i);
        	
        }   
	}
}
