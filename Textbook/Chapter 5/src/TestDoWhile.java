import java.util.Scanner;

public class TestDoWhile {
   public static void main(String[] args) {
      int theInt;
      int sum = 0;

      Scanner input = new Scanner(System.in);

      do {
         System.out.print("Enter an integer (the loop ends if it is 0): ");
         theInt = input.nextInt();
         sum += theInt;
      } while (theInt != 0);

      System.out.println("The sum is " + sum);
   }
}
