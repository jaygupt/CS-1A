import java.util.Scanner;

public class LottoNumbers {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      boolean[] isCovered = new boolean[99]; // default is false

      int number = 0;

      do {
         System.out.print("Enter a number: ");
         number = input.nextInt();
         if (number < 0 || number > 99) {
            System.out.println("Number out of range. Try again.");
         } else if (number == 0) {
            break;
         } else {
            // add to array
            isCovered[number - 1] = true;
            System.out.println("Added to array.");
         }
      } while (true);

      boolean allCovered = true;
      for (int i = 0; i < isCovered.length; i++) {
         if (!isCovered[i]) {
            allCovered = false; // one number isn't covered
            break;
         }
      }

      if (allCovered) {
         System.out.println("The tickets cover all numbers.");
      } else {
         System.out.println("The tickets don't cover all numbers.");
      }
   }
}
