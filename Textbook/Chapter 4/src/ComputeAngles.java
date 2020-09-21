/*
Input: Three Points
Expected Output: Angles of the formed triangle

Get the three points as input (check)
Find the side lengths of the triangle (check)
   distance formula

2. Find the angles given the side lengths
   cosine formula

   print angles
 */

import java.util.Scanner;

public class ComputeAngles {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // get the points
      System.out.println("Enter three points like so: " +
              "x1 y1 x2 y2 x3 y3");
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      double x3 = input.nextDouble();
      double y3 = input.nextDouble();

      // get the side lengths
      double a = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
      double b = Math.sqrt(Math.pow((x2-x3), 2) + Math.pow((y2-y3), 2));
      double c = Math.sqrt(Math.pow((x3-x1), 2) + Math.pow((y3-y1), 2));

      // get the angles
      double A = Math.toDegrees(Math.acos(num(a, b, c)/denom(b, c)));
      double B = Math.toDegrees(Math.acos(num(b, a, c)/denom(a, c)));
      double C = Math.toDegrees(Math.acos(num(c, a, b)/denom(a, b)));

      System.out.println("The three angles are: " +
              Math.round(A * 100) / 100.0 + " "
              + Math.round(B * 100) / 100.0 + " "
              + Math.round(C * 100) / 100.0);
   }

   public static double num(double side1, double side2, double side3) {
      double num = Math.pow(side1, 2) - Math.pow(side2, 2) - Math.pow(side3, 2);
      return num;
   }

   public static double denom(double side1, double side2) {
      double denom = -2 * side1 * side2;
      return denom;
   }
}
