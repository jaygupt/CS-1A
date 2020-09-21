public class Main {
   public static void main(String[] args) {
      int k;
      Frequency letters = new Frequency(26);

      // this block should leave a 27 in letters[2]
      for (k = 0; k < 28; k++) {
         letters.increment(2);
      }
      letters.decrement(2);

      // this block should leave a 59 in letters[25]
      for (k = 0; k < 59; k++) {
         letters.increment('Z' - 'A'); // this is 25
      }

      // illegal accesses
      letters.decrement(500);
      letters.increment(-3);

      // display whole table, going "too far"
      for (k = -3; k < 30; k++) {
         // every 5 items, generate a newline
         if (k % 5 == 0) {
            System.out.println("");
         }

         System.out.print(k + ": " + letters.get(k) + "      ");
      }
   }
}
