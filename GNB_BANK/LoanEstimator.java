package GNB_BANK;

import java.util.Scanner;

public class LoanEstimator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double prime = 2;
        int creditScore;
        double interest;
        double amountBorrowing;

        System.out.println("""
                Welcome to GNB Loan Calculator
                Please enter your credit score:
                """);
        creditScore = input.nextInt();
        System.out.println("Please enter the amount you'd like to borrow:");
        amountBorrowing = input.nextDouble();
        if (creditScore >= 781) {
            interest = prime;
        } else if (creditScore >= 661) {
            if (amountBorrowing < 30000) interest = prime + 0.5;
            else interest = prime + 1;
        } else if (creditScore >= 601) {
            if (amountBorrowing < 30000) interest = prime + 1;
            else interest = prime + 2;
        } else if (creditScore >= 501) {
            if (amountBorrowing < 30000) interest = prime + 2;
            else interest = prime + 5;
        } else interest = prime + 5;
    }
}
