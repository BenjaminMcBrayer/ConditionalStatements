import java.util.Scanner;

public class IntegerRange {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int userNum = 0;
		String playAgain = null;

		do {
			System.out.print("Enter a number between 1 and 100: ");
			userNum = scnr.nextInt();
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
				System.out.println();
				System.out.println("Would you like to continue (y/n)?");
				playAgain = scnr.next();
				scnr.nextLine();
		} while (playAgain.equalsIgnoreCase("y"));
		
		if (!playAgain.equalsIgnoreCase("y")) {
			System.out.println("Goodbye!");
		}

		scnr.close();
	}
}
