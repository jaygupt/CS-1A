import java.util.Scanner;

public class FahrenheitToCelsius {
   public static void main(String[] args) {
      // Step 1: Take in Fahrenheit from user
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a degree in Fahrenheit: ");
      double f = input.nextDouble();
      // Step 2: Convert that value to Celsius
      double c = (f - 32) * 5 / 9;
      // Step 3: Display Celsius
      System.out.println("Fahrenheit " + f + " is " + c + " in Celsius.");
   }
}
