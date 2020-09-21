import java.util.Random;
import java.util.Scanner;

public class Lottery {
   public static void main(String[] args) {
      Random random = new Random();

      // generates two nums from 0 to 9
      int lotteryTens = random.nextInt(10);
      int lotteryOnes = random.nextInt(10);

      Scanner input = new Scanner(System.in);

      System.out.print("Enter your lottery pick (two digits): ");
      int userNum = input.nextInt();

      int tens = userNum / 10;
      int ones = userNum % 10;

      System.out.println("The lottery number is " + lotteryTens + lotteryOnes);

      if (tens == lotteryTens && ones == lotteryOnes) {
         System.out.println("Exact Match! You win $10,000!");
      } else if (tens == lotteryOnes && ones == lotteryTens) {
         System.out.println("Matched the digits! You win $1,000!");
      } else if (tens == lotteryTens || tens == lotteryOnes || ones == lotteryOnes
      || ones == lotteryTens) {
         System.out.println("Match one digit! You win $100!");
      } else {
         System.out.println("Sorry...No match. Play again next time!");
      }
   }
}
