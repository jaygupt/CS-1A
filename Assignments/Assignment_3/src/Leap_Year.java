/*
Jay Gupta
Assignment 3
1/22/2020
Leap_Year.java
 */

import java.util.Scanner;

public class Leap_Year {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int year;
      boolean isLeapYear;

      System.out.println("This program will determine if a year is a leap " +
              "year.");

      System.out.print("Please enter a year: ");
      year = input.nextInt();

      isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

      if (isLeapYear) {
         System.out.println(year + " is a leap year.");
      } else {
         System.out.println(year + " isn't a leap year.");
      }
   }
}
