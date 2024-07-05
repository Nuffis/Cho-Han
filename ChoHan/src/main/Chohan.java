package main;

import java.util.Random;
import java.util.Scanner;

public class Chohan {
	public static void main (String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		boolean keepPlaying = true;
		
		System.out.println("Welcome to Evens or odds!");
		
		
		while (keepPlaying) {
		
		int die1 = random.nextInt(6) + 1;
		int die2 = random.nextInt(6) + 1;
		int sum = die1 + die2;
		
		System.out.println("\nThe dies have rolled, place your bets!");
		String bet = scanner.next();
		
		String result;
		if (sum % 2 == 0) {
			result = "Even";
		} else {
			result = "Odd";
		}
		
		if (bet.equalsIgnoreCase(result)) {
			System.out.println("You win! The sum is " + sum + " (" + result + ").");
		} else {
			System.out.println("You lose. The sum is " + sum + " (" + result + ").");
		}
		
		
		System.out.print("Do you want to play again? (yes/no): ");
		String playAgain = scanner.next();
		if (!playAgain.equalsIgnoreCase("yes")) {
			keepPlaying = false;
			System.out.println("Thanks for playing!");
		}
		
		
	}
		scanner.close();
}
}
