package Random;

import java.util.*;

public class EasterEggGame {
    public enum Level {
        EASY,
        MEDIUM,
        HARD,
        LEGENDARY
    }

    public static Level getLevel(String option) {
        Level level = Level.EASY;
        switch (option) {
            case "E" -> {
                level = Level.EASY;
            }
            case "M" -> {
                level = Level.MEDIUM;
            }
            case "H" -> {
                level = Level.HARD;
            }
            case "L" -> {
                level = Level.LEGENDARY;
            }
        }
        return level;
    }

    public static void main(String[] args) {
        // Welcome to the game and ask them to select difficult level
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;
        int numberOfGuesses = 0;

        System.out.println("""
                Welcome to the Easter Egg Game
                1. Enter the difficult level
                    (E) Easy
                    (M) Medium
                    (H) Hard
                    (L) Legendary
                2. Enter the number of rounds
                """);
        System.out.print("Please enter the difficult level: ");
        String option = input.next().strip().toUpperCase();

        // Accept user for number of rounds
        System.out.print("\nPlease enter the number of rounds: ");
        int numberOfRounds = input.nextInt();

        // PER ROUND:
        // Generate proper random answer based on the difficult level
        int secretNumber = 0;
        switch (getLevel(option)) {
            case EASY ->  {
                secretNumber = rand.nextInt(10) + 1;
            }
            case MEDIUM -> {
                secretNumber = rand.nextInt(50) + 1;
            }
            case HARD -> {
                secretNumber = rand.nextInt(100) + 1;
            }
            case LEGENDARY -> {
                secretNumber = rand.nextInt(1000) + 1;
            }
        }

        int guess = 0;
        // Ask user for number guess until correct
        while (guess != secretNumber) {
            System.out.println("Enter a guess: ");
            guess = input.nextInt();
            // add score to total score
            if (guess == secretNumber) {
                System.out.println("You Guessed correct!!" + guess);
                totalScore += 50;
            } else if (guess < secretNumber) { // TODO: Add the difficulty level
                numberOfGuesses++;
                System.out.println("Guess a little higher....");
            } else if (guess > secretNumber) { // TODO: Add the difficulty level here
                numberOfGuesses++;
                System.out.println("Guess a little lower....");
            }
        }
        // Display end message
        System.out.println("Sorry try again next time...\n");
        System.out.println("""
                    Thank you for playing with us this was Fun!!!
                    Join us again soon! ⛱️
                    """);
        // Display the total score (lower is better)
        // Display number of guesses as well
        System.out.println("Total number of Guesses: " + numberOfGuesses);
        System.out.println("Total score: " + totalScore);
    }
}
