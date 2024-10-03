package LabExercises;


import java.util.*;

public class Lab_Exercise_10 {
    public static void main(String[] args) {
      // Set up the Random class
        Random random = new Random();
        // Declare a heads and tails count and the random coin flip.
        int numberOfHeads = 0, numberOfTails = 0, randCoinFlip = 0;

        for (int i = 0; i < 1000000; i++) {
            randCoinFlip = random.nextInt(2) + 1;
            // Check the different conditions and environment
            if (randCoinFlip == 1) {
               numberOfHeads++;
            } else if (randCoinFlip == 2) {
               numberOfTails++;
            }
        }

        System.out.println("Number of HEADS: " + numberOfHeads + "\nNumber of TAILS: " + numberOfTails);
    }
}
