package LabExercises;

import java.util.*;

public class Lab_Exercise_14 {

    // Roll dice and return the sum
    public static int rollDiceSum(Random random, int sides) {
        int number1 = random.nextInt(sides) + 1;
        int number2 = random.nextInt(sides) + 1;
        System.out.printf("You rolled %d + %d = %d%n", number1, number2, (number1 + number2));
        return number1 + number2;
    }
    public static void main(String[] args) {
        // Instantiate the relevant classes
        Random random = new Random();
        // Constants
        final String LOSE = "You lose";
        final String WIN = "You win";
        // Define the relevant variables
        int sum;
        int newSum;
        int point = 0;
        String message;
        String newMessage = "";

        // Play the game
        sum = rollDiceSum(random, 6);
        // Evaluate the game logic
        switch (sum) {
            case 2, 3, 12 -> {
                // Craps
                message = LOSE;
            }
            case 7, 11 -> {
                // Natural
                message = WIN;
            }
            case 4, 5, 6, 8, 9, 10 -> {
                // Point -
                point = sum;
                message = "Point is " + point;
            }
            default -> message = "";
        }
        // Print after the initial game logic
        System.out.println(message);

        while (point != 0) {
            newSum = rollDiceSum(random, 6);
            if (newSum == 7) {
                newMessage = LOSE;
            } else if (newSum == sum) {
                newMessage = WIN;
            } else {
                newMessage = LOSE;
            }
            break;
        }
        // Only when the loop ran
        if (!newMessage.isEmpty()) {
            System.out.println(newMessage);
        }
    }
}
