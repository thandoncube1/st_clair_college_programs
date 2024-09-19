package Calculator;

import java.util.Scanner;

public class ComparatorTwo {
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

        if (num1 > num2) System.out.print("The first number is greater than the second");
        else if (num1 < num2) System.out.print("The first number is less than the second");
        else if (num1 == num2) System.out.print("The first number is equal to the second");
        else System.out.print("Some how there is no comparison for the two");


        System.out.println("Enter a name: ");
        String str1 = input.toString();
        System.out.println("Enter a name 2: ");
        String str2 = input.toString();

        System.out.print(System.identityHashCode(str1));
        System.out.print(System.identityHashCode(str2));
        System.out.print(str1.hashCode());
        System.out.print(str2.hashCode());

    }
}
