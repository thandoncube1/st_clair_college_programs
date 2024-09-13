package LabExercises;

import java.util.*;

public class Exercise2_6 {
    public static void main(String[] args) {
        // Sum the digits in an integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between (0 - 1000): ");
        int digit = input.nextInt();
        int solution;
        int rvalue;
        int lvalue;
        int cvalue;
        // Calculate the sum of the digits
        if (digit < 9) {
            System.out.println(digit);
        } else if (digit >= 10 && digit < 100) {
            lvalue = digit / 10;
            rvalue = digit % 10;
            System.out.print("Result: " + (lvalue + rvalue));
        } else if (digit >= 100 && digit <= 1000) {
            lvalue = digit / 100;
            cvalue = (digit / 10) % 10;
            rvalue = digit % 10;
            solution = lvalue + cvalue + rvalue;
            if (digit == 1000) solution = 1; // case for 1000.
            System.out.println("Result: " + solution);
        } else {
            System.out.println("Number is not in the range.");
        }
    }
}
