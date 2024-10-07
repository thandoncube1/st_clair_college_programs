package LabExercises;

public class Lab_Exercise_12 {
  public static double celsiusToFahrenheit(double celsius) {
    double result = (9.0/5) * celsius + 32;
    return result;
  }

  public static double fahrenheitToCelcius(double fahrenheit) {
    double result = (5.0/9) * (fahrenheit - 32);
    return result;
  }

  public static void main(String[] args) {
    System.out.printf("%-20s%-20s|%7s%-20s%-5s%n", "Celsius", "Fahrenheit"," ", "Fahrenheit", "Celsius");
    System.out.println("---------------------------------------------------------------------------");
    for (double i = 40, j = 120; i >= 30 && j >= 30; i--, j -= 10) {
      System.out.printf("%-20.1f%-20.02f|%7s%-20.1f%-5.02f%n", i, celsiusToFahrenheit(i), "", j, fahrenheitToCelcius(j));
    }
  }
}
