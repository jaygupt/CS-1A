import java.util.Scanner;

public class cylinder_volume {
   public static void main(String[] args) {
      // * compute volume of a cylinder *

      // set variables
      final double PI = 3.14;

      // first, read in height and radius
      Scanner input = new Scanner(System.in);

      System.out.print("What is the height of the cylinder? ");
      double h = input.nextDouble();

      System.out.print("What is the radius of the cylinder? ");
      double r = input.nextDouble();

      // compute volume
      double V = PI * r * r * h;

      // print output
      System.out.println("\nThe volume of the cylinder is " + V);
   }
}
