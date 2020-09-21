import java.util.Scanner;

public class Sample
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter a phrase or sentence: ");
      String userPhrase = input.nextLine();

      // create a CharacterCounter object for this phrase
      CharacterCounter freq = new CharacterCounter(userPhrase);

      // display whole table
      for (char let = 'A'; let <= 'Z'; let++)
      {
         // every 5 items, generate a newline
         if ( (let - 'A') % 5 == 0)
            System.out.println("");

         System.out.print( let + ": " + freq.getCount(let) + "      ");
      }
   }
}