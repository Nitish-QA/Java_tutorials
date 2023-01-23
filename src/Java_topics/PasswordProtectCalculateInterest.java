package Java_topics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswordProtectCalculateInterest {

	static double balance = 0;
	static double rateOfInterest = 0;
	static BufferedReader br;

	void askpassword() throws IOException {
		System.out.println("Enter your password: ");

		br = new BufferedReader(new InputStreamReader(System.in));
		String pass = br.readLine();
		if (pass.equals("java_25j")) {

			InterestAmount in = new InterestAmount();
			System.out.println("Welcome!! Your interest amount is: ");
			in.calInt();

		} else {
			System.out.println("You have entered a wrong password. Please run the code again to retry.");
		}
	}

	public static void main(String[] args) throws IOException {
		PasswordProtectCalculateInterest obj = new PasswordProtectCalculateInterest();
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter Rate of Interest ");
		rateOfInterest = Double.parseDouble(br.readLine());

		System.out.println("Please enter amount of which interest to be calculated: ");
		balance = Double.parseDouble(br.readLine());

		obj.askpassword();
	}

	private class InterestAmount {
		void calInt() {
			double interest = balance * rateOfInterest / 100;
			System.out.println(interest);
		}
	}
}
