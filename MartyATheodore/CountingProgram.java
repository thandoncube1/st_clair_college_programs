package MartyATheodore;

import java.util.Scanner;

public class CountingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
               Welcome to the Counting Pragram
               For my Grade ones
               Enter a number and compare with previous, if higher record the current
               Else keep the score.
               
               To exit enter (-1)
                """);
        double score = 0;
        double highestNumber = 0;
        double previous = 0;
        double current = 0;
        int exit = 0;

        do {
            System.out.print("Enter the score from student: ");
            current = input.nextInt();
            System.out.println("Previous - " + previous);
            highestNumber = Comparator.max(previous, current);
            if (previous < highestNumber) {
                score = highestNumber;
                previous = score;
            }

            System.out.printf("The Current High Score is: %.0f\n", score);
            System.out.printf("The current input is: %.0f\n", current);

            if (current == -1) {
                exit = -1;
            }
        } while(exit != -1);

        System.out.println("Thank you playing!");
    }
}
