package LabExercises;

import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args) {
        // Calculate volume of a Cylinder
        // V = Pi * r^2 * h
        Scanner input = new Scanner(System.in);
        // Enter the values you need radius and height
        System.out.print("Enter the Radius: ");
        int radius = input.nextInt();
        System.out.print("Enter the Height: ");
        int height = input.nextInt();

        // Calculation
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.printf("Volume: %.2f", volume);
    }
}
