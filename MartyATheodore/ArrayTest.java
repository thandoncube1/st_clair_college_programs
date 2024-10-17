package MartyATheodore;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] lottoNumbers = new int[7];
        int userInput = 0;
        int i = 0;
        while(i < lottoNumbers.length) {
            System.out.printf("Enter lotto numbers %d: \n", (i+1));
            userInput = input.nextInt();
            lottoNumbers[i] = userInput;
            i++;
        }
    }
}
