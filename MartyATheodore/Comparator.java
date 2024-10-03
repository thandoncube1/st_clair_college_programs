package MartyATheodore;

import java.util.Scanner;

public class Comparator {
    public static double min(double num1, double num2) {
        if (num1 < num2) return num1;
        else return num2;
    }

    public static double max(double num1, double num2) {
        if (num1 > num2) return num1;
        else return num2;
    }

    public String printStatement(String[] args) {
        return args.toString();
    }

    public static void main(String[] args) {
        //Take in two numbers
        // Run the three comparisons
        // Output which are true and false
        Scanner input = new Scanner(System.in);
        Comparator myComparator = new Comparator();
        System.out.println("""
                    This program will compare 2 numbers to each other and output the follow:
                    1) Is the first number greater  than the second
                    2) Is the first number less than the second
                    3) Is the first number equal to the second
                """);
        System.out.println("Please input the first number");
        double num1 = input.nextDouble();
        System.out.println("Please input the second number");
        double num2 = input.nextDouble();

        double minimum = min(num1, num2);
        System.out.printf("Smallest: %.0f\n", minimum);
        System.out.printf("Largest: %.0f", max(num1, num2));
    }
}