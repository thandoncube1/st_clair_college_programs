package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        double solution;
        double number1, number2;
        System.out.println("""
                Welcome to the calculator app
                1. Multiply two numbers
                2. Divide number 1 by number 2
                3. Subtract number 2 from number 1
                4. Add number 1 to number 2
                5. Mod number 1 by number 2
                Please select an option (1-5):\s""");
        option = input.nextInt();
        System.out.print("Please enter the first number: ");
        number1 = input.nextDouble();
        System.out.print("Please enter the second number: ");
        number2 = input.nextDouble();

        // Control flow
        switch (option) {
            case 1 -> {
                solution = number1 * number2;
                System.out.printf("Number1 * Number2: %.0f", solution);
            }
            case 2 -> {
                solution = number1 / number2;
                System.out.printf("Number1 / Number2: %.2f", solution);
            }
            case 3 -> {
                solution = number2 - number1;
                System.out.printf("Number2 - Number1: %0f", solution);
            }
            case 4 -> {
                solution = number1 + number2;
                System.out.printf("Number1 + Number2: %.0f", solution);
            }
            case 5 -> {
                solution = number1 % number2;
                System.out.printf("Number1 %% Number2: %.0f", solution);
            }
            default -> System.out.println("Wrong option selected.");
        }
    }
}
