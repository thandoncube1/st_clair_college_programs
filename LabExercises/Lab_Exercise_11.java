package LabExercises;

import java.util.*;

public class Lab_Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int playerWins = 0;
        int cpuWins = 0;
        boolean endgame = false;

        do {
            System.out.print("User: Select Scissors (1), Rock (2), Paper (3): ");
            int selection = input.nextInt();
            System.out.print("CPU: Select Scissors (1), Rock (2), Paper (3): ");
            int computer = rand.nextInt(3) + 1;
            System.out.println(computer);
            // Define the rules of the Game
            if (selection == 2) {
                if (computer == 2) {
                    System.out.println("The computer is Rock. You are Rock too. It is a draw");
                } else if (computer == 1) {
                    playerWins++;
                    System.out.println("The computer is on Scissors. You are on Rock. You wins!");
                } else {
                    cpuWins++;
                    System.out.println("The computer is on Paper. You are on Rock. The computer wins!");
                }
            } else if (selection == 3) {
                if (computer == 3) {
                    System.out.println("The computer is on Paper. You are on Paper too. It is a draw");
                } else if (computer == 2) {
                    playerWins++;
                    System.out.println("The computer is on Rock. You are on Paper. You wins!");
                } else {
                    cpuWins++;
                    System.out.println("The computer is on Scissors. You are on Paper. The computer wins!");
                }
            } else if (selection == 1) {
                if (computer == 1) {
                    System.out.println("The computer is on Scissors. You are on Scissors too. It is a draw");
                } else if (computer == 2) {
                    cpuWins++;
                    System.out.println("The computer is on Rock. You are on Scissors. The computer wins!");
                } else {
                    playerWins++;
                    System.out.println("The computer is on Paper. You are on Scissors. You wins!");
                }
            } else {
                  System.out.println("You enter an invalid selection.\nSelect between Scissors (0), Rock (1), Paper (2) next time.");
            }

            if (cpuWins - playerWins == 2) {
                endgame = true;
            } else if (playerWins - cpuWins == 2) {
                endgame = true;
            }

        } while (!endgame);

        System.out.println("""

                    Thank you for playing Our Rock, Paper, Scissors Game.
                    Join us again soon!!!
                """);

        System.out.println("[CPU Wins]: " + cpuWins);
        System.out.println("[Player Wins]: " + playerWins);
    }
}
