public class Main {
   public static void main(String[] args) {
      Student[] myClass = { new Student("smith","fred", 95),
              new Student("bauer","jack",123),
              new Student("jacobs","carrie", 195),
              new Student("renquist","abe",148),
              new Student("3ackson","trevor", 108),
              new Student("perry","fred",225),
              new Student("loceff","fred", 44),
              new Student("stollings","pamela",452),
              new Student("charters","rodney", 295),
              new Student("cassar","john",321),
      };

      StudentArrayUtilities.printArray("The Array to be Searched: ", myClass);

      String first, last;
      int found;

      first = "pamela";
      last = "stollings";

      found = StudentArrayUtilities.arraySearch(myClass, first, last);
      if (found >= 0) {
         System.out.println(first + " " + last + " IS in list at position " + found);
      } else {
         System.out.println(first + " " + last + " is NOT in list.");
      }

      first = "pamela";
      last = "jacobs";

      found = StudentArrayUtilities.arraySearch(myClass, first, last);
      if (found >= 0) {
         System.out.println(first + " " + last + " IS in list at position " + found);
      } else {
         System.out.println(first + " " + last + " is NOT in list.");
      }

      first = "carrie";
      last = "jacobs";
      found = StudentArrayUtilities.arraySearch(myClass, first, last );
      if ( found >= 0 )
         System.out.println( first + " " + last
                 + " IS in list at position " + found);
      else
         System.out.println( first + " " + last + " is NOT in list.");
   }
}
