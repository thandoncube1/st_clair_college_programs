package LabExercises;

import java.util.*;

public class Lab_Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int rounds = 3;
        int plays = 0;
        double score_CPU = 0;
        double score_Player = 0;

        do {
            System.out.print("User: Select Scissors (1), Rock (2), Paper (3): ");
            int selection = input.nextInt();
            System.out.print("CPU: Select Scissors (1), Rock (2), Paper (3): ");
            int computer = rand.nextInt(3) + 1;
            System.out.println(computer);
            // Define the rules of the Game
            if (selection == 2) {
                if (computer == 2) {
                    score_Player += 0.5;
                    score_CPU += 0.5;
                    System.out.println("The computer is Rock. You are Rock too. It is a draw");
                } else if (computer == 1) {
                    score_Player++;
                    System.out.println("The computer is on Scissors. You are on Rock. You won!");
                } else {
                    score_CPU++;
                    System.out.println("The computer is on Paper. You are on Rock. The computer wins!");
                }
            } else if (selection == 3) {
                if (computer == 3) {
                    score_Player += 0.5;
                    score_CPU += 0.5;
                    System.out.println("The computer is on Paper. You are on Paper too. It is a draw");
                } else if (computer == 2) {
                    score_Player++;
                    System.out.println("The computer is on Rock. You are on Paper. You won!");
                } else {
                    score_CPU++;
                    System.out.println("The computer is on Scissors. You are on Paper. The computer wins!");
                }
            } else if (selection == 1) {
                if (computer == 1) {
                    score_Player += 0.5;
                    score_CPU += 0.5;
                    System.out.println("The computer is on Scissors. You are on Scissors too. It is a draw");
                } else if (computer == 2) {
                    score_CPU++;
                    System.out.println("The computer is on Rock. You are on Scissors. The computer won!");
                } else {
                    score_Player++;
                    System.out.println("The computer is on Paper. You are on Scissors. You won!");
                }
            } else {
                System.out.println("You enter an invalid selection.\nSelect between Scissors (0), Rock (1), Paper (2) next time.");
            }

            // Increment after each round.
            plays++;
        } while (plays < rounds);

        System.out.println("""
                    
                    Thank you for playing Our Rock, Paper, Scissors Game.
                    Join us again soon!!!
                """);
        if (score_Player > score_CPU) {
            System.out.println("[Player] wins!!!");
        } else if (score_Player < score_CPU) {
            System.out.println("[CPU] wins!!!");
        } else {
            System.out.println("It's a draw!!!");
        }
        System.out.println("[Player] Score after: " + plays + " is " + score_Player);
        System.out.println("[CPU] score after: " + plays + " games is " + score_CPU);
    }
}
