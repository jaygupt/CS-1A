import java.util.Scanner;

public class DigitsOfNumber{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter a number: ");
      int number = input.nextInt();
      printDigits(number);
   }

   public static void printDigits(int number) {
      System.out.print("The digits of " + number + " are: ");
      while (number > 0) {
         System.out.print(number % 10 + " ");
         number /= 10;
      }
   }
}
