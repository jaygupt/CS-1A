import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Mortgage_V4 {
   static double principal, rate, years;
   static Scanner input;

   public static void main(String[] args) {
      input = new Scanner(System.in);
      double answer;
      statePurpose();
      getInput();
      answer = computeMonthlyPayment();
      reportResults(answer);
      input.close();
   }

   // gives overview to user
   public static void statePurpose() {
      String instructions;

      instructions =
              "The following program will calculate the \n"
                      + "monthly payment  required for a loan of D dollars \n"
                      + "over a period of Y years at an annual \n"
                      + "interest rate of R%.";
      System.out.println(instructions);
      System.out.println("---------------\n");
   }

   // gets input, stores values in static class variables
   public static void getInput() {
      String prompt;

      // get principal
      prompt = "\nEnter amount of the loan. (only use numbers, \n"
              + "please, no commas or characters like '$')\n"
              + "Your loan amount: ";
      System.out.print(prompt);
      principal = input.nextDouble();

      // get interest
      prompt = "\nNow enter the interest rate (If the quoted rate is "
              + " 6.5%, \nfor example, enter 6.5 without the %.)\n"
              + "Your annual interest rate: ";
      System.out.print(prompt);
      rate = input.nextDouble();

      // get year length of loan
      prompt = "\nEnter term of the loan in years: ";
      System.out.print(prompt);
      years = input.nextDouble();
   }

   // computes and returns answer
   static double computeMonthlyPayment() {
      // local variables needed only in this method
      double dblTemp, dblPmt, dblMonths, dblMoRt;

      // convert years to months
      dblMonths = years * 12;

      // convert rate to decimal and months
      dblMoRt = rate / (100 * 12);

      // use formula to get result
      dblTemp = Math.pow(1 + dblMoRt, dblMonths);
      dblPmt = principal * dblMoRt * dblTemp
              / ( dblTemp - 1 );

      // now that we have computed the payment, return it
      return dblPmt;
   }

   // sign off
   public static void reportResults(double result)
   {
      String signOff;
      NumberFormat bucks =
              NumberFormat.getCurrencyInstance(Locale.US);

      signOff =
              "\nThanks for using the Foothill Mortgage Calculator. \n"
                      + "We hope you'll come back and see us again, soon.";

      System.out.println("Monthly Payment: "
              + bucks.format(result));
      System.out.println(signOff);
   }
}
