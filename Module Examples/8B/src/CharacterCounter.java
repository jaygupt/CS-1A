class CharacterCounter
{
   private Frequency letters;
   private String userString;

   public CharacterCounter(String str)
   {
      // instantiate a Frequency object of this instance
      letters = new Frequency(26);

      // convert string to uppercase for internal storage
      if (str != null && str.length() >=1 )
         userString = str.toUpperCase();
      else
         userString = "";
      countOccurrences();
   }

   private void countOccurrences()
   {
      char let;
      int k;

      // letters[] automatically initialized to all 0s
      // scan the string and increment as we go
      for (k = 0; k < userString.length(); k++)
      {
         let = userString.charAt(k);
         letters.increment( let - 'A' );
      }
   }

   public long getCount(char let)
   {
      char upLet;
      upLet = Character.toUpperCase(let);
      return letters.get(upLet - 'A');
   }
}

