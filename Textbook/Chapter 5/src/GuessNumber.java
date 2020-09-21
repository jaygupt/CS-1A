import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
   public static void main(String[] args) {
      Random random = new Random();
      Scanner input = new Scanner(System.in);

      // random number from 1 to 100
      int theNum = random.nextInt(100) + 1;

      while(true) {
         System.out.print("Guess a number between 1 to 100: ");
         int userNumber = input.nextInt();
         if (userNumber < theNum) {
            System.out.println("Too low!");
            continue;
         } else if (userNumber > theNum) {
            System.out.println("Too high!");
            continue;
         } else {
            System.out.println("You found the number!");
            break;
         }
      }
   }
}
