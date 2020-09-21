import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Mortgage_V2 {
   public static void main(String[] args) {
      double answer;
      greet();
      answer = computeMonthlyPayment();
      NumberFormat tidy = NumberFormat.getInstance(Locale.US);
      tidy.setMaximumFractionDigits(2);
      System.out.println("Monthly Payment: $" + tidy.format(answer));

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

   public static double computeMonthlyPayment() {
      Scanner input = new Scanner(System.in);

      double principal, annualRate, years, monthlyPayment;

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
      double monthlyInterestRate = annualRate / 12;
      monthlyInterestRate /= 100;

      // get the years
      System.out.print("\nEnter term of the loan in years: ");
      years = input.nextDouble();
      double months = years * 12;

      double monthlyPaymentNumerator =
              monthlyInterestRate * Math.pow((1 + monthlyInterestRate),
                      months);
      double monthlyPaymentDenominator = Math.pow((1 + monthlyInterestRate),
              months) - 1;
      return monthlyPayment =
              principal * (monthlyPaymentNumerator/monthlyPaymentDenominator);
   }

   public static void sayGoodbye() {
      String signoff;
      signoff =
              "\nThanks for using the Foothill Mortgage Calculator. \n"
                      + "We hope you'll come back and see us again, soon.";
      System.out.println(signoff);
   }
}
