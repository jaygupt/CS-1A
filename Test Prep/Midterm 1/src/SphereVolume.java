import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class SphereVolume {
   public static void main(String[] args) {
      double radius = getRadius();
      double volume = computeVolume(radius);
      displayVolume(volume);
   }

   public static double getRadius() {
      Scanner input = new Scanner(System.in);

      System.out.print("Please input the radius of the sphere: ");
      double radius = input.nextDouble();

      return radius;
   }

   public static double computeVolume(double radius) {
      double volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;
      return volume;
   }

   public static void displayVolume(double volume) {
      double roundedVolume = returnRounded(volume);
      System.out.println("The volume of the sphere is " + roundedVolume + ".");
   }

   public static double returnRounded(double number) {
      BigDecimal bd = BigDecimal.valueOf(number);
      bd = bd.setScale(2, RoundingMode.HALF_UP);
      return bd.doubleValue();
   }
}
