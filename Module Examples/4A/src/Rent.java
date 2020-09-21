public class Rent {
   /*
   You rent a house at $1700 per month.  You can expect the rent to increase, on average, 5% per year.
   After five years, how much have you spent on rent?  The first year is easy:  $1700 * 12.
   But for the second year we have to multiply 1700 by 1.05 to get the new rent, and the years after that require
   even more computation.
    */
   public static void main(String[] args) {
      double rentPerMonth = 1700;
      double yearlyRate = 1.05;
      double numOfYears = 5;

      double total = 0;

      for (int i = 1; i <= numOfYears; i++) {
         total += (rentPerMonth * 12);
         rentPerMonth *= yearlyRate;
      }

      System.out.println("The total after " + numOfYears + " years is " +
              "$" + total);
   }
}
