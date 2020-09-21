class Contact
{
   private String name;
   private Phone phone;

   // static constants
   static final int VALID_NUM_LEN_SHORT = 7;
   static final int VALID_NUM_LEN_LONG = 10;
   static final String INVALID_STRING_MSG = "(invalid phone number)";
   static final int POS_OF_DASH_IN_PHONENUM = 3;
   static final int POS_OF_RT_PAREN_IN_AREA_CODE = 3;
   static final int START_OF_LASTFOUR_IN_PHONENUM = 4;

   public Contact(String inName, String inPhone)
   {
      name = new String(inName);
      phone = new Phone(inPhone);
   }

   public String getName()
   {
      return name;
   }

   public String getPhone()
   {
      return phone.toString();
   }

   // inner class Phone used by class Contact only
   private class Phone
   {
      String number;

      Phone(String inNum)
      {
         char nextDigit;
         int k;

         // store only digits "213-555-1212" becomes "2135551212"
         for (k = 0, number = ""; k < inNum.length(); k++)
         {
            nextDigit = inNum.charAt(k);
            if (Character.isDigit(nextDigit))
               number = number + nextDigit;
         }
      }

      // returns properly formed number (AAA)PPP-FFFF or PPP-FFFF
      public String toString()
      {
         int nextDigit, j;
         String retStr;

         if (number.length() != VALID_NUM_LEN_SHORT
                 && number.length() != VALID_NUM_LEN_LONG)
            return INVALID_STRING_MSG;

         retStr = "";
         // if full 10 digit number, use parens for area code
         nextDigit = 0;
         if ( number.length() == VALID_NUM_LEN_LONG)
         {
            retStr += "(";
            for ( j = 0; j < POS_OF_RT_PAREN_IN_AREA_CODE; j++, nextDigit++ )
               retStr += number.charAt(nextDigit);
            retStr += ")";
         }
         // either way, hyphenate 7 digit number (don't reset nextDigit)
         for ( j = 0; j < POS_OF_DASH_IN_PHONENUM; j++, nextDigit++ )
            retStr += number.charAt(nextDigit);
         retStr += "-";
         for (j = 0; j < START_OF_LASTFOUR_IN_PHONENUM; j++, nextDigit++)
            retStr += number.charAt(nextDigit);

         return retStr;
      }
   }
}
