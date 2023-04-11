package Java_topics;

import java.util.Scanner;

public class RockPaperScissorTwoUser {

	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstUser = takeFirstUserInput();

		if (!((firstUser.trim().equalsIgnoreCase("rock")) || (firstUser.trim().equalsIgnoreCase("paper"))
				|| (firstUser.trim().equalsIgnoreCase("scissor")))) {
			System.out.println("INVALID INPUT PLEASE RETRY \n");
			takeFirstUserInput();
		}

		String secondUser = takeSecondUserInput();

		if (!((secondUser.trim().equalsIgnoreCase("rock")) || (secondUser.trim().equalsIgnoreCase("paper"))
				|| (secondUser.trim().equalsIgnoreCase("scissor")))) {
			System.out.println("INVALID INPUT PLEASE RETRY \n");
			takeSecondUserInput();
		}

		if ((firstUser.equalsIgnoreCase("Rock")) && (secondUser.equalsIgnoreCase("Paper"))) {
			System.out.println("Second User is the Winner");
		} else if ((firstUser.equalsIgnoreCase("Paper")) && (secondUser.equalsIgnoreCase("Scissor"))) {
			System.out.println("Second user is the winner");
		} else if ((firstUser.equalsIgnoreCase("scissor")) && (secondUser.equalsIgnoreCase("rock"))) {
			System.out.println("Second User is the Winner");
		} else if (firstUser.equalsIgnoreCase(secondUser)) {
			System.out.println("This is a Tie");

		} else {
			System.out.println("First User is the Winner");
		}

	}

	public static String takeFirstUserInput() {
		System.out.println("Select input for user First User among Rock, Paper and Scissor: \n");
		sc = new Scanner(System.in);
		String firstUser = sc.nextLine();
		return firstUser;
	}

	public static String takeSecondUserInput() {
		System.out.println("Select input for user Second User among Rock, Paper and Scissor: \n");
		sc = new Scanner(System.in);
		String secondUser = sc.nextLine();
		return secondUser;
	}

}
