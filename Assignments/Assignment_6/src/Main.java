public class Main {
   public static void main(String[] args) {
      int gcd;

      gcd = computeGcd(150, 99);
      System.out.println("The first GCD is: " + gcd);

      gcd = computeGcd(3242, 12322);
      System.out.println("The second GCD is: " + gcd);

      gcd = computeGcd(1000, 750);
      System.out.println("The third GCD is: " + gcd);
   }

   public static int computeGcd(int firstNumber, int secondNumber) {
      int gcd = 1;
      for (int i = 2; i <= firstNumber && i <= secondNumber; i++) {
         if (firstNumber % i == 0 && secondNumber % i == 0) {
            gcd = i;
         }
      }
      return gcd;
   }
}
