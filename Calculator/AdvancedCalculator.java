package Calculator;

import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner stdInput = new Scanner(System.in);
        System.out.print("""
            Welcome to the Advanced Calculator
            1) Calculate a number raised to the power of another number
            2) Calculate the log base 10 of a number
            3) Calculate the square root of a number
            Choose an option (1 - 3):
            """);
        int choice = stdInput.nextInt();
        System.out.print("Enter a number: ");
        double number1 = stdInput.nextDouble();
        double number2;
        double solution;

        switch (choice) {
            case 1 -> {
                // Select the next number
                System.out.print("Enter the second number: ");
                number2 = stdInput.nextDouble();
                // Calculate the solution
                solution = Math.pow(number1, number2);
                System.out.printf("Result: %.0f", solution);
            }
            case 2 -> {
                solution = Math.log10(number1);
                System.out.printf("Result: %.5f", solution);
            }
            case 3 -> {
                double raise = 1.0 / 2;
                solution = Math.pow(number1, raise);
                System.out.printf("Result: %.2f", solution);
            }
            default ->
                System.out.println("The choice you entered in invalid");
        }
    }
}
