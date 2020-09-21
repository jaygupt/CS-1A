import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Mortgage {
   // main method
   public static void main(String[] args) {
      statePurpose();
      getInputComputeAndShowPayment();
      sayGoodbye();
   }

   // gives overview to user
   public static void statePurpose() {
      String instructions = "\nThe following program will calculate the \n"
              + "monthly payment required for a loan of D dollars \n"
              + "over a period of Y years at an annual \n"
              + "interest rate of R%.";
      System.out.println(instructions);
      System.out.println("---------------\n");
   }

   // does all the work - gets input, computes values, and outputs answer
   public static void getInputComputeAndShowPayment() {
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
      monthlyPayment =
              principal * (monthlyPaymentNumerator/monthlyPaymentDenominator);

      NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
      nf.setMaximumFractionDigits(2);

      System.out.println("Monthly Payment: $" + nf.format(monthlyPayment) +
              "\n");

   }

   // sign off
   public static void sayGoodbye() {
      System.out.println("Thanks for using the Foothill Mortgage Calculator" +
              ".\nWe hope you'll come back and see us again, soon.");
   }
}

/*
Sample Output:
Enter amount of the loan. (only use numbers,
please, no commas or characters like '$')
Your loan amount: 250000

Now enter the interest rate (If the quoted rate is  6.5%,
for example, enter 6.5 without the %.)
Your annual interest rate: 4.3

Enter term of the loan in years: 30
Monthly Payment: 1,237.18

Thanks for using the Foothill Mortgage Calculator.
We hope you'll come back and see us again, soon.
 */