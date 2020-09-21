/*
Asks the user a simple math problem
if user gets correct, say you got it
else, wrong answer, try again
repeat until user gets it correct.
 */


import java.util.Random;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class RepeatAddOrSubtract {
   public static void main(String[] args) {
      while (true) {
         char noError = prompt();
         if (noError == 'a') {
            System.out.println("You chose to add.");
            add();
            char again = again();
            while (again == 'y') {
               add();
               again = again();
            }
            System.out.println("Bye!");
            break;
         } else if (noError == 's') {
            System.out.println("You chose to subtract.");
            subtract();
            char again = again();
            while (again == 'y') {
               subtract();
               again = again();
            }
            System.out.println("Bye!");
            break;
         } else {
            System.out.println("I didn't understand that. Please repeat.");
            continue;
         }
      }
   }

   public static char again() {
      System.out.print("Would you like to do another one? (Y or N) ");
      Scanner input = new Scanner(System.in);
      String again = input.next();
      if(toLowerCase(again.charAt(0)) == 'y') {
         return 'y';
      } else {
         return 'n';
      }
   }

   public static char prompt() {
      Scanner input = new Scanner(System.in);

      System.out.print("Would you like to add or subtract? ");
      String userChoice = input.next();
      char noError = toLowerCase(userChoice.charAt(0));
      return noError;
   }

   public static int[] getTwoNumbers() {
      Random random = new Random();

      int[] nums = new int[2];
      nums[0] = random.nextInt(10);
      nums[1] = random.nextInt(10);

      return nums;
   }

   public static void add() {
      int[] addArray = getTwoNumbers();
      int digit1 = addArray[0];
      int digit2 = addArray[1];

      int answer = digit1 + digit2;
      String message = "What is " + digit1 + " + " + digit2 + "? ";
      String incorrectMessage = "Incorrect. " + message;

      Scanner input = new Scanner(System.in);
      System.out.print(message);
      int userAnswer = input.nextInt();

      while (userAnswer != answer) {
         System.out.print(incorrectMessage);
         userAnswer = input.nextInt();
      }
      System.out.println("Correct!");
   }

   public static void subtract() {
      int[] addArray = getTwoNumbers();
      int digit1 = addArray[0];
      int digit2 = addArray[1];

      int answer = Math.abs(digit1 - digit2);

      String message = "";
      if (digit1 > digit2) {
         message = "What is " + digit1 + " - " + digit2 + "? ";
      } else {
         message = "What is " + digit2 + " - " + digit1 + "? ";
      }
      String incorrectMessage = "Incorrect. " + message;

      Scanner input = new Scanner(System.in);
      System.out.print(message);
      int userAnswer = input.nextInt();

      while (userAnswer != answer) {
         System.out.print(incorrectMessage);
         userAnswer = input.nextInt();
      }
      System.out.println("Correct!");
   }
}
