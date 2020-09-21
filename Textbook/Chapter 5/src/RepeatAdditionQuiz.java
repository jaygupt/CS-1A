/*
Asks the user a simple math problem
if user gets correct, say you got it
else, wrong answer, try again
repeat until user gets it correct.
 */


import java.util.Random;
import java.util.Scanner;

public class RepeatAdditionQuiz {
   public static void main(String[] args) {
      Random random = new Random();

      // create two numbers from 0 to 9 (inclusive)
      int digit1 = random.nextInt(10);
      int digit2 = random.nextInt(10);

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
}
