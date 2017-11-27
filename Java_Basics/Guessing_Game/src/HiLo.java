import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Create a random number for a user to guess
		String playAgain = "";
		do {
			int theNumber = (int)(Math.random() * 100 + 1);
			//System.out.println( theNumber );
			int guess = 0;
			int numberOfTries = 0;
			while (guess != theNumber) {
				System.out.println("Guess a number between 1 and 100:");
				guess = scan.nextInt();
				numberOfTries = numberOfTries + 1;
				System.out.println("Number of Attempts:" + numberOfTries);
				if (guess < theNumber)
					System.out.println(guess + " is too low.  Try again.");
				else if (guess > theNumber)
					System.out.println(guess + " is too high. Try again.");
				else
					System.out.println(guess + " is correct! You win! " + "It only took you " + numberOfTries + " tries! Great job!");
				//End of while loop for guessing
			}
			System.out.println("Would you like to play again (y/n)?");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing! Goodbye.");
		scan.close();
	}

}
