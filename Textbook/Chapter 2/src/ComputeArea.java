import java.util.Scanner;

public class ComputeArea {
   public static void main(String[] args) {
      final double PI = 3.14159;
      // Write a program, given the radius, calculates the area of a circle

      // Area of a circle = pi * r^2 = pi * r * r

      // First: take radius from user
      Scanner input = new Scanner(System.in);
      System.out.print("What is the radius of the circle? ");
      double radius = input.nextDouble();

      // Second: calculate area
      double area = PI * radius * radius;

      // Third: display area
      System.out.println("If a circle's radius is " + radius + ", the area of" +
              " the circle is " + area);
   }
}
