/*
The program takes in integers
if the int is 0, it ends
   it calculates the sum of all the integers previous and outputs the value

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SentinelValue {
   public static void main(String[] args) {
      List<Integer> numArray = new ArrayList<Integer>();
      Scanner input = new Scanner(System.in);

      System.out.print("Enter an integer (input ends if it is 0): ");
      int nextNumber = input.nextInt();

      while (nextNumber != 0) {
         numArray.add(nextNumber);
         System.out.print("Enter an integer (input ends if it is 0): ");
         nextNumber = input.nextInt();
      }

      int sum = 0;

      for (int num: numArray) {
         sum += num;
      }

      System.out.println("The sum is " + sum);
   }
}
