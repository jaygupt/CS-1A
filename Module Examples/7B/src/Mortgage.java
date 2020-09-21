import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Mortgage {
   public static void main(String[] args) {
      double answer;
      MortgageData loan;

      statePurpose();
      loan = getInput();
      answer = computeMonthlyPayment(loan);
      reportResults(answer);
   }

   public static void statePurpose() {
      String instructions;

      instructions = "\nThe following program will calculate the \n"
              + "monthly payment  required for a loan of D dollars \n"
              + "over a period of Y years at an annual \n"
              + "interest rate of R%.";
      System.out.println(instructions);
      System.out.println("---------------\n");
   }

   // returns a reference to a MortgageData object
   public static MortgageData getInput() {
      Scanner input = new Scanner(System.in);
      String prompt, strUserResponse;
      double dblResponse;
      MortgageData userData = new MortgageData();

      // get principal
      do {
         prompt = "\nEnter amount of the loan. (only use numbers, \n"
                 + "please, no commas or characters like '$')\n"
                 + "Your loan amount: ";
         System.out.print(prompt);
         strUserResponse = input.nextLine();
         dblResponse = Double.parseDouble(strUserResponse);
      } while (!userData.setPrincipal(dblResponse));

      // get interest
      do {
         prompt = "\nNow enter the interest rate (If the quoted rate is "
                 + " 6.5%, \nfor example, enter 6.5 without the %.)\n"
                 + "Your annual interest rate: ";
         System.out.print(prompt);
         strUserResponse = input.nextLine();
         dblResponse = Double.parseDouble(strUserResponse);
      } while (!userData.setRate(dblResponse));

      // get length of loan (in years)
      do {
         prompt = "\nEnter term of the loan in years: ";
         System.out.print(prompt);
         strUserResponse = input.nextLine();
         dblResponse = Double.parseDouble(strUserResponse);
      } while (!userData.setYears(dblResponse));

      return userData;
   }

   public static double computeMonthlyPayment (MortgageData loan) {
      // local variables needed
      double dblTemp, dblPmt, dblMonths, dblMoRt;

      // years to months
      dblMonths = loan.getYears() * 12;

      // rate to decimal and months
      dblMoRt = loan.getRate() / (100 * 12);

      // use formula to get result
      dblTemp = Math.pow(1 + dblMoRt, dblMonths);
      dblPmt = loan.getPrincipal() * dblMoRt * dblTemp / (dblTemp - 1);

      // return the computed payment
      return dblPmt;
   }

   // sign off
   public static void reportResults(double results) {
      String signoff;
      NumberFormat bucks = NumberFormat.getCurrencyInstance(Locale.US);

      signoff = "\nThanks for using the Foothill Mortgage Calculator. \n"
              + "We hope you'll come back and see us again, soon.";

      System.out.println("\nMonthly Payment: " + bucks.format(results));
      System.out.println(signoff);
   }
}