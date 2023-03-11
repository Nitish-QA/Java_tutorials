package Java_topics;

import java.util.Scanner;

public class SwapNumberWithoutThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number = ");
		a = sc.nextInt();
		System.out.println("Enter second number = ");
		b = sc.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Value of a and b are "+ a +" and "+ b + "respectively");

	}

}
