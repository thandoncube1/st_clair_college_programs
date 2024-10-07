package LabExercises;

import java.util.*;

public class Lab_Exercise_13Test {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean exit = false;
    int number;
    while (!exit) {
      System.out.print("\nEnter a number [n > 1] or -1 to Exit: \n"); 
      number = input.nextInt();
      Lab_Exercise_13.displayPattern(number);

      if (number == -1) {
        exit = true;
      }
    }
  }
}
