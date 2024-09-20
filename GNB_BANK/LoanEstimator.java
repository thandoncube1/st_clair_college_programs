package GNB_BANK;

import java.util.Scanner;

public class LoanEstimator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double prime = 2;
        int creditScore;
        double interest = 0;
        double amountBorrowing;
        boolean loanApproved = true;

        System.out.print("Welcome to GNB Loan Calculator \nPlease enter your credit score: ");
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
        } else {
            if (amountBorrowing < 30000) interest = prime + 5;
            else loanApproved = false;
        }

        if (loanApproved) {
            double amountPaidOver5Years = amountBorrowing * (interest/100) * 5 + amountBorrowing;
            double amountPaidOver10Years = amountBorrowing * (interest/100) * 10 + amountBorrowing;
            System.out.printf("You've been approved for $%,3.2f ", amountBorrowing);
            System.out.printf(" your interest rate will be %.2f%s\n", interest, "%");
            System.out.printf("After 5 years you'll have paid $%,3.2f\n", amountPaidOver5Years);
            System.out.printf("After 10 years you'll have paid $%,3.2f", amountPaidOver10Years);
        } else System.out.println("Your loan was not approved");
    }
}
