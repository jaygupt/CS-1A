import java.util.Scanner;
import java.lang.StringBuilder;

public class Question_Two {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();

      System.out.print("Please enter an integer: ");
      int userInt = input.nextInt(); // in integer form

      while (userInt > 0) {
         sb.append(userInt % 10);
         userInt /= 10;
      }

      // reverse sb
      sb = sb.reverse();

      System.out.println("string = " + sb);
   }
}