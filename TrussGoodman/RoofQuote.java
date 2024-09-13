package TrussGoodman;

import java.util.Scanner;

public class RoofQuote {
    public static void main(String[] args) {
        // Scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the shingles cost: ");
        // Cost per square foot
        double shingleCost = input.nextDouble();
        System.out.print("Enter the roof per sqft cost: ");
        // Square footage of roof
        double customerRoofSizeSqft = input.nextDouble();
        System.out.print("Enter the installation per sqft cost: ");
        // Installation cost per square foot
        double installation = input.nextDouble();
        // Calculate total
        final double HST = 1.13;
        double subTotal = shingleCost*customerRoofSizeSqft*installation;
        double calculateTotal = (shingleCost*customerRoofSizeSqft) + (installation * customerRoofSizeSqft);
        double total = subTotal * HST;
        double calculateSubTotal = calculateTotal * HST;

        // Output...
        System.out.printf("Sub Total: CAD $%.2f\n", calculateTotal);
        System.out.printf("Total (HST): CAD $%.2f", calculateSubTotal);
    }
}