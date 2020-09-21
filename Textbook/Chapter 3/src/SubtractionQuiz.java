import java.util.Scanner;

public class SubtractionQuiz {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int num1 = (int) (Math.random() * 11);
      int num2 = (int) (Math.random() * 11);

      // if num2 is the bigger number
      if (num1 < num2) {
         int temp = num2; // capture the larger value in temp
         num2 = num1; // num2 becomes the smaller value
         num1 = temp; // num1 becomes the larger value
      }
      int answer = num1 - num2;
      System.out.print("What is " + num1 + " - " + num2 + "? ");
      int user = input.nextInt();

      if (user != answer) {
         System.out.println("Your answer is wrong.");
         System.out.println(num1 + " - " + num2 + " is " + answer + ".");
      } else {
         System.out.println("You are correct!");
      }
   }
}
