
//Benjamin McBrayer
//This Java console program uses conditional statements to automate the decision-making process.
import java.util.Scanner;

public class IntegerRange {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int userNum = 0;
		String userInfo;
		String playAgain = null;

		// Ask for user information.
		System.out.print("Please enter your name: ");
		userInfo = scnr.next();
		System.out.println("Hello, " + userInfo + "!");

		do {// Prompt user to enter an integer.
			System.out.print("Please enter a number between 1 and 100: ");
			userNum = scnr.nextInt();

			if (userNum >= 1 && userNum <= 100) {
				// Subject integer to a series of conditions to determine its range and whether
				// it is even or odd.
				System.out.print("Output: " + userNum);
				if ((userNum / 2 * 2) == userNum) {
					System.out.print(" is even");
				}
				if (((userNum / 2 * 2) == userNum) && ((userNum >= 2) && (userNum <= 25))) {
					System.out.print(" and less than 25");
				}
				if ((userNum / 2 * 2) != userNum) {
					System.out.print(" is odd");
				}
				if (((userNum / 2 * 2) != userNum) && (userNum >= 60)) {
					System.out.print(" and over 60");
				}
			} else {
				System.out.println(userInfo + ", your number is not between 1 and 100.");
			}
			// Ask if the user wants to continue entering numbers.
			System.out.println();
			System.out.println(userInfo + ", would you like to continue (y/n)?");
			playAgain = scnr.next();
			scnr.nextLine();

		} while (playAgain.equalsIgnoreCase("y"));
		
		// End program officially if user enters anything other than "Y" or "y."
		if (!playAgain.equalsIgnoreCase("y")) {
			System.out.println("Goodbye, " + userInfo + "!");
		} 
		scnr.close();
	}
}
