package Calculator;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        // Take in two numbers
        // Run the three comparisons
        // Output which are true or false
        Scanner input = new Scanner(System.in);
        System.out.print("""
                This program will compare 2 numbers to each other and output the following:
                1) Is the first number greater than the second 
                2) Is the first number less than the second 
                3) Is the first number equal to the second
                """);
        System.out.print("Please enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Please enter the second number: ");
        double num2 = input.nextDouble();

        if (num1 > num2) System.out.println("The first number is greater than the second");
        else System.out.println("The first number is not greater than the second");
        if (num1 < num2) System.out.println("The first number is less than the second");
        else System.out.println("The first number is not less than the second");
        if (num1 == num2) System.out.println("The first number is equal to the second");
        else System.out.println("The first number is not equal to the second");
    }
}
