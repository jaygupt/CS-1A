import java.util.Scanner;

public class DisplayTime {
   public static void main(String[] args) {
      // Program takes in seconds, and converts it to the number of minutes
      // and leftover seconds

      // Step 1: Take in seconds as integer
      Scanner input = new Scanner(System.in);
      System.out.print("Enter seconds as an integer: ");
      int seconds = input.nextInt();
      // 70 / 60 = 1 R10
      // Step 2: Divide number of seconds by 60, that equals minutes
      int minutes = seconds / 60;
      // Step 3: Take modulus of seconds by 60, that equals leftover seconds
      int leftOver = seconds % 60;
      // Step 4: Output the user's seconds, how many minutes that is, and
      // leftover seconds
      System.out.println(seconds + " seconds is " + minutes + " " +
              "minutes" + " and " + leftOver + " seconds.");
   }
}
