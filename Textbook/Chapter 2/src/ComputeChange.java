import java.util.Scanner;

public class ComputeChange {
   public static void main(String[] args) {
      // Program takes in a double value representing dollars and cents
      // computes max number of dollars, quarters, dimes, nickels, pennies
      // to result in minimum number of coins

      // Step 1: Take in value
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an amount, for example, $11.56: $");
      double amount = input.nextDouble();

      // Step 2: Multiply amount by 100
      int theAmount = (int) (amount * 100);

      // Step 3: Find dollars and cents
      int dollars = theAmount / 100;
      int cents = theAmount % 100;

      int remainingAmount = cents;
      int quarters = cents / 25;
      remainingAmount %= 25;
      int dimes = remainingAmount / 10;
      remainingAmount %= 10;
      int nickels = remainingAmount / 5;
      remainingAmount %= 5;
      int pennies = remainingAmount;

      System.out.println("\nYour amount of $" + amount + " consists of:");
      System.out.println("\t" + dollars + " dollars and " + cents + " cents" +
              ".\n");
      System.out.println("The " + cents + " cents can be broken up as " +
              "follows:");
      System.out.println("\t" + quarters + " quarters");
      System.out.println("\t" + dimes + " dimes");
      System.out.println("\t" + nickels + " nickles");
      System.out.println("\t" + pennies + " pennies");
   }
}
