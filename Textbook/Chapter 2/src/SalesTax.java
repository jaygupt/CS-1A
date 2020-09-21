import java.util.Scanner;

public class SalesTax {
   public static void main(String[] args) {
      // Program takes in purchase amount, sales tax rate, and outputs tax
      // and total

      // Step 1: Take in purchase amount and tax rate (in percent)
      Scanner input = new Scanner(System.in);
      System.out.print("What was the purchase amount: ");
      double amount = input.nextDouble();
      System.out.print("What was the tax rate (in percent): ");
      double taxRate = input.nextDouble();

      // Convert the tax rate from percent to decimal
      taxRate /= 100;

      // Step 2: Compute the tax amount and total
      double taxAmount = taxRate * amount;
      double total = amount + taxAmount;

      // Step 3: Output the purchase amount, the tax, and the total
      System.out.println("The purchase amount is: " + amount + "\n The tax " +
              "is: " + taxAmount + ", and the total is " + total);
   }
}
