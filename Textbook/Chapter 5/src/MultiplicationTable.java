/*
Create a multiplication table from 1 to 9

first, create the top:

7 spaces, number, 3 spaces, number, until 9 is hit

 */

public class MultiplicationTable {
   public static void main(String[] args) {
      // top
      System.out.println("\n           Multiplication Table");
      String myString = new String(new char[7]).replace("\0", " ");
      System.out.print(myString);

      for (int i = 1; i <= 9; i++) {
         System.out.print(i + "   ");
      }
      String dashedLine = new String(new char[40]).replace("\0", "-");
      System.out.println("\n" + dashedLine);

      for (int i = 1; i <= 9; i++) {
         System.out.print(i + "|  ");
         for (int z = 1; z <= 9; z++) {
            System.out.printf("%4d", i * z);
         }
         System.out.println();
      }
   }
}
