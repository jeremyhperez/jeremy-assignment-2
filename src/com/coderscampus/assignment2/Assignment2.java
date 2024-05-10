package com.coderscampus.assignment2;

import java.util.Random;

import java.util.Scanner;

public class Assignment2 {
	private static final int MAX_GUESSES = 5;

	public static void main(String[] args) {

		// generate a random number
		Random random = new Random();
		int theRandomNumber = random.nextInt(100) + 1;
		int guesses = 0;
//		System.out.println(theRandomNumber);
		// define a boolean
		boolean guessedCorrectly = false;

		// and collect user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to play a game?");
		System.out.println(
				"You have " + MAX_GUESSES + " guesses to guess the correct number between 1 and 100, goodluck Human!");
		System.out.println("Pick a number between 1 and 100:");

		while (guesses < MAX_GUESSES) {
			int guess = scanner.nextInt();
			guesses++;

			if (guess == theRandomNumber) {
				System.out.println("You win!");
				guessedCorrectly = true;
				break;
			} else {
				if (guesses < MAX_GUESSES) {
					if (guess < theRandomNumber) {
						System.out.println("Please pick a higher number");
					} else {
						System.out.println("Please pick a lower number");
					}
				}
			}
		}

		if (!guessedCorrectly) {
			System.out.println("You lose! The number was " + theRandomNumber);

		}

		scanner.close();

		// etc.

	}
}
