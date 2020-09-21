import java.util.Scanner;

public class ComputeAverage {
   public static void main(String[] args) {
      // The program takes three numbers from the user, and prints the average

      // Step 1: ask the user for three numbers
      Scanner input = new Scanner(System.in);
      System.out.print("Enter three numbers: ");
      double number1 = input.nextDouble();
      double number2 = input.nextDouble();
      double number3 = input.nextDouble();

      // Step 2: calculate average
      double average = (number1 + number2 + number3) / 3;

      // Step 3: Output the average
      System.out.println("The average of " + number1 + ", " + number2 + ", " +
              "and " + number3 + " is " + average);
   }
}
