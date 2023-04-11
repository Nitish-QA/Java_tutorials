package Java_topics;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	static Scanner sc;

	public static void main(String[] args) {

		System.out.println("***********Lets start Rock Paper Scissors Game:********** \n");
		// TODO Auto-generated method stub

		String firstUser = takeFirstUserInput();

		if (!((firstUser.trim().equalsIgnoreCase("rock")) || (firstUser.trim().equalsIgnoreCase("paper"))
				|| (firstUser.trim().equalsIgnoreCase("scissor")))) {
			System.out.println("INVALID INPUT PLEASE RETRY \n");
			takeFirstUserInput();
		}

		String[] arr = { "rock", "paper", "scissor" };

		Random random = new Random();

		int randomNumber = random.nextInt(arr.length - 1);

		String systemInput = arr[randomNumber].toString();

		if ((firstUser.equalsIgnoreCase("Rock")) && (systemInput.equalsIgnoreCase("Paper"))) {
			System.out.println("----------You lost the match against " + systemInput + "--------");
		} else if ((firstUser.equalsIgnoreCase("Paper")) && (systemInput.equalsIgnoreCase("Scissor"))) {
			System.out.println("---------You lost the match against " + systemInput + "-----------");
		} else if ((firstUser.equalsIgnoreCase("scissor")) && (systemInput.equalsIgnoreCase("rock"))) {
			System.out.println("-----------You lost the match against " + systemInput + "----------");
		} else if (firstUser.equalsIgnoreCase(systemInput)) {
			System.out.println("------------Match Tied------------");

		} else {
			System.out.println("You are the Winner");
		}

	}

	public static String takeFirstUserInput() {
		System.out.println("Select your input among Rock, Paper and Scissor: \n");
		sc = new Scanner(System.in);
		String firstUser = sc.nextLine();
		return firstUser;
	}

}
