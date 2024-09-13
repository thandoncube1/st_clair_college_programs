package LabExercises;

import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {
        // Convert Celsius to Fahrenheit
        Scanner stdInput = new Scanner(System.in);
        // Enter the temperature in degrees Celsius
        System.out.print("Enter the temperature in Degrees Celsius: ");
        double temperature = stdInput.nextDouble();
        // Calculate the conversion to Fahrenheit
        double fahrenheit = ((temperature * 9)/5) + 32;
        // Print the value of the temperature
        System.out.printf("Temperature in Fahrenheit %.1f°F", fahrenheit);
    }
}
