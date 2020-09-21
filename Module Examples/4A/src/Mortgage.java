public class Mortgage {
   public static void main(String[] args) {
      double principal = 465264;
      int numMonths = 0;
      double monthlyRate = .06/12;
      double myPayment = 3248;

      while (principal > 0) {
         principal *= (1 + monthlyRate);
         principal -= myPayment;
         numMonths++;
         if (numMonths % 12 == 0) {
            System.out.println("Balance after " + numMonths + " months: " + principal);
         }
      }

      double mySavings = 300 * 2998 - numMonths * myPayment;
      System.out.println("You payed off the loan in " + numMonths + " months.");
      System.out.println("You paid it off " + (300 - numMonths) + " " +
              "months early.");
      System.out.println("You saved $" + mySavings + ".");
   }
}
