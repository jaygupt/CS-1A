import java.util.Scanner;

public class SimpleIfDemo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter an integer: ");
      int user = input.nextInt();

      if (user % 5 == 0 && user % 2 == 0) {
         System.out.println("HiFive");
         System.out.println("HiEven");
      } else if (user % 2 == 0) {
         System.out.println("HiEven");
      } else {
         System.out.println("HiOdd");
      }
   }
}
