import java.util.Scanner;

public class gcd {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter first integer: ");
      int first = input.nextInt();

      System.out.print("Enter second integer: ");
      int second = input.nextInt();

      int gcd = 1;
      int k = 2;

      while (k <= first && k <= second) {
         if (first % k == 0 && second % k == 0) {
            gcd = k;
         }
         k++;
      }

      System.out.println("The greatest common divisor is " + gcd + ".");
   }
}
