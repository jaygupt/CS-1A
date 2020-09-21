import java.util.Scanner;

public class Test {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Give me a number greater than or equal to 20. ");
      int userInput = input.nextInt();

      while (userInput < 20) {
         System.out.print(userInput + " isn't greater than or equal to 20! " +
                 "Try again: ");
         userInput = input.nextInt();
      }
      System.out.println("Good day!!");
   }
}
