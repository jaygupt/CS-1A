import java.lang.reflect.Array;
import java.util.ArrayList;

public class Primes {
   public static void main(String[] args) {
      final int num_of_primes = 50;
      final int num_of_primes_per_line = 10;
      int count = 0; // number of prime #s
      int number = 2; // number to be tested for primeness

      while (count < num_of_primes) {
         boolean isPrime = true;

         for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
               isPrime = false;
               break;
            }
         }

         if (isPrime) {
            count++;

            if (count % num_of_primes_per_line == 0) {
               System.out.println(number);
            } else {
               System.out.print(number + " ");
            }

         }
         number++;
      }
   }
}
