/*
What is 1 + 7? (User inputs): 8
1 + 7 = 8 is true
 */

import java.util.Scanner;
import java.util.Random;

public class AdditionQuiz {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random rand = new Random();

      int rand_int_1 = rand.nextInt(10);
      int rand_int_2 = rand.nextInt(10);

      int answer = rand_int_1 + rand_int_2;

      System.out.print("What is " + rand_int_1 + " + " + rand_int_2 + "? ");
      int user = input.nextInt();

      if (answer != user) {
         System.out.println(rand_int_1 + " + " + rand_int_2 + " = " + user
                 + " is false.");
         System.out.println("The correct answer is: " + answer + ".");
      } else {
         System.out.println(rand_int_1 + " + " + rand_int_2 + " = " + user
                 + " is true.");
      }
   }
}
