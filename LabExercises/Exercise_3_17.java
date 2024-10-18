package LabExercises;

import java.util.Scanner;

public class Exercise_3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("User: Select Scissors (0), Rock (1), Paper (2): ");
        int selection = input.nextInt();
        System.out.print("CPU: Select Scissors (0), Rock (1), Paper (2): ");
        int computer = input.nextInt();

        // Define the rules of the Game
        if (selection == 1) {
            if (computer == 1) System.out.println("The computer is Rock. You are Rock too. It is a draw");
            else if (computer == 0) System.out.println("The computer is on Scissors. You are on Rock. You won!");
            else System.out.println("The computer is on Paper. You are on Rock. The computer wins!");
        } else if (selection == 2) {
            if (computer == 2) System.out.println("The computer is on Paper. You are on Paper too. It is a draw");
            else if (computer == 1) System.out.println("The computer is on Rock. You are on Paper. You won!");
            else System.out.println("The computer is on Scissors. You are on Paper. The computer wins!");
        } else if (selection == 0) {
            if (computer == 0) System.out.println("The computer is on Scissors. You are on Scissors too. It is a draw");
            else if (computer == 1) System.out.println("The computer is on Rock. You are on Scissors. The computer won!");
            else System.out.println("The computer is on Paper. You are on Scissors. You won!");
        } else System.out.println("You enter an invalid selection.\nSelect between Scissors (0), Rock (1), Paper (2) next time.");
    }
}
