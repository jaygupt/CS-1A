import java.util.Scanner;

public class BMI {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter weight in pounds: ");
      double pounds = input.nextDouble();

      System.out.print("Enter height in inches: ");
      double inches = input.nextDouble();

      // BMI Formula: weight in kilos / h in meters squared
      double kilos = pounds / 2.205;
      double meters = inches / 39.37;

      // BMI calculation
      double BMI = kilos / (meters * meters);

      System.out.println("BMI is " + BMI);
      if (BMI < 18.5) {
         System.out.println("Underweight");
      } else if (BMI >= 18.5 && BMI < 25.0) {
         System.out.println("Normal");
      } else if (BMI >= 25.0 && BMI < 30.0) {
         System.out.println("Overweight");
      } else {
         System.out.println("Obese");
      }
   }
}
