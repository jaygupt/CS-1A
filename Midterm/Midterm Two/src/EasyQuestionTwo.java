import java.util.Scanner;

public class EasyQuestionTwo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in); // Scanner class object
      StringBuilder builder = new StringBuilder(); // StringBuilder class object

      System.out.print("Enter an integer: ");
      int myInteger = input.nextInt();

      while (myInteger > 0) {
         builder.append(myInteger % 10);
      }
   }
}
