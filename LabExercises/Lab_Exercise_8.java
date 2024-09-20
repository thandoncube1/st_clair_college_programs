package LabExercises;

import java.util.Scanner;

public class Lab_Exercise_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                Welcome to the Calculate Area Software, what would you like to calculate the area of?
                1) Circle
                2) Square
                3) Rectangle
                Enter a number (1 - 3):
                """);
        int option = input.nextInt();
        double length;
        double width;
        double solution;

        switch(option) {
            case 1 -> {
                System.out.print("Please enter the radius of a Circle: ");
                double radius = input.nextDouble();
                solution = Math.PI * Math.pow(radius, 2);
                System.out.printf("The area of a circle with the radius %.2f is %.2f", radius, solution);
            }
            case 2 -> {
                System.out.print("Please enter the length of a Square: ");
                length = input.nextDouble();
                solution = Math.pow(length, 2);
                System.out.printf("The area of a Square with the length of %.2f is %.2f", length, solution);
            }
            case 3 -> {
                System.out.print("Please enter the length of a Rectangle: ");
                length = input.nextDouble();
                System.out.print("Please enter the width of a Rectangle: ");
                width = input.nextDouble();
                solution = length * width;
                System.out.printf("The are of a Rectangle with the length of %.2f and width of %.2f is %.2f", length, width, solution);
            }
            default -> System.out.println("Invalid input option");
        }
    }
}
