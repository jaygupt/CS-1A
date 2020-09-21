import java.util.Scanner;

public class AnalyzeNumbers {
   static final int NUMBER_OF_ELEMENTS = 10;

   public static void main(String[] args) {
      // read 10 numbers
      double[] numbers = new double[NUMBER_OF_ELEMENTS];
      double sum = 0;

      Scanner input = new Scanner(System.in);
      for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
         System.out.print("Enter a new number: ");
         numbers[i] = input.nextDouble();
         sum += numbers[i];
      }

      // compute their average
      double average = sum / NUMBER_OF_ELEMENTS;

      // display how many numbers are above the average
      int numsAboveAverage = 0;
      for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
         if (numbers[i] > average) {
            numsAboveAverage++;
         }
      }

      System.out.println("\nAverage is: " + average);
      System.out.println("The number of elements above the average: " + numsAboveAverage);
   }
}
