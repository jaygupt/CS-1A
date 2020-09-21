import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
1. Greet (done)
2. Get Input (done)
3. Compute Monthly Payment (done)
4. Display Output (done)
5. Say Goodbye
 */

public class Mortgage_V3 {

   static double principal, annualRate, years;
   static double monthlyPayment;
   static Scanner input;

   public static void main(String[] args) {
      greet();
      input = new Scanner(System.in);
      getInput();
      input.close();
      computeMonthlyPayment();
      displayOutput();
      sayGoodbye();
   }

   public static void greet() {
      String instructions;
      instructions =
              "The following program will calculate the \n"
                      + "monthly payment required for a loan of D dollars \n"
                      + "over a period of Y years at an annual \n"
                      + "interest rate of R%.";
      System.out.println(instructions);
      System.out.println("---------------\n");
   }

   public static void getInput() {
      // get the principal
      System.out.println("Enter amount of the loan. (only use numbers,\n" +
              "please, no commas or characters like '$'");
      System.out.print("Your loan amount: ");
      principal = input.nextDouble();

      // get the annual interest rate
      System.out.println("\nNow enter the interest rate (If the quoted rate " +
              "is 6.5%,\nfor example, enter 6.5 without the %.");
      System.out.print("Your annual interest rate: ");
      annualRate = input.nextDouble();

      // get the years
      System.out.print("\nEnter term of the loan in years: ");
      years = input.nextDouble();
   }

   public static void computeMonthlyPayment() {
      double monthlyInterestRate = annualRate / 12;
      monthlyInterestRate /= 100;
      double months = years * 12;
      double monthlyPaymentNumerator = monthlyInterestRate * Math.pow((1 + monthlyInterestRate), months);
      double monthlyPaymentDenominator = Math.pow((1 + monthlyInterestRate), months) - 1;
      monthlyPayment = principal * (monthlyPaymentNumerator/monthlyPaymentDenominator);
   }

   public static void displayOutput() {
      NumberFormat tidy = NumberFormat.getInstance(Locale.US);
      tidy.setMaximumFractionDigits(2);
      System.out.println("Monthly Payment: $" + tidy.format(monthlyPayment));
   }

   public static void sayGoodbye() {
      String signOff;
      signOff = "\nThanks for using the Foothill Mortgage Calculator. \n"
                      + "We hope you'll come back and see us again, soon.";
      System.out.println(signOff);
   }
}
