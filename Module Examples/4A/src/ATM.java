import java.util.Scanner;

public class ATM {
   public static void main(String[] args) {
      double balance = 1000;

      do {
         Scanner input = new Scanner(System.in);

         System.out.print("Amount to withdraw: ");
         double withdraw = input.nextDouble();

         balance -= withdraw;
         System.out.println("New balance: " + balance);
      } while (balance >= 0);

      System.out.println("Sorry, you're out of money. ATM card confiscated.");
   }
}
