package LabExercises;

public class Lab_Exercise_13 {
  public static void displayPattern(int n) {
    for (int i = 0; i <= n; i++) {
      System.out.printf("%" + (n-i+1) + "s", "");
      for (int j = i; j > 0; j--) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
