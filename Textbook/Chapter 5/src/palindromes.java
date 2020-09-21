import java.util.Scanner;

public class palindromes {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter a string: ");
      String original = input.nextLine();

      // first, reverse the string
      char[] reverseArray = original.toCharArray();

      String reverse = "";

      for (int i = reverseArray.length - 1; i >= 0; i--) {
         reverse += reverseArray[i];
      }

      if (original.equalsIgnoreCase(reverse)) {
         System.out.println("It's a palindrome!");
      } else {
         System.out.println("It's not a palindrome...");
      }
   }
}
