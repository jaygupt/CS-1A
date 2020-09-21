import java.util.Scanner;

public class Test {
   // main method
   public static void main(String[] args) {
      statePurpose();
   }

   // gives overview to user
   public static void statePurpose() {
      String instructions = "The following program will calculate the \n"
              + "monthly payment required for a loan of D dollars \n"
              + "over a period of Y years at an annual \n"
              + "interest rate of R%.";
      System.out.println(instructions);
      System.out.println("---------------\n");
   }

   // does all the work - gets input, computes values, and outputs answer
   public static void getInputComputeAndShowPayment() {
      Scanner input = new Scanner(System.in);

      String prompt, userResponse;
      double principal, rate, years, mortgage, months;
      double temporary, payment;


   }

   // sign off
   public static void sayGoodbye() {
      // body of this method omitted for now
   }
}
